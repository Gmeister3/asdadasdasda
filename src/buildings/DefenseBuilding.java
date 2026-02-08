package buildings;

import resources.Cost;
import inhabitants.ArmyUnit;

public abstract class DefenseBuilding extends Building {
    protected int damage;
    protected int range;
    protected double attackSpeed;
    
    public DefenseBuilding(int maxLevel, int maxHitPoints, Cost buildCost) {
        super(maxLevel, maxHitPoints, buildCost);
    }
    
    public void attack(ArmyUnit target) {
        if (target != null) {
            target.takeDamage(damage);
        }
    }
    
    public int getDamage() {
        return damage;
    }
    
    public int getRange() {
        return range;
    }
}
