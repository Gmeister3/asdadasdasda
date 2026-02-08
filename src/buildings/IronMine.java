package buildings;

import resources.Cost;
import resources.ResourceType;

public class IronMine extends MiningBuilding {
    public IronMine() {
        super(8, 1200, new Cost(150, 50, 150, 180), ResourceType.IRON);
        this.storageCapacity = 500;
        this.maxWorkers = 5;
        this.productionRate = 25;
    }
}
