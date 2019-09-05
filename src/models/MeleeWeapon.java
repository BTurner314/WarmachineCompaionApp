package models;

import java.util.ArrayList;

import rules.DamageType;
import libraries.WeaponAbilities;

public class MeleeWeapon extends Weapons{


	private int pow;
	private int ps;
	private double range;

	public MeleeWeapon(String name, ArrayList<libraries.WeaponAbilities> weaponAbilities, rules.DamageType damageType, int pow, int ps, double range) {
		super(name, weaponAbilities, damageType);
	
		this.range = range;
		this.pow = pow;
		this.ps = ps;
	}

}
