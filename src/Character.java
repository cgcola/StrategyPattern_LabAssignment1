package src;
public class Character {
    private Attack attackStrategy;
    private Defend defendStrategy;

    public Character(Attack attackStrategy, Defend defendStrategy) {
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
