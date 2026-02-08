package inhabitants;

import resources.Cost;

public class GoldCollector extends Collector {
    public GoldCollector() {
        super(5, 80);
        this.trainingCost = new Cost(100, 0, 0, 45);
        this.productionCapacity = 50;
        this.foodConsumption = 1;
    }
}
