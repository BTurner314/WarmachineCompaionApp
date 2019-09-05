package libraries;

import java.util.ArrayList;
import java.util.Arrays;

import models.Weapons;

public class WeaponLoadouts {

	
	//Cygnar Warcasters
public static ArrayList<Weapons> sloan1 = new ArrayList<Weapons>(Arrays.asList(libraries.Weapons.spitFire, libraries.Weapons.sword));

    //Cygnar Warjacks
public static ArrayList<Weapons> defender = new ArrayList<Weapons>(Arrays.asList(libraries.Weapons.heavyBarrel, libraries.Weapons.shockHammer));

	//Menoth Warcasters
public static ArrayList<Weapons> durst = new ArrayList<Weapons>(Arrays.asList(libraries.Weapons.recompense));

	//Menoth Warjacks
public static ArrayList<Weapons> sanctifier = new ArrayList<Weapons>(Arrays.asList(libraries.Weapons.openFist14, libraries.Weapons.graveMaker));
}
