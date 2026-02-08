package inhabitants;

import resources.Cost;
import buildings.Building;

public abstract class ArmyUnit extends Inhabitant {
    protected int damage;
    protected int attackRange;
    protected boolean isInArmy;
    protected int movementSpeed;
    
    public ArmyUnit() {
        super();
        this.isInArmy = false;
    }
    
    public void attack(Building target) {
        if (target != null) {
            target.takeDamage(damage);
        }
    }
    
    public int getDamage() {
        return damage;
    }
    
    public int getAttackRange() {
        return attackRange;
    }
    
    public void deploy() {
        isInArmy = true;
    }
}
