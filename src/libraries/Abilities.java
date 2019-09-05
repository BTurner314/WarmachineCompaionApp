package libraries;

public class Abilities {

	private String name;
	private String abilityText;	

	public Abilities(String name, String abilityText) {
		this.name = name;
		this.abilityText = abilityText;
	}
	public static Abilities ashenVeil = new libraries.Abilities("Ashen Veil", "This model has concealment. Living enemy models without Immunity:Fire suffer -2 to attack rolls while within 2in of this model.");
	public static Abilities braceForImpact = new Abilities("Brace for Impact", "This model is not moved when slammed.");
	public static Abilities construct = new Abilities("Construct", "This model is a construct and is not a living model.");
	public static Abilities exorcist = new libraries.Abilities("Exorcist", "While within 10in of this model, enemy models lose Incorporeal");
	public static Abilities immunityFire = new libraries.Abilities("Immunity: Fire", "This model is immune to Fire Damage."); 
	public static rules.FieldMarshal fmtrueSight = new rules.FieldMarshal("Field Marshal[True Sight]", "Warjacks in this model's battlegroup gain True Sight.");
	public static Abilities retaliatoryStrike = new Abilities("Retaliatory Strike", "If this model is hit by a melee attack made by an enemy model during your opponent's turn,"
			+ "after that attack is resolved this model can immediately make one basic melee attack against that model. This model can make only one Retaliatory Strike per turn.");
	public static Abilities soulTakerCenotaph = new libraries.Abilities("Soul Taker:Cenotaph", "This model can gain souls. When a friendly living Faction model is destroyed within 5in of this model, this model gains the destroyed model's soul token. This model can have up to five soul tokans at any time. At the start of this model's activation, you can remove soul tokens from this model to give it 1 focus point for each token removed.");
	public static Abilities sturdy = new Abilities("Sturdy", "This model cannot be pushed.");
	public static Abilities trueSight = new Abilities("True Sight", "This model ignores cloud effects when determining LOS. This model also ignores Stealth.");

}
