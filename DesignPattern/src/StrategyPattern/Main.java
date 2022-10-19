package StrategyPattern;

public class Main {

    public static void main(String[] args) {

        Character warrior = new Character(new WarriorStrategy());
        Character thief = new Character(new ThiefStrategy());

        warrior.attackEffect();
        System.out.println("전사 체력 : " + warrior.getHp());
        System.out.println("전사 마나 : " + warrior.getMp());

        System.out.println("--------------------------");

        thief.attackEffect();
        System.out.println("도적 체력 : " + thief.getHp());
        System.out.println("도적 마나 : " + thief.getMp());
    }
}
