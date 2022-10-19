package Astrategy;

public class Character {

    private int hp;
    private int mp;

    private final AttackStrategy attackStrategy;

    Character(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
        this.hp = 100;
        this.mp = 50;
    }

    public void attackEffect() {
        System.out.println(attackStrategy.getAttackMessage());
    }

    public int getHp() {
        return this.hp;
    }

    public int getMp() {
        return this.mp;
    }

    public void setHp(int value) {
        this.hp += value;
    }

    public void setMp(int value) {
        this.mp += value;
    }
}
