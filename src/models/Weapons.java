package models;

import java.util.ArrayList;

import rules.DamageType;
import libraries.WeaponAbilities;

//template for creating weapons
public abstract class Weapons {
private String name;
private ArrayList<libraries.WeaponAbilities> weaponAbilities;
private DamageType damageType;

public Weapons(String name, ArrayList<libraries.WeaponAbilities> weaponAbilities, DamageType damageType) {
	this.weaponAbilities = new ArrayList<libraries.WeaponAbilities>();
	this.name = name;
	this.weaponAbilities = weaponAbilities;
	this.damageType = damageType;
}

public DamageType getDamageType() {
	return damageType;
}

}
