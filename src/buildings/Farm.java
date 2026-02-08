package buildings;

import resources.Cost;

public class Farm extends ProductionBuilding {
    private int foodPerHour;
    private int populationSupport;
    
    public Farm() {
        super(8, 1000, new Cost(100, 50, 200, 120));
        this.foodPerHour = 50;
        this.populationSupport = 10;
        this.maxWorkers = 3;
        this.productionRate = 20;
    }
    
    public int getFoodProduction() {
        return foodPerHour + getProduction();
    }
    
    public int getPopulationSupport() {
        return populationSupport * level;
    }
}
