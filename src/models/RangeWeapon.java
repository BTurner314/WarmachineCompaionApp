package models;

import java.util.ArrayList;

import rules.DamageType;
import libraries.WeaponAbilities;

public class RangeWeapon extends Weapons{


	private int rof;
	private int aoe;
	private int pow;
	private String range;
	
	public RangeWeapon(String name, ArrayList<WeaponAbilities> weaponAbilities, DamageType damageType, int rof, int aoe, int pow, String range) {
		super(name, weaponAbilities, damageType);
		
		this.range = range;
		this.rof = rof;
		this.aoe = aoe;
		this.pow = pow;
	}
}



