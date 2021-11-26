public class person {
    public static  int access = 0;
    public static String imie;
    public static String nazwisko;
    public static String haslo;

    public person(int access, String imie, String nazwisko, String haslo) {
        this.access = access;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.haslo = haslo;
    }

    public person(String imie, String nazwisko, String haslo) {
    }


}
