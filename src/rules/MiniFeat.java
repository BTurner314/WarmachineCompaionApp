package rules;

import libraries.Abilities;

public class MiniFeat extends Abilities {
private Boolean isUsed;
	public MiniFeat(String name, String abilityText) {
		super(name, abilityText);
		isUsed = false;
	}

}
