# Lab Assignment 1 : Strategy Pattern

## Problem Scenario:
Suppose we have three types of characters in a GameApp:

<ol>
  <li><strong>Knight: </strong>Attacks with a sword; uses 3 strategies to defend (shield, dodge, magic barrier)</li>
  <li><strong>Wizard: </strong>Casts spells; uses magic barrier to defend</li>
  <li><strong>Archer: </strong>Shoots arrows; uses dodge to to defend</li>
</ol>

## Implement Two Types of Strategy:
### A. DefenseStrategy
<ol>
  <li>Shield</li>
  <li>Dodge</li>
  <li>CreateMagic</li>
</ol>

### B. AttackStrategy
<ol>
  <li>CastSpell</li>
  <li>ShootArrow</li>
  <li>SwingSword</li>
</ol>

<hr>
<p>Refactor the existing codes and provide the UML Diagram:</p>

```java
public class Character {
    private String type;

    public Character(String type) {
        this.type = type;
    }

    public void attack() {
        if (type.equals("Knight")) {
            System.out.println("Knight attacks with a sword!");
        } else if (type.equals("Wizard")) {
            System.out.println("Wizard casts a spell!");
        } else if (type.equals("Archer")) {
            System.out.println("Archer shoots an arrow!");
        }
    }

    public void defend() {
        if (type.equals("Knight")) {
            System.out.println("Using a shield to defend!");
	System.out.println("Dodgin to avoid attack!");
            System.out.println("Creating a magic barrier for defense!"");		

        } else if (type.equals("Wizard")) {
            System.out.println("Creating a magic barrier for defense!"");
        } else if (type.equals("Archer")) {
            System.out.println("Using a shield to defend!"");
        }
    }
}
```
