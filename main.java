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
    int ii = 0;
            System.out.println("czy chcesz założyc konto 1 nie 2 tak : ");
            Scanner sc2 = new Scanner(System.in);
            ii = sc2.nextInt();
        switch (ii){
            case 1:
                System.out.println("lecisz bez konta");
                break;
            case 2:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Wprowadź dane:");
                System.out.println("Wprowadź imie:");
                person.imie =  scanner.next();
                System.out.println("Wprowadź nazwisko:");
                person.nazwisko =  scanner.next();
                System.out.println("haslo:");
                person.haslo =  scanner.next();
                person peep = new person(person.imie, person.nazwisko, person.haslo);
                System.out.println("stworzyłeś konto");
                break;
        }

            int categg = 0;
            System.out.println("wybierz kategorie");
            Scanner sc1 = new Scanner(System.in);
            for (int i = 0; i < categ.size(); i++) {
                System.out.println(categ.get(i));}
            categg = sc1.nextInt();

            switch (categg) {
                case 1:
                    for (String hammer : hammers) {
                        System.out.println(hammer);
                    }
                    
                case 2:
                    for (String item : glue) {
                        System.out.println(item);
                    }

                case 3:
                    for (String value : ziptie) {
                        System.out.println(value);
                    }

                case 4:
                    for (String s : tape) {
                        System.out.println(s);}
            }


        }




    }
/**
 * @autors Gruzdas Bartłomiej Dawid szemis
 *
 *
 */


