package pl.sdacademy.designpatterns.singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        final Counter counterA = Counter.getInstance(); // tam gdie jesteśmy pewni,że referencja się nie zmieni
        final Counter counterB = Counter.getInstance(); // powinien być final

        counterA.addOne(); // counterA i counterB mają tę samą referencję
        counterB.addTwo();  // a więc wyniki: 1 - 3 -6
        counterA.addThree();

    } // main
} // class SingletonDemo
