package FactoryPattern.AbstractFactoryPattern;

import FactoryPattern.AbstractFactoryPattern.Hyundai.HyundaiCarFactory;
import FactoryPattern.AbstractFactoryPattern.Hyundai.HyundaiCarFactoryImpl;
import FactoryPattern.AbstractFactoryPattern.Kia.KiaCarFactory;
import FactoryPattern.AbstractFactoryPattern.Kia.KiaCarFactoryImpl;

public class CarFactoryOfFactory {
    private final HyundaiCarFactory hyundaiCarFactory = new HyundaiCarFactoryImpl();
    private final KiaCarFactory kiaCarFactory = new KiaCarFactoryImpl();

    public Appearance createCarAppearance(String company) {
        if (company.equals("Hyundai")) {
            return hyundaiCarFactory.createAppearance();
        } else if (company.equals("Kia")) {
            return kiaCarFactory.createAppearance();
        }

        return null;
    }

    public Motor createCarMotor(String company) {
        if (company.equals("Hyundai")) {
            return hyundaiCarFactory.createMotor();
        } else if (company.equals("Kia")) {
            return kiaCarFactory.createMotor();
        }

        return null;
    }
}
