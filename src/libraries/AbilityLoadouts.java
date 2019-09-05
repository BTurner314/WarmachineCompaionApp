package libraries;

import java.util.ArrayList;
import java.util.Arrays;

public class AbilityLoadouts {

	public static ArrayList<Abilities> none = new ArrayList<Abilities>();

	//Cygnar Warcaster
	public static ArrayList<Abilities> sloan1 = new ArrayList<Abilities>(Arrays.asList(Abilities.fmtrueSight, Abilities.trueSight));

	//Cygnar Warjacks

	public static ArrayList<Abilities> defender = new ArrayList<Abilities>(Arrays.asList(Abilities.construct));

	//Menoth Warcasters
	public static ArrayList<Abilities> durst = new ArrayList<Abilities>(Arrays.asList(Abilities.braceForImpact, Abilities.retaliatoryStrike, Abilities.sturdy));

	//Menoth Warjacks
	public static ArrayList<Abilities> sanctifier = new ArrayList<Abilities>(Arrays.asList(Abilities.ashenVeil, Abilities.exorcist, Abilities.soulTakerCenotaph, Abilities.construct, Abilities.immunityFire));
}
