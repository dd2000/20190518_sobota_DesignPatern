package pl.sdacademy.designpatterns.observer;

public abstract class Observer {

    protected Subject subject;

    public Observer(Subject subject){
        this.subject = subject;
    }

    public abstract void update(); //potrzebna, by wszystkich obserwatorów poinformować o zmianie

}
