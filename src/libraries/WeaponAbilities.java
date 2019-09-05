package libraries;

public class WeaponAbilities extends Abilities {

	public WeaponAbilities(String name, String abilityText) {
		super(name, abilityText);

	}
	
	public static WeaponAbilities cortexDamage = new WeaponAbilities("Cortex Damage", "When a warjack is hit by this weapon, it suffers 1 damage point to its first available Cortex system box.");
	public static WeaponAbilities eruptionOfAsh = new WeaponAbilities("Eruption of Ash", "If a model is boxed by an attack made with this weapon, center a 3in AOE cloud effect on the boxed model "
			+ "and then remove that model from play. The AOE is a hazard that remains in play for one round. Enemy models in the AOE when it was put in play are hit and suffer a POW 12 fire damage roll."
			+ "Enemy models entering or ending their activations in the AOE suffer a POW 12 fire damage roll. Eruption of Ash damage rolls cannot be boosted." );
	public static WeaponAbilities openFist = new libraries.WeaponAbilities("Open Fist", "This weapon is an Open Fist. A warjack can use a weapon with an Open Fist to make some power attacks.");
	public static WeaponAbilities weaponMaster = new WeaponAbilities("Weapon Master", "When attacking with this weapon, add an additional die to its damage roll");
}
