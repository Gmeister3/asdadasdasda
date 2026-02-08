package inhabitants;

import resources.Cost;

public class Catapult extends ArmyUnit {
    private int splash;
    
    public Catapult() {
        super(6, 120);
        this.trainingCost = new Cost(300, 150, 200, 180);
        this.damage = 100;
        this.attackRange = 8;
        this.movementSpeed = 1;
        this.splash = 4;
        this.foodConsumption = 4;
    }
    
    public void launch() {
        // Implementation for launching projectile with splash damage
    }
}
