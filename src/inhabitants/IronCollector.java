package inhabitants;

import resources.Cost;

public class IronCollector extends Collector {
    public IronCollector() {
        super(5, 80);
        this.trainingCost = new Cost(80, 20, 0, 45);
        this.productionCapacity = 40;
        this.foodConsumption = 1;
    }
}
