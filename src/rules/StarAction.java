package rules;

import libraries.Abilities;

public class StarAction extends Abilities{
private String range;

	
	public StarAction(String name, String range, String abilityText) {
		super(name, abilityText);
		this.range = range;
	}

}
