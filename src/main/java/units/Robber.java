package units;

import arena.Arena;
import units.abstractUnits.Equipment;
import units.abstractUnits.Unit;
import units.abstractUnits.UnitAttackingWithWeapons;
import units.abstractUnits.UnitsTypes;

/**
 * Разбойник
 */
public class Robber extends UnitAttackingWithWeapons {
    public Robber(String name) {
        super(Equipment.knives_and_cloak.getHealth(), Equipment.knives_and_cloak.getAttack(),
                Equipment.knives_and_cloak.getDefend(), UnitsTypes.Robber, name);
    }
    public void theft(Unit target){
        if (getAbilityPoints() == 2) {
            super.clearPointAbility();
            for (int i = 0; i < 2; i++) {
                target.decreasePointActivities();
            }
        }
    }
    public void jab(Unit target){
        if (getAbilityPoints() == 2){
            super.clearPointAbility();
            target.decreasePointActivities();
            target.decreaseHealth(10);
        }
    }

    @Override
    public Unit findTarget(Arena arena, Team ourTeam) {
        // ищем ближайшего чужого
        return arena.findTheNearestTeamUnit(ourTeam, this, true);
    }

    @Override
    public boolean applyAbility(Unit targetUnit) {
        System.out.print("Применяю способности: ");
        boolean res = false;
        if (!res) {
            System.out.print("Не получилось");
        }
        System.out.println();

        return res;
    }
}
