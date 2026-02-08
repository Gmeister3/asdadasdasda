package buildings;

import resources.Cost;
import resources.ResourceType;

public class LumberMill extends MiningBuilding {
    public LumberMill() {
        super(8, 1000, new Cost(100, 100, 50, 150), ResourceType.WOOD);
        this.storageCapacity = 500;
        this.maxWorkers = 5;
        this.productionRate = 40;
    }
}
