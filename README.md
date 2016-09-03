# kml2csv
Convert data table from Google Maps .KML to CSV for importing into spreadsheet. This extracts only the data table portion of a .KML file and writes it to a comma-separated-value (CSV) format file which can imported into a spreadsheet.

**Build it:** 

```shell
mvn clean package
```

**Run it:**

```shell
java -jar target/kml2csv.jar
```

You can include the input filename (.KML) and output filename on the command line. If you don't include them on the command line, you will be prompted for them.

**Command line options:**

```
usage: java -jar kml2csv.jar [-?] [-h] [-i <infile>] [-o <outfile>]

Convert Google KML file to CSV

 -?                       Show help
 -h,--help                Show help
 -i,--infile <infile>     input filename
 -o,--outfile <outfile>   output filename

Example:

  java -jar kml2csv.jar -i mymap.kml -o mymap.csv
```

