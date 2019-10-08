package rules;

import libraries.Abilities;

public class partisan extends Abilities{
	private String subType;
	public partisan(String name, String abilityText, String subType) {
		super(name, abilityText);
		this.subType = subType;
	
	}

}
