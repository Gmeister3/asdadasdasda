package core;

import buildings.Building;
import inhabitants.Inhabitant;
import engine.AttackResult;

public class Player {
    private String playerName;
    private String playerId;
    private Village village;
    private int rank;
    private int attackWins;
    private int attackLosses;
    private int defenseWins;
    private int defenseLosses;
    private int totalLoot;
    
    public Player(String name) {
        this.playerName = name;
        this.playerId = generatePlayerId();
        this.village = new Village(name + "'s Village");
        this.rank = 0;
        this.attackWins = 0;
        this.attackLosses = 0;
        this.defenseWins = 0;
        this.defenseLosses = 0;
        this.totalLoot = 0;
    }
    
    private String generatePlayerId() {
        return "P" + System.currentTimeMillis();
    }
    
    public boolean buildBuilding(Building b) {
        return village.addBuilding(b);
    }
    
    public boolean trainInhabitant(String type) {
        // Factory method to create inhabitants based on type
        return false;
    }
    
    public boolean upgradeBuilding(Building b) {
        b.upgrade();
        return true;
    }
    
    public boolean upgradeInhabitant(Inhabitant i) {
        i.upgrade();
        return true;
    }
    
    public AttackResult attackVillage(Village v) {
        // Attack logic would be implemented here
        return null;
    }
    
    public void updateRank() {
        rank = (attackWins * 10) - (attackLosses * 5) + (defenseWins * 8) - (defenseLosses * 3);
    }
    
    public Village getVillage() {
        return village;
    }
}
