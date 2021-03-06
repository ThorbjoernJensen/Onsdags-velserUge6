package com.company;

public class Norsk implements Dialog {
    private String s = "Norsk";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "Trykk en tast, eller q hvis du vil slutte: ";
    }

    @Override
    public String displayLanguage() {
        return "Du valgte sproget: ";
    }

    @Override
    public String changeLanguage() {
        return "Skifte språk: " + countryCodes();
    }
}
