package models;

import java.util.ArrayList;

import javafx.scene.image.Image;
import libraries.Abilities;

public class Solo extends WarriorModel {
	private int pointCost;
	
	public Solo(String name, String subType, int pointCost, String faction, String fieldAllowance, Image frontCard, Image backCard,
			ArrayList<Weapons> weapons, ArrayList<Abilities> abilities, int speed, int str, int mat, int rat, int def,
			int arm, int cmd, int health) {
		super(name, subType, faction, fieldAllowance, frontCard, backCard, weapons, abilities, speed, str, mat, rat, def, arm,
				cmd, health);
		// TODO Auto-generated constructor stub
	
		this.pointCost = pointCost;
	}

}
