package rules;

import libraries.Abilities;

public class Attachment extends Abilities{
private String subType;
	public Attachment(String name, String subType, String abilityText) {
		super(name, abilityText);
		this.subType = subType;
	}

}
