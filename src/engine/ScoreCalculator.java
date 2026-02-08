package engine;

import core.Village;
import core.Army;
import core.Player;
import resources.Cost;

public class ScoreCalculator {
    
    public int calculateDefenseScore(Village v) {
        return v.calculateDefenseScore();
    }
    
    public int calculateAttackScore(Army army) {
        return army.calculatePower();
    }
    
    public int calculateLootScore(Cost loot) {
        return loot.getTotalValue();
    }
    
    public int calculateRank(Player p) {
        // Rank calculation based on player stats
        return 0;
    }
}
