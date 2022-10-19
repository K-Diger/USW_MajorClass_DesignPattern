package FactoryPattern.FactoryMethodPattern;

public class KiaFactory implements CarFactory {


    @Override
    public Car createCar() {
        return new Kia();
    }
}
