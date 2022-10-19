package DFactory.simpleFactory;

public class Kia implements Car {

    @Override
    public void complete() {
        System.out.println("기아차 완성");
    }

    @Override
    public void turnOn() {
        System.out.println("기아차 시동걸기");
    }
}
