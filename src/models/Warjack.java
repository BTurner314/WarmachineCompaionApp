package models;

import java.util.ArrayList;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import libraries.Abilities;


public abstract class Warjack extends Model{

	private Button[][] damageGrid;
	private  GridPane grid = new GridPane();
	private int i = 0;
	private int j = 0;
	private int pointCost;
	public Warjack(String name, String subType, String faction, int pointCost, String fieldAllowance, Image frontCard, Image backCard,
			ArrayList<Weapons> weapons, ArrayList<Abilities> abilities, int speed, int str, int mat, int rat, int def,
			int arm, int cmd, int health, ArrayList<Integer> startingDamage, ArrayList<Integer> cortex, ArrayList<Integer> movement, ArrayList<Integer> leftArm, ArrayList<Integer> rightArm) {
		super(name, subType, faction, fieldAllowance, frontCard, backCard, weapons, abilities, speed, str, mat, rat, def, arm,
				cmd, health);
	

		this.pointCost = pointCost;
		damageGrid = new Button[6][6];

		// generates a damage grid buttons
		for (i = 0; i < 6; i++) {
			for (j = 0; j < 6; j++) {
				damageGrid[i][j] = new Button("  ");
				Button myButton = damageGrid[i][j];
				myButton.setStyle("-fx-background-color: white; -fx-border-color: brown;");
				myButton.setMinSize(50, 50);
				myButton.setOnAction(e -> setDamage(myButton));
				grid.add(myButton, i, j);
			}
		}


		int column;
		int row;
		for (int temp = 0;temp < startingDamage.size(); temp+=2) {
			column = startingDamage.get(temp);
			row = startingDamage.get(temp + 1);
			setGrid(column, row);
		}

		for (int temp = 0;temp < cortex.size(); temp+=2) {
			column = cortex.get(temp);
			row = cortex.get(temp + 1);
			setCortex(column, row);
		}

		for (int temp = 0;temp < movement.size(); temp+=2) {
			column = movement.get(temp);
			row = movement.get(temp + 1);
			setMovement(column, row);
		}

		for (int temp = 0;temp < leftArm.size(); temp+=2) {
			column = leftArm.get(temp);
			row = leftArm.get(temp + 1);
			setLeftArm(column, row);
		}

		for (int temp = 0;temp < rightArm.size(); temp+=2) {
			column = rightArm.get(temp);
			row = rightArm.get(temp + 1);
			setRightArm(column, row);
		}
	}

	//changes color of the grid to display damage
	public void setDamage(Button input) {
		if (input.getStyle().contains("white")) {
			input.setStyle("-fx-background-color: red; -fx-border-color: brown;");
		}
		else if (input.getStyle().contains("red")){
			input.setStyle("-fx-background-color: white; -fx-border-color: brown;");
		}
	}

	//sets starting grid black boxes
	public void setGrid(int column, int row) {
		this.damageGrid[column][row].setStyle("-fx-background-color: black; -fx-border-color: brown;");
	}

	//sets the cortex
	public void setCortex(int column, int row) {
		this.damageGrid[column][row].setText("C");
	}

	public void setMovement(int column, int row) {
		this.damageGrid[column][row].setText("M");
	}

	public void setLeftArm(int column, int row) {
		this.damageGrid[column][row].setText("L");
	}

	public void setRightArm(int column, int row) {
		this.damageGrid[column][row].setText("R");
	}

	//overrides the imageView to display the damage grid.
	@Override
	public void imageView() {
		cards.getChildren().clear();
		healthBar.getChildren().clear();
		cards.getChildren().addAll(frontCardView);
		libraries.main.mainWindow.setBottom(null);
		libraries.main.mainWindow.setRight(cards);
		libraries.main.mainWindow.setCenter(this.grid);;
	}
}
