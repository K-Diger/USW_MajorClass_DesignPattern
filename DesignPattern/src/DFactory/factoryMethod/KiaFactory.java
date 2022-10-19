package DFactory.factoryMethod;

public class KiaFactory implements CarFactory {


    @Override
    public Car createCar() {
        return new Kia();
    }
}
