package libraries;

public class WeaponAbilities extends Abilities {

	public WeaponAbilities(String name, String abilityText) {
		super(name, abilityText);

	}
	
	public static WeaponAbilities beatBack = new libraries.WeaponAbilities("Beat Back", "Immediately after a basic attack withi this weapon is resolbed during this model's Combat Action, the enemy model hit can be pushed 1in directly away from the attacking model. After the enemy model is pushed, the attacking model can advance up to 1in directly toward it.");
	public static WeaponAbilities blessed = new libraries.WeaponAbilities("Blessed", "Attacks with this weapon ignore bonuses from spells, including animi, that add to a model's ARM or DEF.");
	public static WeaponAbilities chainWeapon = new libraries.WeaponAbilities("Chain Weapon", "Attacks with this weapon ignore the Buckler and Shield weapon qualities and Shield Wall.");
	public static WeaponAbilities closeCombat = new libraries.WeaponAbilities("Close Combat", "This model cannot make an initial attack with this weapon during an activvation in which it charged at least 3in");
	public static WeaponAbilities continuousFire = new libraries.WeaponAbilities("Continuous Fire", "A model hit by this attack suffers the Fire continuous effect. A model on fire suffers a POW 12 fire damage roll each turn during its controller's Maintenance Phase until the continuous effect expires. Models with Immunity:Fire never suffer this continuous effect.");
	public static WeaponAbilities cortexDamage = new WeaponAbilities("Cortex Damage", "When a warjack is hit by this weapon, it suffers 1 damage point to its first available Cortex system box.");
	public static WeaponAbilities criticalFire = new libraries.WeaponAbilities("Critical Fire", "On a critical hit, the model hit is set on fire.");
	public static WeaponAbilities criticalKnockdown = new libraries.WeaponAbilities("Critical Knockdown", "On a critical hit, the model hit becomes knocked down.");
	public static WeaponAbilities dispel = new libraries.WeaponAbilities("Dispel", "When this weapon hits a model/unit, upkeep spells and animi on that model/unit immediately expire");
	public static WeaponAbilities eruptionOfAsh = new WeaponAbilities("Eruption of Ash", "If a model is boxed by an attack made with this weapon, center a 3in AOE cloud effect on the boxed model "
			+ "and then remove that model from play. The AOE is a hazard that remains in play for one round. Enemy models in the AOE when it was put in play are hit and suffer a POW 12 fire damage roll."
			+ "Enemy models entering or ending their activations in the AOE suffer a POW 12 fire damage roll. Eruption of Ash damage rolls cannot be boosted." );
	public static WeaponAbilities grievousWounds = new libraries.WeaponAbilities("Grievous Wounds", "A model hit by this weapon loses Tough and cannot have damage removed from it for one round.");
	public static WeaponAbilities lance = new libraries.WeaponAbilities("Lance", "This weapon can be used only to make charge attacks. This weapon's RNG is 0 unless this model charges. When this model charges, this weapon's RNG is 2 until the charge attack is resolved.");
	public static WeaponAbilities openFist = new libraries.WeaponAbilities("Open Fist", "This weapon is an Open Fist. A warjack can use a weapon with an Open Fist to make some power attacks.");
	public static WeaponAbilities shield = new libraries.WeaponAbilities("Shield", "This weapon is a shield that gives the model a cumulative +2 ARM bonus. A model does not gain this bonus while the weapon system with the shield is crippled or when resolving damage that originates in its back arc");
	public static WeaponAbilities thresher = new libraries.WeaponAbilities("Thresher", "This model makes one melee attack whit this weapon against each model in its LOS that is in this weapon's melee range. Thresher attacks are simultaneous.");
	public static WeaponAbilities weaponMaster = new WeaponAbilities("Weapon Master", "When attacking with this weapon, add an additional die to its damage roll");
}
