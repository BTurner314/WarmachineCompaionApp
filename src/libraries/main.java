package libraries;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class main extends Application{
	public static BorderPane mainWindow = new BorderPane();
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Warmachine Companion App");
		VBox centerBox = new VBox();
		centerBox.getChildren().addAll(menoth.Warcasters.ansonDurst.getButton(),menoth.Warjacks.sanctifier.getButton(), menoth.Warjacks.sanctifier2.getButton(), menoth.Warjacks.templar.getButton(), menoth.Solos.championOfTheOrderOfTheWall.getButton(), menoth.Solos.championOfTheOrderOfTheWall2.getButton(), menoth.Solos.handOfSilence.getButton(), menoth.Solos.vilmon.getButton(), menoth.Solos.durant1.getButton(), menoth.Solos.vassalMechanik.getButton(), menoth.Units.choirOfMenoth.getButton(), menoth.Units.monolithBearer.getButton());
		
		mainWindow.setLeft(centerBox);
		Scene mainScene = new Scene(mainWindow, 2160, 1440);
		
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}
} 