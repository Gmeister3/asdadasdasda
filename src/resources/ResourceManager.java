package resources;

public class ResourceManager {
    private int gold;
    private int goldCapacity;
    private int iron;
    private int ironCapacity;
    private int wood;
    private int woodCapacity;
    private int foodProduction;
    private int foodConsumption;
    
    public void addGold(int amount) {
        gold = Math.min(gold + amount, goldCapacity);
    }
    
    public void addIron(int amount) {
        iron = Math.min(iron + amount, ironCapacity);
    }
    
    public void addWood(int amount) {
        wood = Math.min(wood + amount, woodCapacity);
    }
    
    public boolean consumeResources(Cost cost) {
        if (hasEnoughResources(cost)) {
            gold -= cost.getGold();
            iron -= cost.getIron();
            wood -= cost.getWood();
            return true;
        }
        return false;
    }
    
    public boolean hasEnoughResources(Cost cost) {
        return gold >= cost.getGold() && 
               iron >= cost.getIron() && 
               wood >= cost.getWood();
    }
    
    public Cost getAvailableLoot() {
        return new Cost(gold / 2, iron / 2, wood / 2, 0);
    }
    
    public boolean canSupport(int population) {
        return foodProduction >= foodConsumption + population;
    }
}
