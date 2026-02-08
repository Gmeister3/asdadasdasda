package buildings;

import resources.Cost;

public abstract class ProductionBuilding extends Building {
    protected int productionRate;
    protected int maxWorkers;
    protected int currentWorkers;
    
    public ProductionBuilding() {
        super();
        this.currentWorkers = 0;
    }
    
    public void assignWorker() {
        if (currentWorkers < maxWorkers) {
            currentWorkers++;
        }
    }
    
    public void removeWorker() {
        if (currentWorkers > 0) {
            currentWorkers--;
        }
    }
    
    public int getProduction() {
        return productionRate * currentWorkers;
    }
}
