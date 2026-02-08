package buildings;

import resources.Cost;

public class VillageHall extends Building {
    private int villageLevel;
    
    public VillageHall() {
        super();
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
