package com.company;

import java.util.Scanner;
public class person {

    private int acces = 0;
    private static String imie;
    private static String nazwisko;
    private String haslo;
    private static String kodp;
    private static String adres;
    private static String miasto;
    private static double numer;

    public void setAcces(int newAcces) {
        this.acces = newAcces;
    }

    public String getImie(String imie){
        return imie;
    }

    public String getNazwisko(String nazwisko){
        return nazwisko;
    }
    public String getMiasto(String miasto){
        return miasto;
    }
    public double getNumer(double numer){
        return numer;
    }


    public void setImie(String newImie) {
        this.imie = newImie;
    }

    public void setNazwisko(String newNazwisko) {
        this.nazwisko = newNazwisko;
    }

    public void setHaslo(String newHaslo) {
        this.haslo = newHaslo;
    }

    public void setKodp(String newKodp) {
        this.kodp = newKodp;
    }

    public void setAdres(String newAdres) {
        this.adres = newAdres;
    }
    public void setMiasto(String newMiasto) {
        this.miasto = newMiasto;
    }
    public void setNumer(double newNumer) {
        this.numer = newNumer;
    }

    public static void logowanie() {
        person myObj = new person();
        Scanner scanner = new Scanner(System.in);

        myObj.setAcces(1);

        System.out.println("Wprowadź imie: ");
        myObj.setImie(scanner.next());
        System.out.println("Twoje imie: "+ myObj.imie);

        System.out.println("Wprowadź nazwisko: ");
        myObj.setNazwisko(scanner.next());
        System.out.println("Twoje nazwisko: "+ myObj.nazwisko);

        System.out.println("Wprowadź haslo: ");
        myObj.setHaslo(scanner.next());

        System.out.println("Wprowadź kod pocztowy: ");
        myObj.setKodp(scanner.next());
        System.out.println("Twoj kod pocztowy: "+ myObj.kodp);

        System.out.println("Wprowadź adres: ");
        myObj.setAdres(scanner.next());
        System.out.println("Twoj adres: "+ myObj.adres);
    }

    public static void dane() {
        person dann = new person();
        dann.getImie(imie);
        System.out.println(dann.getImie(imie));

        dann.getNazwisko(nazwisko);
        System.out.println(dann.getNazwisko(nazwisko));
    }




}
