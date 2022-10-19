package FactoryPattern.AbstractFactoryPattern;

public class Car {

    private Motor motor;
    private Appearance appearance;


    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public void setAppearance(Appearance appearance) {
        this.appearance = appearance;
    }
}
