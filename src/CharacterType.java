public class CharacterType {
    public static void main(String[] args) { // program ma metodę uruchomieniową main
        // a teraz jak użyć takiej metody jak poniżej?: w metodzie main
        // bo od niej wszystko się zacznie gdy uruchomimy program
        // uzyjemy metody showInfo i podamy znaki jakie nas interesują
        // bedziemy chceli się dowiedziec jaki kod ma litera a, jaki kod ma litera b
        // czyli tą metodę wywołuję 4 razy a jest napisana jeden raz ponizej
        //
        showInfo('a');
        showInfo('b');
        showInfo('A');
        showInfo('ą');

    }
    // nasz program będzie mial metodę, która będzie wyświetlała informacje o poszczegolnych znakach.
    // Poniżej metody main zdefiniujemy publiczną statyczną metodę showInfo. Void to informacja, że metoda
    // nie będzie zwracała konkretnego typu. Nazwa metody to nazwiemy ja showInfo, tę metode zapisujemy podobnie
    // jak zmienną z małej litery. W nawiasach () możemy wprowadzić parametr tej metody czyli typ i nazwa argumentu
    // jaki trzeba będzie podać do tej metody i w naszym przypadku chcemy podać do niej znaki typu char,
    // a w tej metodzie będziemy obsługiwac ten argument następująco: że wyświetlimy informacje w ten sposób:
    // kod znaku. o jaki znak chodzi (c), i podamy wylicznie
    // ()
    public static void showInfo(char c) {
        System.out.println("Kod znaku " + c + " to: " + (int)c);
        // tu jest róznica w tym, że znak wyświetla się w apostrofie
        // i widać, że robi to w pętli dla każdego znaku
        System.out.println("Kod znaku '" + c + "' to:" + (int)c);
        // no i jak wywołamy te kody to się okazuje, że 'ą' ma wartość 261 czyli nie miesci się
        // w zapisie bitowym w 1 bajcie i do zakodowania tego typu znaku potrzeba 2 bajtów
        // i stąd typ char, który jest 2 bajtowy

    }

}
