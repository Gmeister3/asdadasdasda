package buildings;

import resources.Cost;

public class VillageHall extends Building {
    private int villageLevel;
    
    public VillageHall() {
        super(10, 5000, new Cost(1000, 500, 500, 600));
        this.villageLevel = 1;
    }
    
    public int getAllowedBuildingLevel() {
        return villageLevel;
    }
    
    public int getVillageLevel() {
        return villageLevel;
    }
    
    @Override
    public void completeUpgrade() {
        super.completeUpgrade();
        villageLevel = level;
    }
}
