package buildings;

import resources.Cost;

public abstract class Building {
    protected int level;
    protected int maxLevel;
    protected int hitPoints;
    protected int maxHitPoints;
    protected int positionX;
    protected int positionY;
    protected Cost buildCost;
    protected int buildTime;
    protected boolean isUpgrading;
    protected long upgradeStartTime;
    
    public Building() {
        this.level = 1;
        this.isUpgrading = false;
    }
    
    public void upgrade() {
        if (!isMaxLevel() && !isUpgrading) {
            isUpgrading = true;
            upgradeStartTime = System.currentTimeMillis();
        }
    }
    
    public Cost getUpgradeCost() {
        if (buildCost != null) {
            return buildCost.multiply(level * 1.5);
        }
        return null;
    }
    
    public boolean isMaxLevel() {
        return level >= maxLevel;
    }
    
    public void takeDamage(int damage) {
        hitPoints = Math.max(0, hitPoints - damage);
    }
    
    public void repair() {
        hitPoints = maxHitPoints;
    }
    
    public void completeUpgrade() {
        if (isUpgrading) {
            level++;
            isUpgrading = false;
            maxHitPoints = (int)(maxHitPoints * 1.2);
            hitPoints = maxHitPoints;
        }
    }
    
    public int getLevel() {
        return level;
    }
    
    public int getHitPoints() {
        return hitPoints;
    }
}
