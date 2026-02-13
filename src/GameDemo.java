import concreteStrategies.ArcherAttack;
import concreteStrategies.ArcherDefend;
import concreteStrategies.KnightAttack;
import concreteStrategies.KnightDefend;
import concreteStrategies.WizardAttack;
import concreteStrategies.WizardDefend;
import context.Character;

public class GameDemo {
    public static void main(String[] args) {
        Character knight = new Character(new KnightAttack(), new KnightDefend());
        Character archer = new Character(new ArcherAttack(), new ArcherDefend());
        Character wizard = new Character(new WizardAttack(), new WizardDefend());

        System.out.println("Knight's turn:");
        knight.attack();
        knight.defend();

        System.out.println("\nArcher's turn:");
        archer.attack();
        archer.defend();

        System.out.println("\nWizard's turn:");
        wizard.attack();
        wizard.defend();
    }
}