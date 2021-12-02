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
            case 4:
                break;
            default:
                System.out.println("podaj liczbe 1 2 lub 3");
                sklep.wyb();
        }
    }

    public static void log() {
        Scanner sc5 = new Scanner(System.in);
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
                    switch (xd){
                        case 1:

                        case 2:

                        case 3:

                        case 4:
                    }
                case 2:
                    System.out.println("przenosze do sklepu");
            }
        } else {
            System.out.println("wrong login or password");
        }
    }
}
