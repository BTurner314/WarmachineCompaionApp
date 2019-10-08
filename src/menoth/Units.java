package menoth;

import javafx.scene.image.Image;
import libraries.AbilityLoadouts;
import libraries.WeaponLoadouts;

public class Units {

	//Choir of Menoth
	public static Image choirOfMenothFrontCard = new Image(Units.class.getResourceAsStream("/Images/Menoth/MenothUnits/choirFrontCard.png"));
	public static Image choirOfMenothBackCard = new Image(Units.class.getResourceAsStream("/Images/Menoth/MenothUnits/choirBackCard.png"));
	public static models.Grunt choirOfMenothGrunt = new models.Grunt("Choir of Menoth", "Menoth", "Protectorate Unit", WeaponLoadouts.choirOfMenoth,AbilityLoadouts.choirOfMenoth, 6, 4, 4, 4, 12, 12, 6, 1);
	public static models.Leader	choirOfMenothLeader = new models.Leader("Choir of Menoth", "Protectorate Unit", "Menoth", "2", choirOfMenothFrontCard, choirOfMenothBackCard, WeaponLoadouts.choirOfMenoth, AbilityLoadouts.choirOfMenoth, 6, 4, 4, 4, 12, 12, 6, 1);
	public static models.Unit choirOfMenoth = new models.Unit(choirOfMenothLeader, choirOfMenothGrunt, 4, 6, 4, 6);

	//Holy Zealots
	public static Image holyZealotsFrontCard = new Image(Units.class.getResourceAsStream("/Images/Menoth/MenothUnits/holyZealotsFrontCard.png"));
	public static Image holyZealotsBackCard = new Image(Units.class.getResourceAsStream("/Images/Menoth/MenothUnits/holyZealotsBackCard.png"));
	public static models.Grunt holyZealotsGrunt = new models.Grunt("Holy Zealots", "Menoth", "Protectorate Unit", WeaponLoadouts.holyZealots, AbilityLoadouts.holyZealots, 6, 4, 5, 5, 12, 12, 6, 1);
	public static models.Leader holyZealotsLeader = new models.Leader("Holy Zealots", "Protectorate Unit", "Menoth", "3", holyZealotsFrontCard, holyZealotsBackCard, WeaponLoadouts.holyZealots, AbilityLoadouts.holyZealots, 6, 4, 5, 5, 12, 12, 6, 1);
public static models.Unit holyZealots = new models.Unit(holyZealotsLeader, holyZealotsGrunt, 6, 10, 7, 12);
	//Monolith Bearer
	public static Image monolithBearerFrontCard = new Image(Units.class.getResourceAsStream("/Images/Menoth/MenothUnits/monolithBearerFrontCard.png"));
	public static Image monolithBearerBackCard = new Image(Units.class.getResourceAsStream("/Images/Menoth/MenothUnits/monolithBearerBackCard.png"));
	public static models.CommandAttachment monolithBearer = new models.CommandAttachment("MonolithBearer", "Protecto", 3, "Menoth", "3", holyZealots, monolithBearerFrontCard, monolithBearerBackCard, WeaponLoadouts.championOrderOfTheWall, AbilityLoadouts.championOfTheOrderOfTheWall, 6, 6, 5, 4, 12, 12, 8, 5);
}
