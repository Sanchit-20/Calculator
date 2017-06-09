package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));  // root node of scene graph is created.
			
			Scene scene = new Scene(root,400,400);  //Scene is created
		
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);        // Setting the scene to the stage
			primaryStage.setTitle("Calculator"); // Setting title of Stage
			primaryStage.show();                 // To show the Application
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args); // static method to launch the application. This method automatically calls the start method of the application
	}
}
