package pl.sdacademy.designpatterns.observer;

public class ValueLoweredObserver extends Observer {

    private int previousValue;

    public ValueLoweredObserver(Subject subject) {
        super(subject);
        previousValue = subject.getValue();
    }

    @Override
    public void update() {
        if (subject.getValue() < previousValue) {
            System.out.println("Value lowered and now is " + subject.getValue());
        }
        previousValue = subject.getValue();
    }

}
