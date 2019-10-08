package rules;

import libraries.Abilities;

public class EliteCadre extends Abilities{
private String subType;

	public EliteCadre(String name, String subType, String abilityText) {
		super(name, abilityText);
		
		this.subType = subType;
	}

}
