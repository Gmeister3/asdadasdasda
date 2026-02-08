package inhabitants;

import resources.Cost;

public class WoodCollector extends Collector {
    public WoodCollector() {
        super(5, 80);
        this.trainingCost = new Cost(50, 0, 30, 45);
        this.productionCapacity = 60;
        this.foodConsumption = 1;
    }
}
