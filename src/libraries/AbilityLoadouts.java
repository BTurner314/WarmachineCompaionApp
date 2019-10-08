package libraries;

import java.util.ArrayList;
import java.util.Arrays;

import rules.Animosity;
import rules.partisan;

public class AbilityLoadouts {

	public static ArrayList<Abilities> none = new ArrayList<Abilities>();

	//Cygnar Warcaster
	public static ArrayList<Abilities> sloan1 = new ArrayList<Abilities>(Arrays.asList(Abilities.fmtrueSight, Abilities.trueSight));

	//Cygnar Warjacks

	public static ArrayList<Abilities> defender = new ArrayList<Abilities>(Arrays.asList(Abilities.construct));

	//Menoth Solos
	public static ArrayList<Abilities> championOfTheOrderOfTheWallDismount = new ArrayList<Abilities>(Arrays.asList(Abilities.girded, Abilities.leadershipPaladin, Abilities.reposition3, Abilities.retaliatoryStrike, Abilities.steady, Abilities.sturdy, Abilities.tough));
	public static ArrayList<Abilities> championOfTheOrderOfTheWall = new ArrayList<Abilities>(Arrays.asList(Abilities.girded, Abilities.leadershipPaladin, Abilities.reposition3, Abilities.retaliatoryStrike, Abilities.steady, Abilities.sturdy));
	public static ArrayList<Abilities> handOfSilence = new ArrayList<Abilities>(Arrays.asList(Abilities.ashenVeil, Abilities.assault, Abilities.cavalry, Abilities.directSpirits, Abilities.reposition3, Abilities.soulTakerGatekeeper, Abilities.graveResonance, Abilities.soulPowered, Abilities.strengthOfDeath));
	public static ArrayList<Abilities> initiateTristanDurant = new ArrayList<Abilities>(Arrays.asList(Abilities.battlegroupController, Abilities.trueSight));
	public static ArrayList<Abilities> vassalOfMenoth = new ArrayList<Abilities>(Arrays.asList(Abilities.ironSentinel, Abilities.arcaneBolt, Abilities.empower, Abilities.enliven));
	public static ArrayList<Abilities> vassalMechanik = new ArrayList<Abilities>(Arrays.asList(Abilities.repaird31));
	public static ArrayList<Abilities> vilmon = new ArrayList<Abilities>(Arrays.asList(Abilities.eliteCadrePaladinOfTheOrderOfTheWall, Abilities.retaliatoryStrike, Abilities.shieldGuard, Abilities.stoneAndMortarStance));

	//Menoth Units
	public static ArrayList<Abilities> choirOfMenoth = new ArrayList<Abilities>(Arrays.asList(Abilities.hymm, Abilities.battle, Abilities.passage, Abilities.shielding));
	public static ArrayList<Abilities> holyZealots = new ArrayList<Abilities>(Arrays.asList(Abilities.prayers, Abilities.fervor, Abilities.pathOfFlames, Abilities.warding));

	//Menoth Warcasters
	public static ArrayList<Abilities> durst = new ArrayList<Abilities>(Arrays.asList(Abilities.braceForImpact, Abilities.retaliatoryStrike, Abilities.sturdy));

	//Menoth Warjacks
	public static ArrayList<Abilities> sanctifier = new ArrayList<Abilities>(Arrays.asList(Abilities.ashenVeil, Abilities.exorcist, Abilities.soulTakerCenotaph, Abilities.construct, Abilities.immunityFire));
	public static ArrayList<Abilities> templar = new ArrayList<Abilities>(Arrays.asList(Abilities.construct, Abilities.shieldGuard));

	//Mercenary Solos
public static ArrayList<Abilities> meniteArchon = new ArrayList<Abilities>(Arrays.asList(Mercenary.kp, partisan.partisanProtectorate, Animosity.animosityMorrowThamarite, Abilities.ashenVeil, Abilities.divineInspiration, Abilities.divineManifestation, Abilities.fuelForTheFlames, Abilities.righteousFury, Abilities.soulWard, Abilities.swiftVengeance, Abilities.immunityFire, Abilities.flight));
}
