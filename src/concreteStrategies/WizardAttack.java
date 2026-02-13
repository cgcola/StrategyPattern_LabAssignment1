package concretestrategies;

import interfaces.AttackStrategy;

public class WizardAttack implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("Wizard casts a spell!");
    }
}