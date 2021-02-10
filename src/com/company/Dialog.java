package com.company;

public interface Dialog {

    public String getLanguage();

    public String quit();

    public String displayLanguage();

    public String changeLanguage();

    public default String countryCodes(){
        return "da / en / it / no? ";
    }

}
