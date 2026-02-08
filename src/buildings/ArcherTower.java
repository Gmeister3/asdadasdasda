package buildings;

import resources.Cost;

public class ArcherTower extends DefenseBuilding {
    private int arrowCount;
    
    public ArcherTower() {
        super(8, 1500, new Cost(300, 200, 100, 240));
        this.damage = 50;
        this.range = 10;
        this.attackSpeed = 1.0;
        this.arrowCount = 100;
    }
    
    public void reload() {
        arrowCount = 100;
    }
}
