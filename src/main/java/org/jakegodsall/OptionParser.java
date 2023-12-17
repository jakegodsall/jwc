package org.jakegodsall;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class OptionParser {
    Set<Option> validOptions = new HashSet<>();
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

    private Set<Option> populateValidOptions() {
        return null;
    }
}
