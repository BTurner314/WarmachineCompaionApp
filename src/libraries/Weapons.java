package libraries;

import rules.DamageType;

public class Weapons {

	//melee
	public static models.MeleeWeapon battleStaff = new models.MeleeWeapon("Battle Staff", WeaponAbilityLoadouts.battleStaff, DamageType.magicalDamage, 6, 11, 2);
	public static models.MeleeWeapon battleStaff2 = new models.MeleeWeapon("Battle Staff", WeaponAbilityLoadouts.none, DamageType.normal, 2, 6, 2);
	public static models.MeleeWeapon blazingLance = new models.MeleeWeapon("Blazing Lance", WeaponAbilityLoadouts.blazingLance, DamageType.magicalDamage, 8, 16, 0);
	public static models.MeleeWeapon blazingSword = new models.MeleeWeapon("Blazing Sword", WeaponAbilityLoadouts.blazingSword, DamageType.magicalDamage, 6, 15, 2);
	public static models.MeleeWeapon censure = new models.MeleeWeapon("Censure", WeaponAbilityLoadouts.sword12wm, DamageType.magicalDamage, 7, 14, 1);
	public static models.MeleeWeapon flail = new models.MeleeWeapon("Flail", libraries.WeaponAbilityLoadouts.flail, DamageType.normal, 6, 17, 2);
	public static models.MeleeWeapon flail2	= new models.MeleeWeapon("Flail", WeaponAbilityLoadouts.flail2, DamageType.magicalDamage, 4, 13, 2);
	public static models.MeleeWeapon graveMaker = new models.MeleeWeapon("Grave Maker", WeaponAbilityLoadouts.none, DamageType.magicalDamage, 5, 16, 2);
	public static models.MeleeWeapon mace = new models.MeleeWeapon("Mace", WeaponAbilityLoadouts.none, DamageType.normal, 3, 7, 0.5);
	public static models.MeleeWeapon mount12 = new models.MeleeWeapon("Mount", WeaponAbilityLoadouts.none, DamageType.normal, 12, 12, 0.5);
	public static models.MeleeWeapon mount12ck = new models.MeleeWeapon("Mount", WeaponAbilityLoadouts.mount, DamageType.normal, 12, 12, 0.5);
	public static models.MeleeWeapon multiTool = new models.MeleeWeapon("Multi Tool", libraries.WeaponAbilityLoadouts.none, DamageType.normal, 3, 8, 0.5);
	public static models.MeleeWeapon openFist14 = new models.MeleeWeapon("Open Fist", WeaponAbilityLoadouts.openFist, DamageType.normal, 3, 14, 1);
	public static models.MeleeWeapon recompense = new models.MeleeWeapon("Recompense", WeaponAbilityLoadouts.recompense, DamageType.magicalDamage, 7, 14, 2);
	public static models.MeleeWeapon shield = new models.MeleeWeapon("Shield", libraries.WeaponAbilityLoadouts.shield, DamageType.normal, 2, 13, 1);
	public static models.MeleeWeapon shield2 = new models.MeleeWeapon("Shield", WeaponAbilityLoadouts.shield, DamageType.magicalDamage, 4, 12, 0.5);
	public static models.MeleeWeapon sword = new models.MeleeWeapon("Sword", WeaponAbilityLoadouts.none, rules.DamageType.normal, 3, 8, 0.5);	
	public static models.MeleeWeapon sword2closeCombat = new models.MeleeWeapon("Sword", WeaponAbilityLoadouts.sword, DamageType.magicalDamage, 4, 12, 1);
	public static models.MeleeWeapon sword12wm = new models.MeleeWeapon("Sword", WeaponAbilityLoadouts.sword12wm, DamageType.magicalDamage, 4, 12, 1);
	public static models.MeleeWeapon shockHammer = new models.MeleeWeapon("Shock Hammer", WeaponAbilityLoadouts.shockHammer, DamageType.normal, 6, 17, 1);
	public static models.MeleeWeapon usher = new models.MeleeWeapon("Usher", WeaponAbilityLoadouts.usher, DamageType.magicalDamage, 7, 14, 2);
	
	//ranged
	public static models.RangeWeapon fireBomb = new models.RangeWeapon("Fire Bomb", WeaponAbilityLoadouts.fireBomb, DamageType.fireDamage, 1, 3, 12, "6");
	public static models.RangeWeapon flameThrower = new models.RangeWeapon("Flame Thrower", WeaponAbilityLoadouts.flameThrower, DamageType.fireDamage, 1, 0, 12, "SP8");
	public static models.RangeWeapon spitFire = new models.RangeWeapon("Spitfire", WeaponAbilityLoadouts.spitFire, rules.DamageType.magicalDamage, 1, 0, 12, "14");
	public static models.RangeWeapon heavyBarrel = new models.RangeWeapon("Heavy Barrel", WeaponAbilityLoadouts.none, DamageType.normal, 1, 0, 15, "16");

}
