package FactoryPattern.AbstractFactoryPattern;

import FactoryPattern.AbstractFactoryPattern.Hyundai.HyundaiCarFactoryImpl;
import FactoryPattern.AbstractFactoryPattern.Kia.KiaCarFactoryImpl;

public class CarFactoryOfFactory {
    public Appearance createCarAppearance(String company) {
        if (company.equals("Hyundai")) {
            CarFactory carFactory = new HyundaiCarFactoryImpl();
            return carFactory.createAppearance();
        } else if (company.equals("Kia")) {
            CarFactory carFactory = new KiaCarFactoryImpl();
            return carFactory.createAppearance();
        }
        return null;
    }
    public Motor createCarMotor(String company) {
        if (company.equals("Hyundai")) {
            CarFactory carFactory = new HyundaiCarFactoryImpl();
            return carFactory.createMotor();
        } else if (company.equals("Kia")) {
            CarFactory carFactory = new KiaCarFactoryImpl();
            return carFactory.createMotor();
        }
        return null;
    }
}
