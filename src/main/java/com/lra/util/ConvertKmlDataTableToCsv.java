package com.lra.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.lra.util.model.kml.DataType;
import com.lra.util.model.kml.KmlType;
import com.lra.util.model.kml.PlacemarkType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by laurenra on 9/2/16.
 */
public class ConvertKmlDataTableToCsv {

    private static final Logger LOG = LoggerFactory.getLogger(ConvertKmlDataTableToCsv.class);

    public KmlType unmarshalXmlFromFile(File kmlFile) {
        KmlType kmlType = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(KmlType.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            kmlType = (KmlType) jaxbUnmarshaller.unmarshal(kmlFile);
//            System.out.println("kml data = \n" + kmlType.toString()); // testing only
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return kmlType;
    }

    public List<String> convertToCsv(KmlType kmlType) {
        List<String> csvRowList = new ArrayList<String>();

        List<PlacemarkType> placemarkList = kmlType.getDocument().getPlacemark();
        LOG.info("Placemark list size = " + placemarkList.size());
        LOG.info("Placemark list = " + placemarkList.toString());

        // Get header (column names), only do it once.
        List<DataType> headerDataList = placemarkList.get(0).getExtendedData().getData();

        String csvHeaderRow = null;
        for (int i = 0; i < headerDataList.size(); i++) {
            if (i == 0) {
                csvHeaderRow = "\"" + headerDataList.get(i).getName() + "\"";
            }
            else {
                csvHeaderRow = csvHeaderRow + ",\"" + headerDataList.get(i).getName() + "\"";
            }
        }
        LOG.info("Row = " + csvHeaderRow);
        csvRowList.add(0, csvHeaderRow);

        // Get column data, one row at a time.
        String csvDataRow = null;
        for (PlacemarkType placemark : placemarkList) {
            List<DataType> dataList = placemark.getExtendedData().getData();
            for (int i = 0; i < dataList.size(); i++) {
                if (i == 0) {
                    csvDataRow = "\"" + dataList.get(i).getValue() + "\"";
                }
                else {
                    csvDataRow = csvDataRow + ",\"" + dataList.get(i).getValue() + "\"";
                }
            }
            LOG.info("Row = " + csvDataRow);
            csvRowList.add(csvDataRow);
        }

        return csvRowList;
    }

}
