package resources;

public class Cost {
    private int gold;
    private int iron;
    private int wood;
    private int time;
    
    public Cost(int gold, int iron, int wood, int time) {
        this.gold = gold;
        this.iron = iron;
        this.wood = wood;
        this.time = time;
    }
    
    public int getTotalValue() {
        return gold + iron + wood;
    }
    
    public Cost multiply(double factor) {
        return new Cost(
            (int)(gold * factor),
            (int)(iron * factor),
            (int)(wood * factor),
            (int)(time * factor)
        );
    }
    
    public int getGold() {
        return gold;
    }
    
    public int getIron() {
        return iron;
    }
    
    public int getWood() {
        return wood;
    }
    
    public int getTime() {
        return time;
    }
}
