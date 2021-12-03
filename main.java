import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class main {

    public static void main(String[] args) {


        ArrayList<String> hammers = new ArrayList<>();
        hammers.add("1.ślusarski");
        hammers.add("2.kamieniarski");
        hammers.add("3.sledgehammer");
        hammers.add("4.wooden_mallet");
        hammers.add("5.rubber_mallet");

        ArrayList<String> glue = new ArrayList<>();
        glue.add("1.poxipux");
        glue.add("2.white_wood_glue");
        glue.add("3.yellow_wood_glue");
        glue.add("4.butaprun");
        glue.add("5.cyanoacril");

        ArrayList<String> ziptie = new ArrayList<>();
        ziptie.add("1.20cm_pink");
        ziptie.add("2.30cm_pink");
        ziptie.add("3.20cm_black");
        ziptie.add("4.30cm_black");
        ziptie.add("5.20cm_white");
        ziptie.add("6.30cm_white");

        ArrayList<String> tape = new ArrayList<>();
        tape.add("1.packing_tape");
        tape.add("2.masking_tape");
        tape.add("3.electrical_tape");
        tape.add("4.Duct_tape");
        tape.add("5.double-sided_tape");
        tape.add("6.cloth_tape");

        ArrayList<String> brazing = new ArrayList<>();
        brazing.add("1.propane torch");
        brazing.add("2.jewelery mat");
        brazing.add("3.brazing rods");
        brazing.add("4.black flux");
        brazing.add("5.propane canister");
        brazing.add("6.torch nozzle 0.12mm");

        ArrayList<String> categ = new ArrayList<>();
        categ.add("1.hammers");
        categ.add("2.glues");
        categ.add("3.zipties");
        categ.add("4.tapes");
        categ.add("5.brazing stuff");
        categ.add("6.przejdz do koszyka");

        ArrayList<String> koszyk = new ArrayList<>();

        int exit = 0;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);

        System.out.println("czy chcesz założyc konto 1 nie 2 tak 3 zaloguj się: ");

        try {
            sklep.wyb();
        } catch (InputMismatchException x){
            System.out.println("Wprowadziłeś zły znak");
            System.out.println("1.kontynuuj bez konta");
            System.out.println("2.stwórz konto");
            System.out.println("3.zaloguj się");
            sklep.wyb();
        }


        while (exit == 0) {

            System.out.println("wybierz kategorie");
            for (int i = 0; i < categ.size(); i++) {
                System.out.println(categ.get(i));
            }
            int categg = sc1.nextInt();

        switch (categg) {
            case 1:
                for (int i = 0; i < hammers.size(); i++) {
                System.out.println(hammers.get(i));
                }
                break;
            case 2:
                for (int i = 0; i < glue.size(); i++) {
                System.out.println(glue.get(i));
                }
                break;
            case 3:
                for (int i = 0; i < ziptie.size(); i++) {
                System.out.println(ziptie.get(i));
                }
                break;
            case 4:
                for (int i = 0; i < tape.size(); i++) {
                System.out.println(tape.get(i));
                }
                break;
            case 5:
                for (int i = 0; i < brazing.size(); i++) {
                System.out.println(brazing.get(i));
                }
                break;
            case 6:
                exit = 1;
                break;
            }

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
            case 5:
                System.out.println("podaj numer produktu : ");
                int pr5 = sc3.nextInt();
                System.out.println("dodałeś do koszyka : " + brazing.get(pr5 - 1));
                koszyk.add(brazing.get(pr5 - 1));
                break;
            }
        }

        System.out.println("twoje produkty: ");

        for (int i = 0; i < koszyk.size(); i++) {
            System.out.println(koszyk.get(i));}

        System.out.println("czy chesz złożyć zamówienie: ");
        System.out.println("1 tak 2 nie");
        int wybur;
        wybur = sc4.nextInt();

        switch (wybur){
            case 1:
                if (sklep.acc == 1){
                    person.dane();
                } else {
                    person.logowanie();
                }
                System.out.println("twoje założenie zostało złożone");
                int randomNum = (int)(Math.random() * 101);  // 0 to 100
                System.out.println("twoje konto zostalo obciążone kwotą: " + randomNum);

                break;
            case 2:
                System.out.println("anulowano zamowienie");
                System.exit(1);
                break;
        }


    }
}



