import java.util.ArrayList;
import java.util.Scanner;

public class sklep {

    public static int acc = 0;
    public static ArrayList<String> login = new ArrayList<>();
    public static ArrayList<String> password = new ArrayList<>();
    public static String haslo = "ofca";
    public static String logg = "budyn";
    public static int access = 0;
    public static int xd = 0;


    /**
     * author szemis dawid
     * metoda pyta sie urzytkownika co chce wybrać z 3 opcji i sprawdza czy nie podał czegoś źle
     */
    public static void wyb() {
        Scanner sc2 = new Scanner(System.in);
        int ii = sc2.nextInt();
        switch (ii) {
            case 1:
                System.out.println("lecisz bez konta");
                break;
            case 2:
                sklep.acc = 1;
                person.logowanie();
                break;
            case 3:
                System.out.println("zaluguj się");
                sklep.log();
            default:
                System.out.println("podaj liczbe 1 2 lub 3");
                sklep.wyb();
        }
    }

    /**
     * author gruzdas bartłomiej
     *metoda sluzy do logowania po podaniu hasła i loginu
     * i sprawdza czy uzytkownik to administrator
     */
    public static void log() {
        Scanner sc5 = new Scanner(System.in);
        Scanner sc6 = new Scanner(System.in);
        String budyn = "";
        System.out.println("podaj login: ");
        sklep.logg = sc5.nextLine();
        System.out.println("podaj haslo: ");
        sklep.haslo = sc5.nextLine();


    if (logg.equals("budyn") && haslo.equals("ofca")) {
        access = 1;
        System.out.println("jesteś zalogowany");
        System.out.println("ustawienia 1 przejdz do sklepu 2");
        sklep.xd = sc5.nextInt();

        switch (sklep.xd) {
            case 1:
                System.out.println("wybierz kategorie");
                int xd = 0;
                xd = sc5.nextInt();

              /*  switch (xd){
                    case 1:
                        System.out.println("wpisz nazwe produktu");
                        budyn = sc6.next();
                    case 2:

                    case 3:

                    case 4:
                }
            */    case 2:
                   System.out.println("przenosze do sklepu");
             }

        } else {
            System.out.println("wrong login or password");
            log();
        }
    }
}
