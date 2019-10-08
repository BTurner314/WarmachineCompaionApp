package mercenaries;

import javafx.scene.image.Image;
import libraries.AbilityLoadouts;
import libraries.WeaponLoadouts;
import models.Solo;

public class Solos {

	//Menite Archon
	public static Image meniteArchonFC = new Image(Solos.class.getResourceAsStream("/Images/Mercenaries/Solos/meniteArchonFrontCard.png"));
	public static Image meniteArchonBC = new Image(Solos.class.getResourceAsStream("/Images/Mercenaries/Solos/meniteArchonFrontCard.png"));
	public static Solo meniteArchon = new models.Solo("Menite Archon", "Mercenary Solo", 8, "Mercenary", "2", meniteArchonFC, meniteArchonBC, WeaponLoadouts.meniteArchon, AbilityLoadouts.meniteArchon, 6, 9, 8, 3, 13, 19, 10, 15);
}
