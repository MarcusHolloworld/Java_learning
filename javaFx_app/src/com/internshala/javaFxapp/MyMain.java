package com.internshala.javaFxapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MyMain extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("app_layout.fxml"));
		Pane rootNode = loader.load();

		Scene scene = new Scene(rootNode, 300, 275);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Hello javaFx");
		primaryStage.show();
	}
}
