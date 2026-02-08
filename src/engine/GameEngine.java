package engine;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import core.Player;
import core.Village;
import buildings.Building;

public class GameEngine {
    private long currentTime;
    private double gameSpeed;
    private AttackSimulator attackSimulator;
    private VillageGenerator villageGenerator;
    private ScoreCalculator scoreCalculator;
    private List<Player> players;
    
    public GameEngine() {
        this.currentTime = System.currentTimeMillis();
        this.gameSpeed = 1.0;
        this.attackSimulator = new AttackSimulator();
        this.villageGenerator = new VillageGenerator();
        this.scoreCalculator = new ScoreCalculator();
        this.players = new ArrayList<>();
    }
    
    public void startGame() {
        currentTime = System.currentTimeMillis();
    }
    
    public void updateTime() {
        currentTime = System.currentTimeMillis();
    }
    
    public void processUpgrades(Village v) {
        // Process building and inhabitant upgrades
    }
    
    public void processProduction(Village v) {
        // Process resource production
    }
    
    public void generateAttack(Village v) {
        // Generate AI attack on village
    }
    
    public boolean allowUpgrade(Village v, Object o) {
        if (o instanceof Building) {
            Building b = (Building) o;
            return !b.isMaxLevel();
        }
        return false;
    }
    
    public boolean allowBuild(Village v, Building b) {
        return v.canBuild(b);
    }
    
    public void addPlayer(Player p) {
        players.add(p);
    }
}
