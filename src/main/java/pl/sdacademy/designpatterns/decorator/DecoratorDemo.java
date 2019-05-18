package pl.sdacademy.designpatterns.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {

// bez dekoratora
//        final EngineStarter engineStarter = new Car();
//
//        engineStarter.startEngine();
//        engineStarter.stopEngine();

        // wykorzystanie obu dekoratorów
        final EngineStarter engineStarter = new CarEngineStatusAfterLoggingDecorator(
                new CarEngineStatusBeforeLoggingDecorator(new Car()));

        engineStarter.startEngine();
        engineStarter.stopEngine();

    } // main()
}
