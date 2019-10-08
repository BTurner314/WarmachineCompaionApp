package libraries;

import java.util.Arrays;
import java.util.ArrayList;

public class WeaponAbilityLoadouts {

	public static ArrayList<WeaponAbilities> none = new ArrayList<WeaponAbilities>();
	
	//melee
	public static ArrayList<WeaponAbilities> battleStaff = new ArrayList<WeaponAbilities>(Arrays.asList(WeaponAbilities.blessed));
	public static ArrayList<WeaponAbilities> blazingLance = new ArrayList<WeaponAbilities>(Arrays.asList(WeaponAbilities.lance, WeaponAbilities.continuousFire));
	public static ArrayList<WeaponAbilities> blazingSword = new ArrayList<WeaponAbilities>(Arrays.asList(WeaponAbilities.continuousFire, WeaponAbilities.dispel));
	public static ArrayList<WeaponAbilities> fireBomb = new ArrayList<WeaponAbilities>(Arrays.asList(WeaponAbilities.criticalFire));
	public static ArrayList<WeaponAbilities> flail = new ArrayList<WeaponAbilities>(Arrays.asList(WeaponAbilities.beatBack, WeaponAbilities.chainWeapon));
	public static ArrayList<WeaponAbilities> flail2 = new ArrayList<WeaponAbilities>(Arrays.asList(WeaponAbilities.chainWeapon, WeaponAbilities.continuousFire, WeaponAbilities.grievousWounds, WeaponAbilities.thresher));
	public static ArrayList<WeaponAbilities> mount = new ArrayList<WeaponAbilities>(Arrays.asList(WeaponAbilities.criticalKnockdown));
	public static ArrayList<WeaponAbilities> openFist = new ArrayList<WeaponAbilities>(Arrays.asList(WeaponAbilities.openFist));
	public static ArrayList<WeaponAbilities> recompense = new ArrayList<WeaponAbilities>(Arrays.asList(WeaponAbilities.eruptionOfAsh, WeaponAbilities.weaponMaster));
	public static ArrayList<WeaponAbilities> shield = new ArrayList<WeaponAbilities>(Arrays.asList(WeaponAbilities.shield));
	public static ArrayList<WeaponAbilities> shockHammer = new ArrayList<WeaponAbilities>(Arrays.asList(WeaponAbilities.cortexDamage)); 
	public static ArrayList<WeaponAbilities> sword = new ArrayList<WeaponAbilities>(Arrays.asList(WeaponAbilities.weaponMaster, WeaponAbilities.closeCombat));
	public static ArrayList<WeaponAbilities> sword12wm = new ArrayList<WeaponAbilities>(Arrays.asList(WeaponAbilities.weaponMaster));
	public static ArrayList<WeaponAbilities> usher = new ArrayList<WeaponAbilities>(Arrays.asList(WeaponAbilities.continuousFire));
	
	//ranged
	public static ArrayList<WeaponAbilities> flameThrower = new ArrayList<WeaponAbilities>(Arrays.asList(WeaponAbilities.continuousFire));
	public static ArrayList<WeaponAbilities> spitFire = new ArrayList<WeaponAbilities>(Arrays.asList(WeaponAbilities.weaponMaster));
	}
