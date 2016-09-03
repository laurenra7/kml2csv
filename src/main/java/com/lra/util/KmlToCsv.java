package com.lra.util;

import static java.lang.System.exit;

import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import com.lra.util.model.kml.KmlType;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * Created by laurenra on 9/2/16.
 */
public class KmlToCsv {

    public static void main(String[] args) {

        String inFileName;
        String outFileName;

        // Get a console to run from the command line.
        Console console = System.console();
        if (console == null) {
            System.err.println("No console");
            exit(1);
        }

        Options commandLineOptions = new Options();
        commandLineOptions.addOption(Option.builder("?")
                .desc("Show help")
                .build());
        commandLineOptions.addOption(Option.builder("h")
                .longOpt("help")
                .desc("Show help")
                .build());
        commandLineOptions.addOption(Option.builder("i")
                .longOpt("infile")
                .desc("input filename")
                .hasArg()
                .argName("infile")
                .build());
        commandLineOptions.addOption(Option.builder("o")
                .longOpt("outfile")
                .desc("output filename")
                .hasArg()
                .argName("outfile")
                .build());

        if(args.length == 0) {
            // If no arguments, show help and ask for options
            showCommandHelp(commandLineOptions);
            inFileName = console.readLine("Input file name: ");
            if (inFileName.length() > 0) {
                outFileName = console.readLine("Output file name: ");
                if (outFileName.length() > 0) {
                    // Convert it
                }
            }
        }
        else {
            CommandLineParser parser = new DefaultParser();
            try {
                CommandLine line = parser.parse(commandLineOptions, args);
                if (line.hasOption("help") || line.hasOption("?")) {
                    showCommandHelp(commandLineOptions);
                }
                else {
                    // Get input file
                    if (line.hasOption("infile")) {
                        inFileName = line.getOptionValue("infile");
                    }
                    else {
                        inFileName = console.readLine("Input file name: ");
                    }

                    // Get output file
                    if (line.hasOption("outfile")) {
                        outFileName = line.getOptionValue("outfile");
                    }
                    else {
                        outFileName = console.readLine("Output file name: ");
                    }

                    System.out.println("inFileName = " + inFileName);
                    System.out.println("outFileName = " + outFileName);

                    // Convert it
                    if (!convertKmlFileToCsvFile(inFileName, outFileName)) {
                        exit(1);
                    }
                }
            }
            catch (ParseException exp) {
                System.err.println("Parsing failed: " + exp.getMessage());
                exit(1);
            }
        }

        exit(0);
    }


    private static void showCommandHelp(Options options) {
        String commandHelpHeader = "\nConvert Google KML file to CSV\n\n";
        String commandHelpFooter = "\nExample:\n\n" +
                "  java -jar kml2csv.jar -i mymap.kml -o mymap.csv\n\n";

        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.printHelp("java -jar kml2csv.jar", commandHelpHeader, options, commandHelpFooter, true);
    }


    private static boolean convertKmlFileToCsvFile(String inFilename, String outFilename) {
        boolean retValue = false;
        ConvertKmlDataTableToCsv cktc = new ConvertKmlDataTableToCsv();
//        ClassLoader classLoader = getClass().getClassLoader();
//        File kmlTestFile = new File(classLoader.getResource("sample-kml-small.xml").getFile());
        System.out.println("In Filename = " + inFilename); // testing only
        File inFile = new File(inFilename);
        KmlType kmlData = cktc.unmarshalXmlFromFile(inFile);
        List<String> csvDataRows = cktc.convertToCsv(kmlData);
        try ( PrintWriter outFile = new PrintWriter(outFilename) ) {
            for (String csvRow : csvDataRows) {
                outFile.println(csvRow);
            }
            retValue = true;
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: file not found. " + e.getMessage());
            retValue = false;
        }
        return retValue;
    }

}
