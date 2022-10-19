package FactoryPattern.AbstractFactoryPattern;

public interface CarFactory {
    Motor createMotor();
    Appearance createAppearance();
}
