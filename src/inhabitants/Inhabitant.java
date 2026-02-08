package inhabitants;

import resources.Cost;

public abstract class Inhabitant {
    protected int level;
    protected int maxLevel;
    protected int hitPoints;
    protected int maxHitPoints;
    protected Cost trainingCost;
    protected int trainingTime;
    protected int foodConsumption;
    protected boolean isUpgrading;
    
    public Inhabitant() {
        this.level = 1;
        this.isUpgrading = false;
    }
    
    public void upgrade() {
        if (!isUpgrading && level < maxLevel) {
            isUpgrading = true;
        }
    }
    
    public Cost getUpgradeCost() {
        if (trainingCost != null) {
            return trainingCost.multiply(level * 1.5);
        }
        return null;
    }
    
    public void takeDamage(int damage) {
        hitPoints = Math.max(0, hitPoints - damage);
    }
    
    public boolean isAlive() {
        return hitPoints > 0;
    }
    
    public void heal() {
        hitPoints = maxHitPoints;
    }
}
