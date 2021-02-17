package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class click extends Application {

	@Override
	public void start(Stage primaryStage) {
	GridPane gp=new GridPane();
	Label name=new Label("Name :-");	
	gp.add(name,0,0);
	TextField tf=new TextField();
	gp.add(tf,1,0);
	Label password=new Label("Password :-");	
	gp.add(password,0,1);
	PasswordField pf=new PasswordField();
	gp.add(pf,1,1);
	Scene scene=new Scene(gp,400,400);
	Button btn=new Button("Submit");
	gp.add(btn,1, 2);
	primaryStage.setScene(scene);
	primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
