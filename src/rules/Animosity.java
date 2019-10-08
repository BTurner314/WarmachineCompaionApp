package rules;

import libraries.Abilities;

public class Animosity extends Abilities {
private String subType;
	public Animosity(String name, String abilityText, String subType) {
		super(name, abilityText);
		this.subType = subType;
	}

}
