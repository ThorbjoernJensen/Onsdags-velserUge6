package com.company;

public class Italian implements Dialog{
    private String s = "Italian";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "Premere q per uscire";
    }

    @Override
    public String displayLanguage() {
        return "La lingua choocen è:";
    }

    @Override
    public String changeLanguage() {
        return "Cambia lingua: da / en / it / no? ";
    }
}
