package org.jakegodsall;

import java.util.*;
import java.util.stream.Collectors;

public class OptionParser {
    Map<String, Option> validOptions = new HashMap<>();
    Set<Option> selectedOptions = new HashSet<>();


    public OptionParser() {
        this.validOptions = populateValidOptions();
    }

    public void parseOptions(String[] args) {

    }

    private Optional<Option> parseOptionPOSIX(String option) {
        return null;
    }

    private Optional<Option> parseOptionGNU(String option) {
        return null;
    }

    private Map<String, Option> populateValidOptions() {
        Map<String, Option> validOptions = new HashMap<>();

        Option bytesOption = new Option(
          "c",
                "bytes",
                "The number of bytes in each input file is written to the standard output",
                false
        );

        validOptions.put(bytesOption.getPosixName(), bytesOption);
        validOptions.put(bytesOption.getGnuName(), bytesOption);

        Option characterOption = new Option(
                "m",
                "chars",
                "The number of characters in each input file is written to the standard output",
                false
        );

        validOptions.put(characterOption.getPosixName(), characterOption);
        validOptions.put(characterOption.getGnuName(), characterOption);

        Option linesOption = new Option(
                "l",
                "lines",
                "The number of lines in each input file is written to the standard output",
                false
        );

        validOptions.put(linesOption.getPosixName(), linesOption);
        validOptions.put(linesOption.getGnuName(), linesOption);

        Option wordsOption = new Option(
                "w",
                "words",
                "The number of words in each input file is written to the standard output",
                false
        );

        validOptions.put(wordsOption.getPosixName(), wordsOption);
        validOptions.put(wordsOption.getGnuName(), wordsOption);

        return validOptions;
    }

    public void printValidOptions() {
        Set<Option> options = new HashSet<>(validOptions.values());
        String title = "Valid Options";
        System.out.println(title);
        System.out.println("_".repeat(title.length()) + "\n");
        printOptions(options);
    }

    public void printSelectedOptions() {
        String title = "Selected Options";
        System.out.println(title);
        System.out.println("_".repeat(title.length()) + "\n");
        printOptions(selectedOptions);
    }

    private void printOptions(Set<Option> options) {
        for (Option option : options) {
            System.out.printf("-%-3s--%-10s %s\n", option.getPosixName(), option.getGnuName(), option.getDescription());
        }
    }

}
