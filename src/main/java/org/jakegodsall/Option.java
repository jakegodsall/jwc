package org.jakegodsall;

public class Option {
    private String posixName;
    private String gnuName;
    private String description;
    private Boolean isRequired;

    public Option(String posixName, String gnuName, String description, boolean isRequired) {
        this.posixName = posixName;
        this.gnuName = gnuName;
        this.description = description;
        this.isRequired = isRequired;
    }

    public String getPosixName() {
        return posixName;
    }

    public void setPosixName(String posixName) {
        this.posixName = posixName;
    }

    public String getGnuName() {
        return gnuName;
    }

    public void setGnuName(String gnuName) {
        this.gnuName = gnuName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }

    @Override
    public String toString() {
        return "Option{" +
                "gnuName='" + gnuName + '\'' +
                '}';
    }
}
