package pl.sdacademy.designpatterns.factory.car;

import pl.sdacademy.designpatterns.factory.AbstractFactory;

public class SedanCarFactory implements AbstractFactory<Car> {
    @Override
    public Car create(String type) {
        switch (type){
            case "TC":
                return createCorollaSedan();
            case "A4":
                return createAudiA4();
        } // switch
        throw new RuntimeException("Unknown car type!");
    } // create(String type)

    private Car createCorollaSedan(){
        return new Toyota("Corolla",
                EngineType.GASOLINE_NATURALLY_ASPIRATED,
                1.6D,
                4,
                BodyType.SEDAN);
    } // createCorollaSedan()

    private Car createAudiA4(){
        return new Audi("A4",
                EngineType.DIESE,
                2.0D,
                4,
                BodyType.SEDAN);
    } // createAudiA4()
} // class SedanCarFactory implements AbstractFactory<Car>
