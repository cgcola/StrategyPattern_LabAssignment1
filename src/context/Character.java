package context;

import interfaces.AttackStrategy;
import interfaces.DefenseStrategy;

public class Character {
    private AttackStrategy attackStrategy;
    private DefenseStrategy defendStrategy;

    public Character(AttackStrategy attackStrategy, DefenseStrategy defendStrategy) {
        this.attackStrategy = attackStrategy;
        this.defendStrategy = defendStrategy;
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void defend() {
        defendStrategy.defend();
    }
}
