package core;

import java.util.List;
import java.util.ArrayList;
import buildings.Building;
import buildings.VillageHall;
import inhabitants.Inhabitant;
import resources.ResourceManager;

public class Village {
    private String name;
    private int level;
    private int population;
    private int maxPopulation;
    private int area;
    private int maxArea;
    private VillageHall villageHall;
    private List<Building> buildings;
    private List<Inhabitant> inhabitants;
    private ResourceManager resources;
    private int defenseScore;
    private int attackScore;
    private long guardPeriodEnd;
    private boolean inGuardPeriod;
    
    public Village(String name) {
        this.name = name;
        this.level = 1;
        this.population = 0;
        this.maxPopulation = 50;
        this.area = 0;
        this.maxArea = 100;
        this.buildings = new ArrayList<>();
        this.inhabitants = new ArrayList<>();
        this.resources = new ResourceManager();
        this.villageHall = new VillageHall();
        this.inGuardPeriod = true;
        this.guardPeriodEnd = System.currentTimeMillis() + (7 * 24 * 60 * 60 * 1000);
    }
    
    public boolean addBuilding(Building b) {
        if (canBuild(b)) {
            buildings.add(b);
            return true;
        }
        return false;
    }
    
    public void removeBuilding(Building b) {
        buildings.remove(b);
    }
    
    public boolean addInhabitant(Inhabitant i) {
        if (population < maxPopulation) {
            inhabitants.add(i);
            population++;
            return true;
        }
        return false;
    }
    
    public void removeInhabitant(Inhabitant i) {
        inhabitants.remove(i);
        population--;
    }
    
    public int calculateDefenseScore() {
        defenseScore = 0;
        for (Building b : buildings) {
            defenseScore += b.getLevel() * 10;
        }
        return defenseScore;
    }
    
    public int calculateAttackScore() {
        attackScore = 0;
        for (Inhabitant i : inhabitants) {
            if (i instanceof inhabitants.ArmyUnit) {
                attackScore += ((inhabitants.ArmyUnit) i).getDamage();
            }
        }
        return attackScore;
    }
    
    public boolean canBuild(Building b) {
        return area + 10 <= maxArea;
    }
    
    public int getAvailableWorkers() {
        int workers = 0;
        for (Inhabitant i : inhabitants) {
            if (i instanceof inhabitants.Worker) {
                workers++;
            }
        }
        return workers;
    }
    
    public void startGuardPeriod(int duration) {
        inGuardPeriod = true;
        guardPeriodEnd = System.currentTimeMillis() + duration;
    }
}
