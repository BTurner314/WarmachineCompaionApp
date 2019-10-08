package menoth;

import java.util.ArrayList;

import com.sun.javafx.tk.Toolkit;

import javafx.scene.image.Image;
import libraries.AbilityLoadouts;
import libraries.Feats;
import libraries.SpellLoadouts;
import models.Warcaster;

public class Warcasters {
	public static ArrayList<Warcaster> menothWarcasters = new ArrayList<Warcaster>();
	
	//Anson Durst
	static Image durstFrontCard = new Image(Warcasters.class.getResourceAsStream("/Images/Menoth/MenothWarcasters/durstFrontCard.png"));
	static Image durstBackCard = new Image(Warcasters.class.getResourceAsStream("/Images/Menoth/MenothWarcasters/durstBackCard.png"));
	static Image durstSpellCard = new Image(Warcasters.class.getResourceAsStream("/Images/Menoth/MenothWarcasters/durstSpellCard.png"));
	static Image durstFeatCard = new Image(Warcasters.class.getResourceAsStream("/Images/Menoth/MenothWarcasters/durstFeatCard.png"));
	public static models.Warcaster ansonDurst = new models.Warcaster("Anson Durst, Rock of the Faith" ,"Protectorate Paladin Warcaster" ,"Menoth", 28, "C", durstFrontCard, durstBackCard, libraries.WeaponLoadouts.durst, AbilityLoadouts.durst, 5, 7, 8, 4, 13, 18, 10, 19, SpellLoadouts.durst, 6, Feats.durst, durstSpellCard, durstFeatCard);
}
