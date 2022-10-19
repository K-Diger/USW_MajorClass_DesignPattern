package FactoryPattern.AbstractFactoryPattern.Kia;

import FactoryPattern.AbstractFactoryPattern.Appearance;
import FactoryPattern.AbstractFactoryPattern.Motor;

public class KiaCarFactoryImpl implements KiaCarFactory {

    @Override
    public Motor createMotor() {
        System.out.println("기아차 모터 생성");
        return new Motor("Hyundai", 7000000);
    }

    @Override
    public Appearance createAppearance() {
        System.out.println("기아차 외형 생성");
        return new Appearance("Kia", 3000000);
    }
}
