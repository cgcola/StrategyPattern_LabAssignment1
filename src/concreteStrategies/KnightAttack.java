package concretestrategies;

import interfaces.AttackStrategy;

public class KnightAttack implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("Knight attacks with a sword!");
    }
}
