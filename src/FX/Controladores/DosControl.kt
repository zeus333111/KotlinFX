package FX.Controladores

import javafx.fxml.Initializable
import java.net.URL
import java.util.ResourceBundle
import javafx.scene.control.Button
import javafx.fxml.FXML
import FX.Main
import javafx.stage.Stage

class DosControl: Initializable {
	companion object{
		lateinit var main: Main
		lateinit var stage: Stage
	}
	
	@FXML
	private lateinit var b_primero: Button
	
	override fun initialize(location: URL?, resources: ResourceBundle?) {
		println("Inicio dos")
		b_primero.setOnAction { _ ->
			stage.close()
		}
	}
}