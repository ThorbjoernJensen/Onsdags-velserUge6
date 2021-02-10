package com.company;

public class English implements Dialog{

    private String s = "English";
    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "presse q for quit";
    }

    @Override
    public String selectedLanguage() {
        return "the selected language is:";
    }

    @Override
    public String changeLanguage() {
        return "Change language:";
    }
}
