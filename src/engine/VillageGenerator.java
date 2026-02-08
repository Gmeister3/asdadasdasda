package engine;

import java.util.Random;
import core.Village;
import core.Army;
import core.Player;
import buildings.*;
import inhabitants.*;

public class VillageGenerator {
    private Random random;
    
    public VillageGenerator() {
        this.random = new Random();
    }
    
    public Village generateVillage(int level) {
        Village v = new Village("Generated Village");
        populateBuildings(v, level);
        return v;
    }
    
    public Army generateArmy(int level) {
        Army army = new Army();
        for (int i = 0; i < level * 5; i++) {
            army.addUnit(new Soldier());
        }
        return army;
    }
    
    public Village matchPlayerLevel(Player p) {
        int level = p.getVillage().calculateDefenseScore() / 100;
        return generateVillage(level);
    }
    
    public void populateBuildings(Village v, int level) {
        for (int i = 0; i < level; i++) {
            v.addBuilding(new Farm());
            v.addBuilding(new GoldMine());
        }
    }
}
