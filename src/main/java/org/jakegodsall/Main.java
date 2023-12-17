package org.jakegodsall;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        OptionParser parser = new OptionParser();

        Option bytesOption = new Option(
                "c",
                "bytes",
                "The number of bytes in each input file is written to the standard output",
                false
        );
        Option characterOption = new Option(
                "m",
                "chars",
                "The number of characters in each input file is written to the standard output",
                false
        );
        Option linesOption = new Option(
                "l",
                "lines",
                "The number of lines in each input file is written to the standard output",
                false
        );
        Option wordsOption = new Option(
                "w",
                "words",
                "The number of words in each input file is written to the standard output",
                false
        );

        parser.putValidOption(bytesOption.getPosixName(), bytesOption.getGnuName(), bytesOption);
        parser.putValidOption(characterOption.getPosixName(), characterOption.getGnuName(), characterOption);
        parser.putValidOption(linesOption.getPosixName(), linesOption.getGnuName(), linesOption);
        parser.putValidOption(wordsOption.getPosixName(), wordsOption.getGnuName(), wordsOption);

        parser.printValidOptions();
    }


}