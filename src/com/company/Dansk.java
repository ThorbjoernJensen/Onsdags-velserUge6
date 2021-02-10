package com.company;

public class Dansk implements Dialog {

    private String s = "dansk";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "tryk en tast for at fortsætte eller tast q for at afslutte: ";
    }

    @Override
    public String displayLanguage() {
        return "det valgte sprog er: ";
    }

    @Override
    public String changeLanguage() {
        return "Skift sprog: "+ countryCodes();
    }
}
