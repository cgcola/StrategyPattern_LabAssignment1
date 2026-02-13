package concreteStrategies;

import interfaces.Defend;

public class ArcherDefend implements Defend {

    @Override
    public void defend() {
        System.out.println("Using a shield to defend!");
    }
    
}