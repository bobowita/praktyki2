import java.util.ArrayList;
import java.util.Scanner;


public class main extends person {

    public main(int access, String imie, String nazwisko, String haslo) {
        super(access, imie, nazwisko, haslo);
    }

    public static void main(String[] args) {



        ArrayList<String> hammers = new ArrayList<String>();
        hammers.add("ślusarski");
        hammers.add("kamieniarski");
        hammers.add("sledgehammer");
        hammers.add("wooden_mallet");
        hammers.add("rubber_mallet");

        ArrayList<String> glue = new ArrayList<>();
        glue.add("poxipux");
        glue.add("white_wood_glue");
        glue.add("yellow_wood_glue");
        glue.add("butaprun");
        glue.add("cyanoacril");

        ArrayList<String> ziptie = new ArrayList<>();
        ziptie.add("20cm_pink");
        ziptie.add("30cm_pink");
        ziptie.add("20cm_black");
        ziptie.add("30cm_black");
        ziptie.add("20cm_white");
        ziptie.add("30cm_white");

        ArrayList<String> tape = new ArrayList<>();
        tape.add("packing_tape");
        tape.add("masking_tape");
        tape.add("electrical_tape");
        tape.add("Duct_tape");
        tape.add("double-sided_tape");
        tape.add("cloth_tape");

        ArrayList<String> categ = new ArrayList<>();
        categ.add("hammers");
        categ.add("glues");
        categ.add("zipties");
        categ.add("tapes");

        ArrayList<String> koszyk = new ArrayList<>();


        System.out.println("czy chcesz założyc konto 1 nie 2 tak : ");
        Scanner sc2 = new Scanner(System.in);
        int ii = sc2.nextInt();
        switch (ii) {
            case 1:
                System.out.println("lecisz bez konta");
                break;
            case 2:
                Scanner scanner = new Scanner(System.in);
                konto(scanner);
                break;
        }

        System.out.println("wybierz kategorie");
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < categ.size(); i++) {
            System.out.println(categ.get(i));
        }
        int categg = sc1.nextInt();

        switch (categg) {
            case 1:
                for (int i = 0; i < hammers.size(); i++) {
                    System.out.println(hammers.get(i));}
                break;
            case 2:
                for (int i = 0; i < glue.size(); i++) {
                    System.out.println(glue.get(i));}
                break;
            case 3:
                for (int i = 0; i < ziptie.size(); i++) {
                    System.out.println(ziptie.get(i));}
                break;
            case 4:
                for (int i = 0; i < tape.size(); i++) {
                    System.out.println(tape.get(i));}
                break;

        }

        Scanner sc3 = new Scanner(System.in);
        System.out.println("podaj kategorie produktu który czhesz zamówić");

        switch (categg) {
            case 1:
                System.out.println("podaj numer produktu : ");
                int pr1 = sc3.nextInt();
                System.out.println("dodałeś do koszyka : " + hammers.get(pr1 - 1));
                koszyk.add(hammers.get(pr1 - 1));
                break;
            case 2:
                System.out.println("podaj numer produktu : ");
                int pr2 = sc3.nextInt();
                System.out.println("dodałeś do koszyka : " + glue.get(pr2 - 1));
                koszyk.add(glue.get(pr2 - 1));
                break;
            case 3:
                System.out.println("podaj numer produktu : ");
                int pr3 = sc3.nextInt();
                System.out.println("dodałeś do koszyka : " + ziptie.get(pr3 - 1));
                koszyk.add(ziptie.get(pr3 - 1));
                break;
            case 4:
                System.out.println("podaj numer produktu : ");
                int pr4 = sc3.nextInt();
                System.out.println("dodałeś do koszyka : " + tape.get(pr4 - 1));
                koszyk.add(tape.get(pr4 - 1));
                break;
        }
        for (int i = 0; i < koszyk.size(); i++) {
            System.out.println(koszyk.get(i) + "ehh");}




    }

    private static void konto(Scanner scanner) {
        System.out.println("Wprowadź dane:");
        System.out.println("Wprowadź imie:");
        person.imie = scanner.next();
        System.out.println("Wprowadź nazwisko:");
        person.nazwisko = scanner.next();
        System.out.println("haslo:");
        person.haslo = scanner.next();
        person peep = new person(person.imie, person.nazwisko, person.haslo);
        System.out.println("stworzyłeś konto");
    }
}
/**
 * @autors Gruzdas Bartłomiej Dawid szemis
 * nie motoda switch ii pozwala wybrć czy zaklada sie konto
 * nie metoda switch categ pozwala wybrać kategorie produktu
 *  metoda pozwala założyc konto
 */


