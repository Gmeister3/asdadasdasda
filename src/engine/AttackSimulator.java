package engine;

import java.util.Random;
import core.Army;
import core.Village;
import resources.Cost;

public class AttackSimulator {
    private Random random;
    
    public AttackSimulator() {
        this.random = new Random();
    }
    
    public AttackResult simulateAttack(Army army, Village village) {
        int attackScore = calculateDamage(army, village);
        int defenseScore = village.calculateDefenseScore();
        boolean success = determineSuccess(attackScore, defenseScore);
        double successRate = (double) attackScore / (defenseScore + attackScore);
        Cost loot = calculateLoot(village, successRate);
        
        return new AttackResult(success, loot);
    }
    
    public int calculateDamage(Army army, Village village) {
        return army.calculatePower();
    }
    
    public boolean determineSuccess(int attackScore, int defenseScore) {
        if (attackScore == 0) return false;
        double successChance = (double) attackScore / (attackScore + defenseScore);
        return random.nextDouble() < successChance;
    }
    
    public Cost calculateLoot(Village village, double successRate) {
        // Calculate loot based on success rate
        return new Cost(
            (int)(100 * successRate),
            (int)(50 * successRate),
            (int)(75 * successRate),
            0
        );
    }
}
