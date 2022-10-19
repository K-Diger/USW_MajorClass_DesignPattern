package FactoryPattern.SimpleFactoryPattern;

// 심플 팩토리는 단순히 객체를 만드는 작업을 하나의 팩토리 클래스에 모아두는 것을 의미한다.
public class Main {
    public static void main(String[] args) {
        CarSimpleFactory carSimpleFactory = new CarSimpleFactory();

        Car car = carSimpleFactory.orderCar("Hyndae");
        car.turnOn();
    }
}
