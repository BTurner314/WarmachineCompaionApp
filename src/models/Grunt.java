package models;

import java.util.ArrayList;

import javafx.scene.image.Image;
import libraries.Abilities;

public class Grunt {
	private String name;
	private String faction;
	private String subType;
	private ArrayList<Weapons> weapons = new ArrayList<Weapons>();
	private ArrayList<Abilities> abilities = new ArrayList<Abilities>();
	private int[] stats = new int[7];
	private Boolean isWarriorModel;
	private int health;

	public Grunt(String name, String faction, String subType, ArrayList<Weapons> weapons, ArrayList<Abilities> abilities, int speed, int str, int mat, int rat, int def,
			int arm, int cmd, int health) {
		this.name = name;
		this.faction = faction;
		this.subType = subType;
		this.weapons = weapons;
		this.abilities = abilities;
		this.stats[0] = speed;
		this.stats[1] = str;
		this.stats[2] = mat;
		this.stats[3] = rat;
		this.stats[4] = def;
		this.stats[5] = arm;
		this.stats[6] = cmd;
		this.health = health;
		this.isWarriorModel = true;

	}

}
