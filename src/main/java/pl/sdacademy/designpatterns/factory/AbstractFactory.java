package pl.sdacademy.designpatterns.factory;

public interface AbstractFactory<Car> {
  Car create(String type);
}
