package DFactory.factoryMethod;

public interface CarFactory {

    default Car orderCar() {
        Car phone = createCar();
        phone.complete();
        return phone;
    }

    Car createCar();
}
