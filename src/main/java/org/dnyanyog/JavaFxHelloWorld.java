package org.dnyanyog;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;
import javafx.scene.paint.Color;


public class JavaFxHelloWorld {


public static void main(String[] args) {
	Application.launch();
}


public void start(Stage primaryStage) throws Exception {
	// TODO Auto-generated method stub

	Stage stage = new Stage();
	stage.setTitle("First Window");
	stage.setFullScreen(true);
	stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

	Group actorGroup = new Group();

	Scene scene = new Scene(actorGroup , Color.RED);

	stage.setScene(scene);
	stage.show();

}

}