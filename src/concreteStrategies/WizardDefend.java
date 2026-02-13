package concretestrategies;

import interfaces.DefenseStrategy;

public class WizardDefend implements DefenseStrategy {

    @Override
    public void defend() {
        System.out.println("Creating a magic barrier for defense!");
    }
}