package libraries;

import rules.DamageType;

public class Weapons {

	//melee
	public static models.MeleeWeapon graveMaker = new models.MeleeWeapon("Grave Maker", WeaponAbilityLoadouts.none, DamageType.magicalDamage, 5, 16, 2);
	public static models.MeleeWeapon openFist14 = new models.MeleeWeapon("Open Fist", WeaponAbilityLoadouts.openFist, DamageType.normal, 3, 14, 1);
	public static models.MeleeWeapon recompense = new models.MeleeWeapon("Recompense", WeaponAbilityLoadouts.recompense, DamageType.magicalDamage, 7, 14, 2);
	public static models.MeleeWeapon sword = new models.MeleeWeapon("Sword", WeaponAbilityLoadouts.none, rules.DamageType.normal, 3, 8, 0.5);	
	public static models.MeleeWeapon shockHammer = new models.MeleeWeapon("Shock Hammer", WeaponAbilityLoadouts.shockHammer, DamageType.normal, 6, 17, 1);

	//ranged
	public static models.RangeWeapon spitFire = new models.RangeWeapon("Spitfire", WeaponAbilityLoadouts.spitFire, rules.DamageType.magicalDamage, 1, 0, 12, "14");
	public static models.RangeWeapon heavyBarrel = new models.RangeWeapon("Heavy Barrel", WeaponAbilityLoadouts.none, DamageType.normal, 1, 0, 15, "16");

}
