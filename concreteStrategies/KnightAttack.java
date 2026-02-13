package concreteStrategies;

import interfaces.Attack;

public class KnightAttack implements Attack {

    @Override
    public void attack() {
        System.out.println("Knight attacks with a sword!");
    }
}
