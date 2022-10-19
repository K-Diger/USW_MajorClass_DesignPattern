package FactoryPattern.AbstractFactoryPattern;

public class Main {

    public static void main(String[] args) {

        CarFactoryOfFactory carFactoryOfFactory = new CarFactoryOfFactory();

        Car car = new Car();
        car.setMotor(carFactoryOfFactory.createCarMotor("Kia"));
        car.setAppearance(carFactoryOfFactory.createCarAppearance("Hyundai"));
    }
}
