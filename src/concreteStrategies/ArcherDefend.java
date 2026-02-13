package concretestrategies;

import interfaces.DefenseStrategy;

public class ArcherDefend implements DefenseStrategy {

    @Override
    public void defend() {
        System.out.println("Using a shield to defend!");
    }
    
}