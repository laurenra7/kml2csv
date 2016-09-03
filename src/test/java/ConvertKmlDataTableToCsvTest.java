import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.util.List;

import com.lra.util.ConvertKmlDataTableToCsv;
import com.lra.util.model.kml.DataType;
import com.lra.util.model.kml.KmlType;
import com.lra.util.model.kml.PlacemarkType;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by laurenra on 9/2/16.
 */
public class ConvertKmlDataTableToCsvTest {

    final static Logger LOG = LoggerFactory.getLogger(ConvertKmlDataTableToCsvTest.class);

    private KmlType getKmlDataFromFile(String filename) {
        ConvertKmlDataTableToCsv cktc = new ConvertKmlDataTableToCsv();
        ClassLoader classLoader = getClass().getClassLoader();
        File kmlTestFile = new File(classLoader.getResource(filename).getFile());
        return (KmlType)cktc.unmarshalXmlFromFile(kmlTestFile);
    }

    @Test
    public void shouldMapKmlFileToJavaObject() {
        KmlType kmlType = getKmlDataFromFile("sample-kml-small.xml");
        LOG.info("test mapping KML file to Java object");
        assertNotNull(kmlType);
    }

    @Test
    public void shouldGetDocumentNameFromFile() {
        KmlType kmlType = getKmlDataFromFile("sample-kml-small.xml");
        String placemarkName = kmlType.getDocument().getName();
        LOG.info("test getting KML document name from KML file");
        assertEquals("Neighborhood Flags 2016", placemarkName);
    }

    @Test
    public void shouldGetArrayOfDataFromFile() {
        KmlType kmlType = getKmlDataFromFile("sample-kml-small.xml");
        List<PlacemarkType> placemarkList = kmlType.getDocument().getPlacemark();
        List<DataType> dataList = placemarkList.get(0).getExtendedData().getData();
        LOG.info("test getting data list from KML file, list size = " + dataList.size());
        assertEquals(9, dataList.size());
        String columnName = dataList.get(5).getName();
        String columnValue = dataList.get(5).getValue();
        LOG.info("test getting data column name (\"" + columnName + "\") and value (\"" + columnValue + "\")");
        assertEquals("Full Name", columnName);
        assertEquals("Leghorn, Foghorn & Prissy ", columnValue);
    }

    @Test
    public void shouldGetCsvDataStrings() {
        ConvertKmlDataTableToCsv cktc = new ConvertKmlDataTableToCsv();
        ClassLoader classLoader = getClass().getClassLoader();
        File kmlTestFile = new File(classLoader.getResource("sample-kml-small.xml").getFile());
        KmlType kmlData = cktc.unmarshalXmlFromFile(kmlTestFile);
        List<String> csvDataRows = cktc.convertToCsv(kmlData);
        LOG.info("test getting CSV strings:");
        for (String csvRow : csvDataRows) {
            LOG.info(csvRow);
        }
        assertNotNull(csvDataRows);
    }

}
