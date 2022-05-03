package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DollarMain extends Application {
	@Override
	public void start(Stage stage) {

		try {
			AnchorPane root = FXMLLoader.load(getClass().getResource("FxmlDollar.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
		} catch (IOException e) {
			e.printStackTrace();
		}

		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
