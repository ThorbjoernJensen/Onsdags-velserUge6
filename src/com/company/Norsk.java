package com.company;

public class Norsk implements Dialog {
    private String s;

    @Override
    public String getLanguage() {
        return null;
    }

    @Override
    public String quit() {
        return "Tast q hvis du vil slutte";
    }

    @Override
    public String selectedLanguage() {
        return "Du valgte det Norske sprog";
    }
}
