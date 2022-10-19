package DFactory.simpleFactory;

public class CarSimpleFactory {

    // 심플 팩터리
    private Car createCar(String type) {
        return switch (type) {
            case "Hyndae" -> new Hyndae();
            case "Kia" -> new Kia();
            default -> null;
        };
    }

    public Car orderCar(String type) {
        Car car = createCar(type);
        car.complete();
        return car;
    }
}
