package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class calculator extends Application {
	Button addbtn=new Button("+");
	Button subbtn=new Button("-");
	Button divbtn=new Button("/");
	Button mulbtn=new Button("*");
	Button clrbtn=new Button("clear");
	TextField tf1=new TextField();
	TextField tf2=new TextField();
	Label lbl=new Label("Answer:=");
	Label frnt=new Label("Calculator");
	GridPane gp=new GridPane();
	VBox vb=new VBox();

	@Override
	public void start(Stage primaryStage) {
		gp.add(tf1,0,0);
		gp.add(tf2,1,0);
		gp.add(addbtn,0,1);
		gp.add(subbtn,1,1);
		gp.add(mulbtn,0,2);
		gp.add(divbtn,1,2);
		gp.add(lbl, 0,3);
		gp.add(clrbtn,1,3);
		clrbtn.setLayoutX(100);
		clrbtn.setLayoutY(100);
		gp.setHgap(3);
		gp.setVgap(3);
		setter();
		attach();
		Scene scene=new Scene(gp,350,350);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	private void setter()
	{
		addbtn.setPrefWidth(100);
		subbtn.setPrefWidth(100);
		mulbtn.setPrefWidth(100);
		divbtn.setPrefWidth(100);
		clrbtn.setPrefWidth(170);
		clrbtn.setPadding(new Insets(10));
	}
	private void attach()
	{
		addbtn.setOnAction(e->btncode(e));
		subbtn.setOnAction(e->btncode(e));
		mulbtn.setOnAction(e->btncode(e));
		divbtn.setOnAction(e->btncode(e));
		clrbtn.setOnAction(e->btncode(e));
	}

	private Object btncode(ActionEvent e) {
		int num1,num2;
		int ans=0;
		num1=Integer.parseInt(tf1.getText());
		num2=Integer.parseInt(tf2.getText());
		if(e.getSource()==clrbtn)
		{
			tf1.setText("");
			tf2.setText("");
			tf1.requestFocus();
		}
		else if(e.getSource()==addbtn)
		{
			ans=num1+num2;
		}
		else if(e.getSource()==subbtn)
		{
			ans=num1-num2;
		}
		else if(e.getSource()==mulbtn)
		{
			ans=num1*num2;
		}
		else
		{
			ans=num1/num2;
		}
		lbl.setText(""+ans);
		return null;
	}
	public static void main(String[] args) {
		launch(args);
	}
}
