package libraries;

public class Spells {
	private String name;
	private int cost;
	private String range;
	private String aoe;
	private int pow;
	private String duration;
	private boolean isOffensive;
	private String effect;

	public Spells(String name, int cost, String range, String aoe, int pow, String duration, boolean isOffensive, String effect) {
		this.name = name;
		this.cost = cost;
		this.range = range;
		this.aoe = aoe;
		this.pow = pow;
		this.duration = duration;
		this.isOffensive = isOffensive;
		this.effect = effect;
	}

	public static Spells boundlessCharge = new Spells("Boundless Charge", 2, "6", "0", 0, "Turn", false, "During its activation, target friendly Faction model can charge without spending focus or being forced and gains +2in movement and Pathfinder when it charges. Boundless Charge lasts for one turn." );
	public static Spells bulwark = new Spells("Bulwark", 2, "Self", "CTRL", 0, "UP", false, "While in the spellcaster's control range and B2B with one or more models in its battlegroup, models in the spellcaster's battlegroup gain +2 DEF and cannot become knocked down.");
	public static Spells cleansingFire = new Spells("Cleansing Fire", 3, "8", "3", 14, null, true, "Cleansing Fire causes fire damage. On a critical hit, models hit suffer the Fire continous effect.");
	public static Spells deceleration = new Spells("Deceleration", 3, "Self", "CTRL", 0, "RND", false, "While in the spellcaster's control range, friendly Faction models gain +2 ARM against ranged and magic attack damage rolls. Deceleration lasts for one round. ");
	public static Spells dustToDust = new Spells("Dust to Dust" , 2, "10", null, 12, "*", true, "When an enemy warrior model is boxed by Dust to Dust, center a 3 inch AOE cloud effect on it, then remove the model from play. The AOE remains in play for one round.");
	public static Spells fireGroup = new Spells("Fire Group", 2, "Self", "CTRL", 0, "Turn", false, "While models in the spellcaster's battlegroup are in its control range, their ranged weapons gain +2 RNG. Fire Group lasts for one turn.");
	public static Spells guidedFire = new Spells("Guided Fire", 3, "Self", "CTRL", 0, "Turn", false, "While in the spellcaster's control range, models in its battlegroup gain boosted ranged attack rolls for one turn.");
	public static Spells hallowedAvenger = new Spells("Hallowed Avenger", 2, "6", null, 0, "UP", false, "Target friendly Faction warjack gains Righteous Vengeance. (If one or more friendly Faction warrior models were destroyed or removed from play by enemy attacks while within 5in of a model with Righteous Vengeance during the last round, during your Maintenance Phase the model with Righteous Vengeance can advance up top 3in and make one basic melee attack.");
	public static Spells refuge = new Spells("Refuge", 2, "6", null, 0, "UP", false, "At the end of an activation in which target friendly faction model hit an enemey model with an attack, the affected model can make a full advance. It cannot be targeted by free strikes during this movement.");
	public static Spells returnFire = new Spells("Return Fire", 1, "6", null, 0, "RND", false, "When target friendly faction model is targeted by an enemy ranged attack, after the attack is resolved the affected model can make one basic melee or ranged attack, then Return Fire expires. Return Fire lasts for one round.");
}
