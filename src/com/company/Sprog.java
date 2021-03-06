package com.company;

import java.util.HashMap;

public class Sprog  {

    private HashMap<String, Dialog> dialoger = new HashMap<>();

    public Sprog() {

        // her tilføjer du ny sprog
        dialoger.put("da", new Dansk());
        dialoger.put("en", new English());
        dialoger.put("no", new Norsk());
        dialoger.put("it", new Italian());


    }
    public Dialog SkiftSprog(String s) {

       return dialoger.getOrDefault(s, new English());

    }
}
