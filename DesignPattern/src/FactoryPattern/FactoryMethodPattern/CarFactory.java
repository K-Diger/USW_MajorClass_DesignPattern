package FactoryPattern.FactoryMethodPattern;

public interface CarFactory {

    default Car orderCar() {
        Car car = createCar();
        car.complete();
        return car;
    }

    Car createCar();
}
