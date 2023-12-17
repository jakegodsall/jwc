package org.jakegodsall;

import java.util.*;

public class OptionParser {
    Map<String, Option> validOptions = new HashMap<>();
    Set<Option> selectedOptions = new HashSet<>();

    public OptionParser() {

    }

    public OptionParser(Map<String, Option> validOptions) {
        this.validOptions = validOptions;
    }

    public void parseOptions(String[] args) {

    }

    private Optional<Option> parseOptionPOSIX(String option) {
        return null;
    }

    private Optional<Option> parseOptionGNU(String option) {
        return null;
    }

    public void putValidOption(String posixName, String gnuName, Option option) {
        validOptions.put(posixName, option);
        validOptions.put(gnuName, option);
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
