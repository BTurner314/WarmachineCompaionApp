package libraries;

public class Feats {

	private String name;
	private String effect;

	public Feats(String name, String effect) {
		this.name = name;
		this.effect = effect;
	}

	//Cygnar Warcasters
	public static Feats sloan1 = new Feats("Firing Squad", "Sloan immediately casts Fire Group without spending focus. Additionally, Sloan and models in her battlegroup beginning their activations in her control range can make one additional ranged attack during their activations. Firing squad lasts for one turn.");

	//Menoth Warcasters
	public static Feats durst = new Feats("Bastion of Faith", "While in Durst's control range, warjacks in his battlegroup gain +4 ARM and Brace for Impact. When a friendly Faction warrior model in Durst's control range is directly hit by an attack while B2B with a warjack in Durst's battlegroup, you can choose to have the warjack be directly hit instead. The warjack is automatically hit and suffers all damage and effects from the attack. Bastion of Faith lasts for one round." );
}
