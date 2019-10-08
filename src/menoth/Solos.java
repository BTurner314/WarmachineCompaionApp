package menoth;

import javafx.scene.image.Image;
import libraries.AbilityLoadouts;
import libraries.SpellLoadouts;
import libraries.WeaponLoadouts;

public class Solos {
	
	//Champion of the Order of the Wall(Dismount)
	public static Image cOOTWDFrontCard = new Image(Solos.class.getResourceAsStream("/Images/Menoth/MenothSolos/ChampionoftheOrderoftheWallDismountedFrontCard.png"));
	public static Image cOOTWDBackCard = new Image(Solos.class.getResourceAsStream("/Images/Menoth/MenothSolos/ChampionoftheOrderoftheWallDismountedBackCard.png"));
	public static models.Solo championOfTheOrderOfTheWallDismount = new models.Solo("Champion of the Order of the Wall", "Protectorate Paladin Dragoon Solo", 0, "Menoth", "2", cOOTWDFrontCard, cOOTWDBackCard, WeaponLoadouts.championOrderOfTheWallDismount, AbilityLoadouts.championOfTheOrderOfTheWallDismount, 6, 8,  8, 4, 13, 16, 9, 5);
	public static models.Solo championOfTheOrderOfTheWallDismount2 = new models.Solo("Champion of the Order of the Wall", "Protectorate Paladin Dragoon Solo", 0, "Menoth", "2", cOOTWDFrontCard, cOOTWDBackCard, WeaponLoadouts.championOrderOfTheWallDismount, AbilityLoadouts.championOfTheOrderOfTheWallDismount, 6, 8,  8, 4, 13, 16, 9, 5);
	
	//Champion of the Order of the Wall
	public static Image cOOTWFrontCard = new Image(Solos.class.getResourceAsStream("/Images/Menoth/MenothSolos/ChampionoftheOrderoftheWallFrontCard.png"));
	public static Image cOOTWBackCard = new Image(Solos.class.getResourceAsStream("/Images/Menoth/MenothSolos/ChampionoftheOrderoftheWallBackCard.png"));
	public static models.Dragoon championOfTheOrderOfTheWall = new models.Dragoon("Champion of the Order of the Wall", "Protectorate Paladin Dragoon Solo", 8, "Menoth", "2", cOOTWFrontCard, cOOTWBackCard, WeaponLoadouts.championOrderOfTheWall, AbilityLoadouts.championOfTheOrderOfTheWall, 8, 8, 8, 4, 13, 18, 9, 10, championOfTheOrderOfTheWallDismount);
	public static models.Dragoon championOfTheOrderOfTheWall2 = new models.Dragoon("Champion of the Order of the Wall", "Protectorate Paladin Dragoon Solo", 8, "Menoth", "2", cOOTWFrontCard, cOOTWBackCard, WeaponLoadouts.championOrderOfTheWall, AbilityLoadouts.championOfTheOrderOfTheWall, 8, 8, 8, 4, 13, 18, 9, 10, championOfTheOrderOfTheWallDismount2);

	//Hand of Silence
	public static Image hOSFrontCard = new Image(Solos.class.getResourceAsStream("/Images/Menoth/MenothSolos/handOfSilenceFrontCard.png"));
	public static Image hOSBackCard = new Image(Solos.class.getResourceAsStream("/Images/Menoth/MenothSolos/handOfSilenceBackCard.png"));
	public static models.Cavalry handOfSilence = new models.Cavalry("Hand of Silence", "Protectorate Reclaimer Solo", 3,"Menoth", "C", hOSFrontCard, hOSBackCard, WeaponLoadouts.handOfSilence, AbilityLoadouts.handOfSilence, 8, 7, 6, 6, 13, 16, 10, 10);

	//High Paladin Dartan Vilmon
	public static Image vilmonFrontCard = new Image(Solos.class.getResourceAsStream("/Images/Menoth/MenothSolos/vilmonFrontCard.png"));
	public static Image vilmonBackCard = new Image(Solos.class.getResourceAsStream("/Images/Menoth/MenothSolos/vilmonBackCard.png"));
	public static models.Solo vilmon = new models.Solo("High Paladin Darian Vilmon", "Protectorate Solo", 6, "Menoth", "C", vilmonFrontCard, vilmonBackCard, WeaponLoadouts.vilmon, AbilityLoadouts.vilmon, 6, 7, 9, 4, 13, 16, 10, 8);
	
	//Initiate Tristan Durant
	public static Image durant1FrontCard = new Image(Solos.class.getResourceAsStream("/Images/Menoth/MenothSolos/initiateTristanDurantFrontCard.png"));
	public static Image durant1BackCard = new Image(Solos.class.getResourceAsStream("/Images/Menoth/MenothSolos/initiateTristanDurantBackCard.png"));
	public static models.JuniorWarcaster durant1 = new models.JuniorWarcaster("Initiate Tristan Durant", "Protectorate Solo", 4, "Menoth", "C", durant1FrontCard, durant1BackCard, WeaponLoadouts.initiateTristanDurant, AbilityLoadouts.initiateTristanDurant, SpellLoadouts.durant1, 5, 5, 5, 4, 14, 15, 6, 5, 4);
	
	//Vassal of Menoth
	public static Image vassalOfMenothFrontCard = new Image(Solos.class.getResourceAsStream("/Images/Menoth/MenothSolos/vassalOfMenothFrontCard.png"));
	public static Image vassalOfMenothBackCard = new Image(Solos.class.getResourceAsStream("/Images/Menoth/MenothSolos/vassalOfMenothBackCard.png"));
	public static models.Spellcaster vassalOfMenoth = new models.Spellcaster("Vassal of Menoth", "Protectorate Solo", 3, "Menoth", "2", vassalOfMenothFrontCard, vassalOfMenothBackCard, WeaponLoadouts.none, AbilityLoadouts.vassalOfMenoth, 5, 5, 4, 4, 12, 12, 3, 5, 6);
	
	//Vassal Mechanik
	public static Image vassalMechanikFrontCard = new Image(Solos.class.getResourceAsStream("/Images/Menoth/MenothSolos/vassalMechanikFrontCard.png"));
	public static Image vassalMechanikBackCard = new Image(Solos.class.getResourceAsStream("/Images/Menoth/MenothSolos/vassalMechanikBackCard.png"));
	public static models.Solo vassalMechanik = new models.Solo("Vassal Mechanik", "Protectorate Solo" , 3, "Menoth", "3", vassalMechanikFrontCard, vassalMechanikBackCard, WeaponLoadouts.vassalMechanik, AbilityLoadouts.vassalMechanik, 5, 5, 4, 4, 12, 12, 5, 1);
}
