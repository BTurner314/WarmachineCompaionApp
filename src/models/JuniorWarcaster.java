package models;

import java.util.ArrayList;

import javafx.scene.image.Image;
import libraries.Abilities;
import libraries.Spells;

public class JuniorWarcaster extends Solo {
	private ArrayList<Spells> spellList = new ArrayList<Spells>();
	private int focus;
	
	public JuniorWarcaster(String name, String subType, int pointCost, String faction, String fieldAllowance,
			Image frontCard, Image backCard, ArrayList<Weapons> weapons, ArrayList<Abilities> abilities, ArrayList<Spells> spellList, int speed,
			int str, int mat, int rat, int def, int arm, int cmd, int health, int focus) {
		super(name, subType, pointCost, faction, fieldAllowance, frontCard, backCard, weapons, abilities, speed, str, mat, rat,
				def, arm, cmd, health);

		this.spellList = spellList;
		this.focus = focus;
	}

}
