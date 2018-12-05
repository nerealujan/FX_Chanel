package application;
	
import java.io.IOException;

import application.Controller.SetBlur;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private AnchorPane mypane;

	// modifica el método start de la clase principal
	@Override
	public void start(Stage stage) throws IOException {

		// primero cargamos la vista fxml en el FXMLLoader
		FXMLLoader loader = new FXMLLoader(getClass().getResource(
				"ChanelFX.fxml"));

		// y opcionalmente un controlador para inicializar algún componente

		// ahora sobre el panel mypane cargamos la vista que dejamos en el
		// FXMLLoader
		mypane =loader.load();
		// añade la escena al stage y la titula
		stage.setTitle("Where's the squirrel?");
		stage.setScene(new Scene(mypane));
		stage.show();
	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
