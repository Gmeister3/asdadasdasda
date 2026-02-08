package core;

import java.util.List;
import java.util.ArrayList;
import inhabitants.ArmyUnit;

public class Army {
    private List<ArmyUnit> units;
    private int maxSize;
    private int totalPower;
    
    public Army() {
        this.units = new ArrayList<>();
        this.maxSize = 50;
        this.totalPower = 0;
    }
    
    public boolean addUnit(ArmyUnit unit) {
        if (units.size() < maxSize) {
            units.add(unit);
            unit.deploy();
            calculatePower();
            return true;
        }
        return false;
    }
    
    public void removeUnit(ArmyUnit unit) {
        units.remove(unit);
        calculatePower();
    }
    
    public int calculatePower() {
        totalPower = 0;
        for (ArmyUnit unit : units) {
            totalPower += unit.getDamage() * unit.getAttackRange();
        }
        return totalPower;
    }
    
    public int getSize() {
        return units.size();
    }
    
    public void deploy() {
        for (ArmyUnit unit : units) {
            unit.deploy();
        }
    }
    
    public void retreat() {
        units.clear();
        totalPower = 0;
    }
}
