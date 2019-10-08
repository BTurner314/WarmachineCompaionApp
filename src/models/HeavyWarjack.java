package models;

import java.util.ArrayList;

import javafx.scene.image.Image;
import libraries.Abilities;


public class HeavyWarjack extends Warjack{

	public HeavyWarjack(String name, String subType, String faction, int pointCost, String fieldAllowance,
			Image frontCard, Image backCard, ArrayList<Weapons> weapons, ArrayList<Abilities> abilities, int speed,
			int str, int mat, int rat, int def, int arm, int cmd, int health, ArrayList<Integer> startingDamage,
			ArrayList<Integer> cortex, ArrayList<Integer> movement, ArrayList<Integer> leftArm,
			ArrayList<Integer> rightArm) {
		super(name, subType, faction, pointCost, fieldAllowance, frontCard, backCard, weapons, abilities, speed, str, mat, rat,
				def, arm, cmd, health, startingDamage, cortex, movement, leftArm, rightArm);
		// TODO Auto-generated constructor stub
	}
	
}
