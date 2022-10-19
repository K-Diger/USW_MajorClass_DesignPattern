package DFactory.factoryMethod;

public class Main {
    public static void main(String[] args) {

        KiaFactory kiaFactory = new KiaFactory();
        HyundaeFactory hyundaeFactory = new HyundaeFactory();

        Car kia = kiaFactory.createCar();
        Car hyundae = hyundaeFactory.createCar();

        kia.complete();
        kia.turnOn();

        hyundae.complete();
        hyundae.turnOn();
    }
}
