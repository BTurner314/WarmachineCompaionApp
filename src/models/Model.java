package models;

import java.util.ArrayList;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import libraries.Abilities;

public abstract class Model {
	protected Image frontCard;
	protected Image backCard;
	private String name;
	private String faction;
	private String fieldAllowance;
	private ArrayList<Weapons> weapons;
	private ArrayList<Abilities> abilities;
	private int[] stats;
	private Button mainButton;
	protected Button increaseHealth;
	protected Button decreaseHealth;
	protected ImageView frontCardView;
	protected VBox cards;
	protected VBox healthBar;
	private int health;
	protected Label currentHealthLabel;
	private int currentHealth;
	public StringProperty currentHealthText;

	public Model(String name, String faction, String fieldAllowance, Image frontCard,Image backCard, ArrayList<Weapons> weapons, ArrayList<Abilities> abilities, int speed, int str, int mat, int rat, int def, int arm, int cmd, int health) {
		stats = new int[7];
		mainButton = new Button();
		increaseHealth = new Button();
		decreaseHealth = new Button();
		currentHealthLabel = new Label();
		currentHealthText = new SimpleStringProperty(); 
		frontCardView = new ImageView();
		frontCardView.setImage(frontCard);
		cards = new VBox();
		healthBar = new VBox();
		this.weapons = new ArrayList<Weapons>();
		this.abilities = new ArrayList<Abilities>();
		this.name = name;
		this.faction = faction;
		this.fieldAllowance = fieldAllowance;
		this.frontCard = frontCard;
		this.backCard = backCard;
		this.weapons = weapons;
		this.abilities = abilities;
		this.stats[0] = speed;
		this.stats[1] = str;
		this.stats[2] = mat;
		this.stats[3] = rat;
		this.stats[4] = def;
		this.stats[5] = arm;
		this.stats[6] = cmd;
		mainButton.setText(this.name);
		increaseHealth.setText("^");
		increaseHealth.setMinSize(50, 50);
		decreaseHealth.setText("V");
		decreaseHealth.setMinSize(50, 50);
		mainButton.setOnAction(e -> imageView());
		frontCardView.setOnMouseClicked((MouseEvent e) -> {
			changeImage();
		});
		increaseHealth.setOnAction(e -> healDamage());
		decreaseHealth.setOnAction(e -> takeDamage());
		this.health = health;
		currentHealth = health;
		currentHealthText.setValue("Health: " + currentHealth);
		currentHealthLabel.textProperty().bind(currentHealthText);
		currentHealthLabel.setFont(Font.font("Arial", 30));
	}

	
	public Button getButton() {
		return mainButton;
	}

	//sets the screen for each unit
	public void imageView() {
		cards.getChildren().clear();
		healthBar.getChildren().clear();
		cards.getChildren().addAll(frontCardView);
		healthBar.getChildren().addAll(currentHealthLabel, increaseHealth, decreaseHealth);
		libraries.main.mainWindow.setRight(cards);
		libraries.main.mainWindow.setCenter(healthBar);
	}

	//changes the card between images
	public void changeImage() {
		if (frontCardView.getImage().equals(frontCard)) {
			frontCardView.setImage(backCard);
		}
		else if (frontCardView.getImage().equals(backCard)) {
			frontCardView.setImage(frontCard);
		}
	}

	

	@Override
	public String toString() {
		String formatted = name + " " + faction; 
		return formatted;
	}
	//lowers the health by 1
	public void takeDamage() {
		if (currentHealth > 0) {
			currentHealth--;
			currentHealthText.setValue("Health: " + currentHealth);
		}
		
	}	

	//increases the health by 1
	public void healDamage() { 
		if (currentHealth < health) {
			currentHealth++;
			currentHealthText.setValue("Health: " + currentHealth);
		}
	}
}
