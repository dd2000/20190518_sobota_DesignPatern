package pl.sdacademy.designpatterns.decorator;

public class CarEngineStatusAfterLoggingDecorator implements EngineStarter {

    private EngineStarter engineStarter;

    public CarEngineStatusAfterLoggingDecorator(EngineStarter engineStarter){
        this.engineStarter = engineStarter;
    }

    @Override
    public void startEngine() {
        System.out.println("Engine started");
        engineStarter.startEngine();
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped");
        engineStarter.stopEngine();
    }
}

