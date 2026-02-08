package buildings;

import resources.Cost;

public class Farm extends ProductionBuilding {
    private int foodPerHour;
    private int populationSupport;
    
    public Farm() {
        super();
    }
    
    public int getFoodProduction() {
        return foodPerHour + getProduction();
    }
    
    public int getPopulationSupport() {
        return populationSupport * level;
    }
}
