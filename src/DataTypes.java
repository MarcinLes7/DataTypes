public class DataTypes {
    public static void main(String[] args) {
        // liczby całkowite
        // byte - 1  00000000
        // short - 2 00000000 00000000
        // int - 4   00000000 00000000 00000000 00000000
        // long - 8  00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000

        // domyślnie liczby całkowiete tranktowane sa jako int
        System.out.println(23254);

        // czasami chcemy zapisac większa liczbe - poza zakresem int
        // w tym przypadku kompilator zapisał liczbe jako int a my musimy jawnie
        // dopisać w tym L że to jest long
        System.out.println(232521252544L);

        byte b = -120;

        // tu jest problem bo chcemy wprowadzić wartość,
        // która rozpoznana jest jako int a wpisaliśmy jako byte
        // byte bb = -129;

        // typ short jest bardziej pojemny od byte
        short s =  32654;

        // int jest jeszcze bardziej pojemny
        int i = 1_212_235_545;

        // long jest najbardziej pojemny - ale trzeba dać L na końcu
        long l = i * b;
        long itemsNumber = 212542115455525L;

        // char - jezeli wpiszemy liczbę jako znak to ta liczba to jest zakodowany
        // znak i mozna zobaczyc co się pod nim kryje poprzez wyświetlenie przez println
        char cc = 12;
        System.out.println(cc);
        char grade = 176;
        System.out.println(grade);


        // liczby zmiennoprzecinkow - ty jest float - rzadko używany
        // i domyślny jest double - najcześciej używany
        double a = 34.35;
        // nie da sie wpisac do zmiennej o pojemności float wpisac double
        // - trzeba dopisac f
        float f = 12.12f;
        // Możemy wpisywac dość duże liczby ale w finansach, rozliczeniach ,
        // nie uzywamy tego bo zakrągla i sa błędy.
        double d = 2154152454.215154616;

        // typy znakowe
        System.out.println('a'); // tu znak w apostrofie
        // ale jak wpisujemy ciąg znaków wówczas trzeba wpisac w cudzyslowie

        // znaki specjalne - nietypowe
        // jeżeli chcemy wpisac apostrof to trzeba najpierw użyć backslash
        System.out.println('\'');
        System.out.println('\t'); // a tu tabulator wpisujemy

        char c = 64;
        System.out.println(c); // znak 64 to jest małpa (et)
        // natomiast gdy chcemy dowiedzieć się jaki kod ma dany znak
        // to możemy dokonac rzutowania - czyli zamiany
        // przed naszą wartością, którą chcemy zrzutować zapisujemy typ
        // i bedziemy wykonywać konwersji z char na int.
        // czyli to co jest w nawiasie to jest typ NA KTÓRY konwertujemy
        System.out.println((int)c);


        // typ logiczny
        System.out.println(true);
        System.out.println(false);

        boolean chosen = true;
        boolean q = false;
        System.out.println(q);

        // ciągi znaków
        String name = "Ala";
        System.out.println(name);
        System.out.println("Cześć, jestem " + name);
        // ale sytuacja komplikuje się jeżeli chcemu zrobic tak
        System.out.println("tekst" + 1 + 2);
        // w takim zapisie wazna jest kolejność wykonywania działań
        // - teraz będzie teksst 12 czyli Ala12
        // jeżeli chcemy, żeby było dodawanie to musimy wstawić w nawias
        System.out.println("Cześć, jestem " + (1+2));
        // lub odwrtoenie zapisać
        System.out.println(1 + 2 + "Cześć, jestem" + name);

        // albop jeszcze dodajemy pusty ciąg znaków
        System.out.println("" + 1 + 2 + "tekst");














    }
}
