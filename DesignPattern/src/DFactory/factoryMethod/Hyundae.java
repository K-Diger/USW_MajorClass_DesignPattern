package DFactory.factoryMethod;

public class Hyundae implements Car{
    @Override
    public void complete() {
        System.out.println("현대차 완성");
    }

    @Override
    public void turnOn() {
        System.out.println("현대차 시동켜기");
    }
}
