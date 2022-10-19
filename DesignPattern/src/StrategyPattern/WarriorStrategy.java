package StrategyPattern;

public class WarriorStrategy implements AttackStrategy {


    public int hp;
    public int mp;

    @Override
    public String getAttackMessage() {
        return "전사 공격";
    }


}
