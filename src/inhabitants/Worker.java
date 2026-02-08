package inhabitants;

import resources.Cost;
import buildings.Building;

public class Worker extends Inhabitant {
    private boolean isIdle;
    private String currentTask;
    
    public Worker() {
        super();
        this.isIdle = true;
        this.currentTask = "";
    }
    
    public void buildStructure(Building b) {
        isIdle = false;
        currentTask = "Building";
    }
    
    public void produceFood() {
        isIdle = false;
        currentTask = "Producing Food";
    }
    
    public void repair(Building b) {
        isIdle = false;
        currentTask = "Repairing";
    }
    
    public void setIdle(boolean idle) {
        this.isIdle = idle;
        if (idle) {
            currentTask = "";
        }
    }
}
