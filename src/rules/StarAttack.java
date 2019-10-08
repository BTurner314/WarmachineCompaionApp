package rules;

public class StarAttack extends StarAction {
private int pow;

	public StarAttack(String name, String range,int pow, String abilityText) {
		super(name, range, abilityText);
		
		this.pow = pow;
	}

}
