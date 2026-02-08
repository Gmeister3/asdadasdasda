package buildings;

import resources.Cost;
import resources.ResourceType;

public class GoldMine extends MiningBuilding {
    public GoldMine() {
        super(8, 1200, new Cost(200, 100, 150, 180), ResourceType.GOLD);
        this.storageCapacity = 500;
        this.maxWorkers = 5;
        this.productionRate = 30;
    }
}
