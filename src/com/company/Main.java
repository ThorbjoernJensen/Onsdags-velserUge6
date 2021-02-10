package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Dialog dialog = new English();

        Sprog sprog = new Sprog();

        boolean running = true;

        while (running) {
            dialog = sprog.SkiftSprog(getString(dialog.changeLanguage()));
            System.out.println(dialog.displayLanguage() + " " + dialog.getLanguage());

            if (getString(dialog.quit()).equals("q")) {
                running = false;
            }
        }
    }

    public static String getString(String s) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(s);
        return scanner.nextLine();
    }
}
