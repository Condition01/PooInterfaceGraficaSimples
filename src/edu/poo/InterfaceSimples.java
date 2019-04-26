package edu.poo;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

class Manipulador implements EventHandler<MouseEvent>{

	@Override
	public void handle(MouseEvent e) {
		System.exit(0);
	}
	
}


public class InterfaceSimples extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		Manipulador man = new Manipulador();
		BorderPane panel = new BorderPane();
		Label lbl = new Label("Ola...!!!!");
		Button btn = new Button("Sair");
		
		Scene scn = new Scene(panel, 200, 200);

		panel.setLeft(lbl);
		panel.setBottom(btn);

		lbl.relocate(200, 200);
		
		btn.setPrefWidth(200);
		btn.addEventFilter(MouseEvent.MOUSE_CLICKED, man);
		
		stage.setScene(scn);
		stage.setTitle("Janela de Teste");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
