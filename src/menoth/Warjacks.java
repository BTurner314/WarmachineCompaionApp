package menoth;

import java.util.ArrayList;
import java.util.Arrays;

import javafx.scene.image.Image;
import libraries.AbilityLoadouts;
import libraries.WeaponLoadouts;
import models.HeavyWarjack;
import models.Warjack;

public class Warjacks {

	public static ArrayList<Warjack> menothWarjacks = new ArrayList<Warjack>();
	
	//Heavy Chasis
	private static ArrayList<Integer> menothHeavyDamageGrid = new ArrayList<Integer>(Arrays.asList(0,0,0,5,5,0,5,5));
	private static ArrayList<Integer> menothHeavyCortex = new ArrayList<Integer>(Arrays.asList(3,4,3,5,4,5)); 
	private static ArrayList<Integer> menothHeavyMovement = new ArrayList<Integer>(Arrays.asList(2,4,2,5,1,5));
	private static ArrayList<Integer> menothHeavyLeftArm = new ArrayList<Integer>(Arrays.asList(0,4,1,3,1,4));
	private static ArrayList<Integer> menothHeavyRightArm = new ArrayList<Integer>(Arrays.asList(4,4,4,3,5,4));
	
 	//Sanctifier
private static Image sanctifierFrontCard = new Image(Warjacks.class.getResourceAsStream("/Images/Menoth/MenothWarjacks/sanctifierFrontCard.png"));
private static Image sanctifierBackCard = new Image(Warjacks.class.getResourceAsStream("/Images/Menoth/MenothWarjacks/sanctifierBackCard.png"));
public static HeavyWarjack sanctifier = new HeavyWarjack("Sanctifier", "Protectorate Heavy Warjack", "Menoth", 14, "U", sanctifierFrontCard, sanctifierBackCard, WeaponLoadouts.sanctifier, AbilityLoadouts.sanctifier, 5, 11, 6, 5, 10, 19, 0, 32, menothHeavyDamageGrid, menothHeavyCortex, menothHeavyMovement, menothHeavyLeftArm, menothHeavyRightArm);
public static HeavyWarjack sanctifier2 = new HeavyWarjack("Sanctifier", "Protectorate Heavy Warjack", "Menoth", 14, "U", sanctifierFrontCard, sanctifierBackCard, WeaponLoadouts.sanctifier, AbilityLoadouts.sanctifier, 5, 11, 6, 5, 10, 19, 0, 32, menothHeavyDamageGrid, menothHeavyCortex, menothHeavyMovement, menothHeavyLeftArm, menothHeavyRightArm);

	//Templar
private static Image templarFrontCard = new Image(Warjacks.class.getResourceAsStream("/Images/Menoth/MenothWarjacks/templarFrontCard.png"));
private static Image templarBackCard = new Image(Warjacks.class.getResourceAsStream("/Images/Menoth/MenothWarjacks/templarBackCard.png"));
public static HeavyWarjack templar = new models.HeavyWarjack("Templar","Protectorate Heavy Warjack", "Menoth", 15, "U", templarFrontCard, templarBackCard, libraries.WeaponLoadouts.templar, libraries.AbilityLoadouts.templar, 4, 11, 6, 5, 10, 19, 0, 32, menothHeavyDamageGrid, menothHeavyCortex, menothHeavyMovement, menothHeavyLeftArm, menothHeavyRightArm);
}
