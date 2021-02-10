package com.company;

public class Norsk implements Dialog {
    private String s = "Norsk";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "Tast q hvis du vil slutte:";
    }

    @Override
    public String displayLanguage() {
        return "Du valgte sproget:";
    }

    @Override
    public String changeLanguage() {
        return "Skifte språk: da / en / it / no? ";
    }
}
