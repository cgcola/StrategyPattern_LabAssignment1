package concreteStrategies;

import interfaces.Defend;

public class WizardDefend implements Defend {

    @Override
    public void defend() {
        System.out.println("Creating a magic barrier for defense!");
    }
}