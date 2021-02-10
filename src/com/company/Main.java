package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Dialog dialog;

        Sprog sprog = new Sprog();

        dialog = sprog.SkiftSprog(getString("Hvilket sprog vil du vælge: da / en / it / no? "));

        System.out.println(dialog.selectedLanguage() + " " + dialog.getLanguage()+"test");

        boolean running = true;
        while (running) {
            if (getString("").equals("q")) {
                running = false;
            } else {
                dialog = sprog.SkiftSprog(getString("Hvilket sprog vil du vælge: da / en / it / no? "));
                System.out.println(dialog.selectedLanguage() + " " + dialog.getLanguage());
                System.out.println(dialog.quit());
            }

        }


    }

    public static String getString(String s) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(s);

        return scanner.nextLine();

    }
}
