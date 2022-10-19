package Astrategy;

public class Main {

    public static void main(String[] args) {

        Character warrior = new Character(new WarriorStrategy());
        Character thief = new Character(new ThiefStrategy());

        warrior.attackEffect();
        System.out.println(warrior.getHp());
        System.out.println(warrior.getMp());

        System.out.println("--------------------------");

        thief.attackEffect();
        System.out.println(thief.getHp());
        System.out.println(thief.getMp());
    }
}
