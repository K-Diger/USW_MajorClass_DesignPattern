package Cdecorator;

public class Main {
    public static void main(String[] args) {

        // Christmas tree 만 있음
        ChristmasTree tree = new ChristmastTreeImpl();
        System.out.println(tree.decorate());

        // Christmas tree + Lights
        ChristmasTree treeWithLights = new Lights(new ChristmastTreeImpl());
        System.out.println(treeWithLights.decorate());

        // Christmas tree + Lights + Flowers
        ChristmasTree treeWithLightsAndFlowers = new Bell(new Lights(new ChristmastTreeImpl()));
        System.out.println(treeWithLightsAndFlowers.decorate());
    }
}
