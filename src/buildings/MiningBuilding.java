package buildings;

import resources.Cost;
import resources.ResourceType;

public abstract class MiningBuilding extends ProductionBuilding {
    protected ResourceType resourceType;
    protected int storageCapacity;
    protected int currentStorage;
    
    public MiningBuilding(int maxLevel, int maxHitPoints, Cost buildCost, ResourceType resourceType) {
        super(maxLevel, maxHitPoints, buildCost);
        this.resourceType = resourceType;
        this.currentStorage = 0;
    }
    
    public int collect() {
        int amount = currentStorage;
        currentStorage = 0;
        return amount;
    }
    
    public ResourceType getResourceType() {
        return resourceType;
    }
}
