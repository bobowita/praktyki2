import java.util.Scanner;

public class person {

    private int acces = 0;
    private static String imie;
    private static String nazwisko;
    private static String haslo;
    private static String kodp;
    private static String adres;
    private static String miasto;
    private static String numer;

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
    public String getNumer(String numer){
        return numer;
    }

    public String getAdres(String adres){
        return adres;
    }

    public String getKodp(String kodp){
        return kodp;
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
    public void setNumer(String newNumer) {
        this.numer = newNumer;
    }

    /**
     * author Gruzdas Bartłomiej
     * pram string
     * słuzy do pobierania informacji od uzytkownika w celu zalozenia konkt
     */

    public static void logowanie() {
        person myObj = new person();
        Scanner scanner = new Scanner(System.in);

        myObj.setAcces(1);

        System.out.println("Wprowadź imie: ");
        myObj.setImie(scanner.next());
        System.out.println("Twoje imie: "+ myObj.imie);
        sklep.login.add(myObj.imie);

        System.out.println("Wprowadź nazwisko: ");
        myObj.setNazwisko(scanner.next());
        System.out.println("Twoje nazwisko: "+ myObj.nazwisko);

        System.out.println("Wprowadź haslo: ");
        myObj.setHaslo(scanner.next());
        sklep.login.add(myObj.haslo);

        System.out.println("Wprowadź kod pocztowy: ");
        myObj.setKodp(scanner.next());
        System.out.println("Twoj kod pocztowy: "+ myObj.kodp);

        System.out.println("Wprowadź adres: ");
        myObj.setAdres(scanner.next());
        System.out.println("Twoj adres: "+ myObj.adres);

        System.out.println("Wprowadź miasto: ");
        myObj.setMiasto(scanner.next());
        System.out.println("Twoje miasto: "+ myObj.miasto);

        System.out.println("Wprowadź numer telefonu: ");
        myObj.setNumer(scanner.next());
        System.out.println("Twój numer: "+ myObj.numer);
    }

    /**
     * author dawid szemis
     * metoda przekazuje dane nowemu obiektowi i pokazuje je przy skladaniu zamówienia
     * pram string
     */
    public static void dane() {
        person dann = new person();
        dann.getImie(imie);
        System.out.println(dann.getImie(imie));

        dann.getNazwisko(nazwisko);
        System.out.println(dann.getNazwisko(nazwisko));

        dann.getMiasto(miasto);
        System.out.println(dann.getMiasto(miasto));

        dann.getAdres(adres);
        System.out.println(dann.getAdres(adres));

        dann.getKodp(kodp);
        System.out.println(dann.getKodp(kodp));

        dann.getKodp(kodp);
        System.out.println(dann.getKodp(kodp));

        dann.getNumer(numer);
        System.out.println(dann.getNumer(numer));

    }




}
