package pl.sdacademy.designpatterns.factory.car;

import pl.sdacademy.designpatterns.factory.AbstractFactory;

public class CombiCarFactory implements AbstractFactory<Car> {
    @Override
    public Car create(String type) {
        switch (type){
            case "TC":
                return createCorollaCombi();
            case "A4":
                return createAudiA4Combi();
        } // switch
        throw new RuntimeException("Unknown car type!");
    } // create(String type)

    private Car createCorollaCombi(){
        return new Toyota("Corolla",
                EngineType.GASOLINE_NATURALLY_ASPIRATED,
                1.6D,
                4,
                BodyType.COMBI);
    } // createCorollaCombi()

    private Car createAudiA4Combi(){
        return new Audi("A4",
                EngineType.DIESE,
                2.0D,
                4,
                BodyType.COMBI);
    } // createAudiA4Combi()
} // class CombiCarFactory implements AbstractFactory<Car>
