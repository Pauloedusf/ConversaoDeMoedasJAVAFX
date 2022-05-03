package application;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FxmlDollarController implements Initializable {
	@FXML
	private Label resultado;
	@FXML
	private TextField moedaExtrangeira;
	@FXML
	private TextField valorReais;
	@FXML
	private ComboBox<String> cbCotacao;

	@FXML
	// Event Listener on Button.onAction
	public void acaoClique(ActionEvent event) {
		double total = Double.parseDouble(valorReais.getText()) / Double.parseDouble(moedaExtrangeira.getText());
		
		resultado.setText("Você tera: " + total + " " + cbCotacao.getValue());
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	@FXML
	public void mudarCotacao() {
		moedaExtrangeira.setPromptText("Cotacao do " + cbCotacao.getValue());
	}

}