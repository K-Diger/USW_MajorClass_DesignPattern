package FactoryPattern.FactoryMethodPattern;

public class HyundaeFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Hyundae();
    }
}
