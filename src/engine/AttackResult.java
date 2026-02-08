package engine;

import resources.Cost;

public class AttackResult {
    private boolean success;
    private double successRate;
    private Cost loot;
    private int attackerLosses;
    private int defenderLosses;
    private int stars;
    
    public AttackResult(boolean success, Cost loot) {
        this.success = success;
        this.loot = loot;
        this.attackerLosses = 0;
        this.defenderLosses = 0;
        this.stars = success ? 3 : 0;
    }
    
    public boolean isSuccess() {
        return success;
    }
    
    public Cost getLoot() {
        return loot;
    }
    
    public int getStars() {
        return stars;
    }
}
