package concreteStrategies;

import interfaces.Attack;

public class ArcherAttack implements Attack {

    @Override
    public void attack() {
        System.out.println("Archer shoots an arrow!");
    }
    
}
