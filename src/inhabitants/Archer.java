package inhabitants;

import resources.Cost;

public class Archer extends ArmyUnit {
    private int arrows;
    
    public Archer() {
        super(6, 100);
        this.trainingCost = new Cost(150, 30, 50, 90);
        this.damage = 40;
        this.attackRange = 5;
        this.movementSpeed = 3;
        this.arrows = 50;
        this.foodConsumption = 2;
    }
    
    public void shoot() {
        if (arrows > 0) {
            arrows--;
            // Shooting logic
        }
    }
}
