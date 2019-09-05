package libraries;

import java.util.Arrays;
import java.util.ArrayList;

public class WeaponAbilityLoadouts {

	public static ArrayList<WeaponAbilities> none = new ArrayList<WeaponAbilities>();
	
	//melee
	public static ArrayList<WeaponAbilities> openFist = new ArrayList<WeaponAbilities>(Arrays.asList(WeaponAbilities.openFist));
	public static ArrayList<WeaponAbilities> recompense = new ArrayList<WeaponAbilities>(Arrays.asList(WeaponAbilities.eruptionOfAsh, WeaponAbilities.weaponMaster));
	public static ArrayList<WeaponAbilities> shockHammer = new ArrayList<WeaponAbilities>(Arrays.asList(WeaponAbilities.cortexDamage)); 
	
	
	//ranged
	public static ArrayList<WeaponAbilities> spitFire = new ArrayList<WeaponAbilities>(Arrays.asList(WeaponAbilities.weaponMaster));
	}
