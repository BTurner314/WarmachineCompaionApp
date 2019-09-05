package models;

import java.util.ArrayList;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import libraries.Abilities;
import libraries.Feats;
import libraries.Spells;

public class Warcaster extends WarriorModel{
	private ArrayList<libraries.Spells> spells;
	private int focus;
	private Feats feat;
	private Image spellCard;
	private Image featCard;
	private int warjackPoints;
	
	public Warcaster(int warjackPoints, String name, String faction, String fieldAllowance, Image frontCard, Image backCard,
			ArrayList<Weapons> weapons, ArrayList<Abilities> abilities, int speed, int str, int mat, int rat, int def,
			int arm, int cmd, int health, ArrayList<libraries.Spells> spells, int focus, Feats feat, Image spellCard, Image featCard) {
		super(name, faction, fieldAllowance, frontCard, backCard, weapons, abilities, speed, str, mat, rat, def, arm,
				cmd, health);
		this.spells = new ArrayList<libraries.Spells>();
		this.spellCard = spellCard;
		this.featCard = featCard;
		this.spells = spells;
		this.focus = focus;
		this.feat = feat;
		this.warjackPoints = warjackPoints;
	}
	
	@Override
	public void changeImage() {
		if (frontCardView.getImage().equals(frontCard)) {
			frontCardView.setImage(backCard);
		}
		else if (frontCardView.getImage().equals(backCard)) {
			frontCardView.setImage(spellCard);
		}
		else if (frontCardView.getImage().equals(spellCard)) {
			frontCardView.setImage(featCard);
		}
		else if (frontCardView.getImage().equals(featCard)) {
			frontCardView.setImage(frontCard);
		}
	}

}





