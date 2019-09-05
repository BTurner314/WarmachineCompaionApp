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
		centerBox.getChildren().addAll(menoth.Warcasters.ansonDurst.getButton(),menoth.Warjacks.sanctifier.getButton() );
		
		mainWindow.setLeft(centerBox);
		Scene mainScene = new Scene(mainWindow, 2160, 1440);
		
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}
}