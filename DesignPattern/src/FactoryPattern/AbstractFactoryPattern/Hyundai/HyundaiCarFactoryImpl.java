package FactoryPattern.AbstractFactoryPattern.Hyundai;

import FactoryPattern.AbstractFactoryPattern.Appearance;
import FactoryPattern.AbstractFactoryPattern.Motor;

public class HyundaiCarFactoryImpl implements HyundaiCarFactory {

    @Override
    public Motor createMotor() {
        System.out.println("현대차 모터 생성");
        return new Motor("Hyundai", 10000000);
    }

    @Override
    public Appearance createAppearance() {
        System.out.println("현대차 외형 생성");
        return new Appearance("Hyundai", 20000000);
    }
}
