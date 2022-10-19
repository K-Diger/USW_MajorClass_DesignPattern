package DecoratorPattern;

public class Bell extends TreeDecorator {

    public Bell(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    public String addBell() {
        return " with Bell";
    }

    @Override
    public String decorate() {
        return super.decorate() + addBell();
    }
}
