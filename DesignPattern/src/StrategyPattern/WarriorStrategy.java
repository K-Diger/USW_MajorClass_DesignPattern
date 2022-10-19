package StrategyPattern;

public class WarriorStrategy implements AttackStrategy {

    @Override
    public String getAttackMessage() {
        return "전사 공격";
    }
}
