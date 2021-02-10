package com.company;

public class Dansk implements Dialog {

    private String s = "dansk";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "tryk q for at stoppe:";
    }

    @Override
    public String selectedLanguage() {
        return "det valgte sprog er:";
    }

    @Override
    public String changeLanguage() {
        return "Skift sprog:";
    }
}
