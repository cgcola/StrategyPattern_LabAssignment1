package concretestrategies;

import interfaces.AttackStrategy;

public class ArcherAttack implements AttackStrategy {

    @Override
    public void attack() {
        System.out.println("Archer shoots an arrow!");
    }
    
}
