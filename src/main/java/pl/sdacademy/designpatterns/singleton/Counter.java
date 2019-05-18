package pl.sdacademy.designpatterns.singleton;

public class Counter {

    private static Counter counter;  // statyczne pole counter

    // tworzymy jedno pole tej klasy
    public static Counter getInstance(){
        return counter;
    }

    private int count = 0;

    // prywatny konstruktor klasy Counter
    private Counter() {}

    public void addOne(){
        count +=1;
        System.out.println(count);
    }

    public void addTwo(){
        count +=2;
        System.out.println(count);
    }

    public void addThree(){
        count +=3;
        System.out.println(count);
    }
}
