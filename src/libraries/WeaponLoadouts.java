package libraries;

import java.util.ArrayList;
import java.util.Arrays;

import models.Weapons;

public class WeaponLoadouts {

	//none
	public static ArrayList<Weapons> none = new ArrayList<Weapons>();

	//Cygnar Warcasters
	public static ArrayList<Weapons> sloan1 = new ArrayList<Weapons>(Arrays.asList(libraries.Weapons.spitFire, libraries.Weapons.sword));

	//Cygnar Warjacks
	public static ArrayList<Weapons> defender = new ArrayList<Weapons>(Arrays.asList(libraries.Weapons.heavyBarrel, libraries.Weapons.shockHammer));

	//Menoth Solos
	public static ArrayList<Weapons> championOrderOfTheWall = new ArrayList<Weapons>(Arrays.asList(libraries.Weapons.blazingLance, libraries.Weapons.sword2closeCombat, libraries.Weapons.shield2, libraries.Weapons.mount12ck));
	public static ArrayList<Weapons> championOrderOfTheWallDismount = new ArrayList<Weapons>(Arrays.asList(libraries.Weapons.sword12wm, libraries.Weapons.shield2));
	public static ArrayList<Weapons> handOfSilence = new ArrayList<Weapons>(Arrays.asList(libraries.Weapons.flameThrower, libraries.Weapons.usher, libraries.Weapons.mount12));
	public static ArrayList<Weapons> initiateTristanDurant = new ArrayList<Weapons>(Arrays.asList(libraries.Weapons.battleStaff));
	public static ArrayList<Weapons> vassalMechanik = new ArrayList<Weapons>(Arrays.asList(libraries.Weapons.multiTool));
	public static ArrayList<Weapons> vilmon = new ArrayList<Weapons>(Arrays.asList(libraries.Weapons.censure));
	
	//Menoth Units
	public static ArrayList<Weapons> choirOfMenoth = new ArrayList<Weapons>(Arrays.asList(libraries.Weapons.battleStaff2));
	public static ArrayList<Weapons> holyZealots = new ArrayList<Weapons>(Arrays.asList(libraries.Weapons.fireBomb, libraries.Weapons.mace));
	
	//Menoth Warcasters
	public static ArrayList<Weapons> durst = new ArrayList<Weapons>(Arrays.asList(libraries.Weapons.recompense));

	//Menoth Warjacks
	public static ArrayList<Weapons> sanctifier = new ArrayList<Weapons>(Arrays.asList(libraries.Weapons.openFist14, libraries.Weapons.graveMaker));
	public static ArrayList<Weapons> templar = new ArrayList<Weapons>(Arrays.asList(libraries.Weapons.shield, libraries.Weapons.flail));

	//Mercenary Solos
	public static ArrayList<Weapons> meniteArchon = new ArrayList<Weapons>(Arrays.asList(libraries.Weapons.blazingSword, libraries.Weapons.flail2));
}
