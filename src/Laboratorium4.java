public class Laboratorium4 {
    /* Firma chce przechowywać informacje o swoich
     * pracownikach w systemie. kazdy z rekordów
     * definiujacyc pracownika powinien zawierac
     * poniższe informacje: firts name, last name, Age,
     * gender personal ID number */

        String name;
        String lastname;
        int age;
        char gender;
        int personalIDNumber;

    public void nowyPracownik() {
        System.out.println("Imię: " + name);
        System.out.println("Nazwisko: " + lastname);
        System.out.println("Wiek: " + age);
        System.out.println("Płeć: " + gender);
        System.out.println("Numer identyfikacyjny: " + personalIDNumber);
        System.out.println("-----" + '\n');

    }


    public static void main(String[] args) {


        Laboratorium4 pracownik1 = new Laboratorium4();
        pracownik1.name = "Marcin";
        pracownik1.lastname = "Lesniak";
        pracownik1.age = 50;
        pracownik1.gender = 'm';
        pracownik1.personalIDNumber = 123456;

        pracownik1.nowyPracownik();

        Laboratorium4 pracownik2 = new Laboratorium4();
        pracownik2.name = "Agata";
        pracownik2.lastname = "Słowik";
        pracownik2.age = 49;
        pracownik2.gender = 'f';
        pracownik2.personalIDNumber = 2523652;
        pracownik2.nowyPracownik();



    }




}