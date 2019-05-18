package pl.sdacademy.designpatterns.factory.car;

import pl.sdacademy.designpatterns.factory.AbstractFactory;

public class FactoryProvider {
    public static AbstractFactory<Car> getFactory(final FactoryCategory factoryCategory){
        switch (factoryCategory){
            case SEDANS:
                return new SedanCarFactory();
            case COMBIS:
                return new CombiCarFactory();
        } // switch
        throw new RuntimeException("Unknown car type!");
    } // AbstractFactory<Car> getFactory()
}
