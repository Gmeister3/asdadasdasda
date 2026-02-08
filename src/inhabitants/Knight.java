package inhabitants;

import resources.Cost;

public class Knight extends ArmyUnit {
    private int armor;
    
    public Knight() {
        super(6, 200);
        this.trainingCost = new Cost(200, 100, 50, 120);
        this.damage = 50;
        this.attackRange = 1;
        this.movementSpeed = 4;
        this.armor = 50;
        this.foodConsumption = 3;
    }
    
    public void charge() {
        // Implementation for charging attack
    }
}
