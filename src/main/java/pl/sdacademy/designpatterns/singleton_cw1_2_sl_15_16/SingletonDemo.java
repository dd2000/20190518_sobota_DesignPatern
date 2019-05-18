package pl.sdacademy.designpatterns.singleton_cw1_2_sl_15_16;
/*
1. github.com/Mbojanow/sdadesignpatterns
2. Stwórz singleton_cw1_2_sl_15_16 (typu EAGER) Counter, który przechowuje liczbę. Jej
początkowa wartość jest równa 0. Dodaj 3 metody do klasy Counter
• metodę która zwiększa licznik odpowiednio o 1, 2 i 3
• w każdej z tych metod po zwiększeniu wartości wyświetl ją na ekran
3. W metodzie main pobierz dwie referencji singletonu. Wywołaj kilka
razy metody na stworzonych referencjach zmieniające wartość licznika.
4. Wyjaśnij zaobserowane wyniki widoczne w konsoli
5. BONUS: Napisz test z wykorzystaniem biblioteki JUnit sprawdzający że
Counter jest poprawnie stworzonym singletonem. Wykorzystaj asercję
assertSame
 */
public class SingletonDemo {

    public static void main(String[] args) {
        final Counter counterA = Counter.getInstance(); // tam gdie jesteśmy pewni,że referencja się nie zmieni
        final Counter counterB = Counter.getInstance(); // powinien być final

// coś tu nie działa !!!
//        counterA.addOne(); // counterA i counterB mają tę samą referencję
//        counterB.addTwo();  // a więc wyniki: 1 - 3 -6
//        counterA.addThree();

    } // main
} // class SingletonDemo
