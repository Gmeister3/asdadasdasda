package buildings;

import resources.Cost;

public class Cannon extends DefenseBuilding {
    private int splashRadius;
    
    public Cannon() {
        super(8, 2000, new Cost(500, 400, 200, 360));
        this.damage = 150;
        this.range = 12;
        this.attackSpeed = 0.5;
        this.splashRadius = 3;
    }
    
    public void fireCannon() {
        // Implementation for firing cannon with splash damage
    }
}
