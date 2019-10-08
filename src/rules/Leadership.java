package rules;

import libraries.Abilities;

public class Leadership extends Abilities{
	private String subType;

	public Leadership(String name, String subType, String abilityText) {
		super(name, abilityText);
		this.subType = subType;
	}

}
