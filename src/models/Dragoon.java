package models;

import java.util.ArrayList;

import javafx.scene.image.Image;
import libraries.Abilities;

public class Dragoon extends Cavalry{
	private Solo dismount;
	public Dragoon(String name, String subType, int pointCost, String faction, String fieldAllowance, Image frontCard,
			Image backCard, ArrayList<Weapons> weapons, ArrayList<Abilities> abilities, int speed, int str, int mat,
			int rat, int def, int arm, int cmd, int health, Solo dismount) {
		super(name, subType, pointCost, faction, fieldAllowance, frontCard, backCard, weapons, abilities, speed, str, mat, rat,
				def, arm, cmd, health);

		this.dismount = dismount;

	}

	@Override 
	public void imageView() {
			cards.getChildren().clear();
			healthBar.getChildren().clear();
			cards.getChildren().addAll(frontCardView);
			healthBar.getChildren().addAll(currentHealthLabel, increaseHealth, decreaseHealth, dismount.currentHealthLabel, dismount.increaseHealth, dismount.decreaseHealth);
			libraries.main.mainWindow.setRight(cards);
			libraries.main.mainWindow.setCenter(healthBar);
		}
		@Override
		public void changeImage() {
			if (frontCardView.getImage().equals(frontCard)) {
				frontCardView.setImage(backCard);
			}
			else if (frontCardView.getImage().equals(backCard)) {
				frontCardView.setImage(dismount.frontCard);
			}
			else if (frontCardView.getImage().equals(dismount.frontCard)) {
				frontCardView.setImage(dismount.backCard);
			}
			else if (frontCardView.getImage().equals(dismount.backCard)) {
				frontCardView.setImage(frontCard);
			}
		}
	}

