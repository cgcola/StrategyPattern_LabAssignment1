package concreteStrategies;

import interfaces.Defend;

public class KnightDefend implements Defend {

    @Override
    public void defend() {
       System.out.println("Using a shield to defend!");
       System.out.println("Dodgin to avoid attack!");
       System.out.println("Creating a magic barrier for defense!");

    }
}