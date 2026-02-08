package inhabitants;

import resources.Cost;

public class Soldier extends ArmyUnit {
    private int shield;
    
    public Soldier() {
        super(6, 150);
        this.trainingCost = new Cost(100, 50, 0, 60);
        this.damage = 30;
        this.attackRange = 1;
        this.movementSpeed = 2;
        this.shield = 20;
        this.foodConsumption = 2;
    }
    
    public void block() {
        // Implementation for blocking attacks
    }
}
