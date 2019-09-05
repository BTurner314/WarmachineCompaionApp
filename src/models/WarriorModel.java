package models;

import java.util.ArrayList;

import javafx.scene.image.Image;
import libraries.Abilities;

public abstract class WarriorModel extends Model{
	private boolean isWarriorModel;
	
	public WarriorModel(String name, String faction, String fieldAllowance, Image frontCard,
			Image backCard, ArrayList<Weapons> weapons, ArrayList<Abilities> abilities, int speed, int str, int mat,
			int rat, int def, int arm, int cmd, int health) {
		super(name, faction, fieldAllowance, frontCard, backCard, weapons, abilities, speed, str, mat, rat, def, arm,
				cmd, health);
		isWarriorModel = true;
	}


}	


