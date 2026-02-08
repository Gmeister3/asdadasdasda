package inhabitants;

import resources.Cost;
import buildings.MiningBuilding;

public abstract class Collector extends Inhabitant {
    protected int productionCapacity;
    protected MiningBuilding assignedBuilding;
    
    public Collector() {
        super();
    }
    
    public void assignTo(MiningBuilding b) {
        this.assignedBuilding = b;
    }
    
    public int collect() {
        if (assignedBuilding != null) {
            return assignedBuilding.collect();
        }
        return 0;
    }
    
    public int getProductionCapacity() {
        return productionCapacity;
    }
}
