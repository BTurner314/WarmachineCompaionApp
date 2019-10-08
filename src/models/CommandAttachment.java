package models;

import java.util.ArrayList;

import javafx.scene.image.Image;
import libraries.Abilities;

public class CommandAttachment extends Solo {
private Unit attachedTo;
	public CommandAttachment(String name, String subType, int pointCost, String faction, String fieldAllowance, Unit attachedTo,
			Image frontCard, Image backCard, ArrayList<Weapons> weapons, ArrayList<Abilities> abilities, int speed,
			int str, int mat, int rat, int def, int arm, int cmd, int health) {
		super(name, subType, pointCost, faction, fieldAllowance, frontCard, backCard, weapons, abilities, speed, str, mat, rat,
				def, arm, cmd, health);
		
		this.attachedTo = attachedTo;
	}

}
