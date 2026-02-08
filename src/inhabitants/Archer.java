package inhabitants;

import resources.Cost;

public class Archer extends ArmyUnit {
    private int arrows;
    
    public Archer() {
        super();
    }
    
    public void shoot() {
        if (arrows > 0) {
            arrows--;
            // Shooting logic
        }
    }
}
