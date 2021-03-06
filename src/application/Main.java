package application;
	
import dataGUIManager.TableController;
import mainInfoManager.MainInfo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		mainInfoManager.MainInfo stSt = new mainInfoManager.MainInfo();
		stSt.initialize();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/MainGUI.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			//primaryStage.setTitle("Database Evolution Monitor");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
