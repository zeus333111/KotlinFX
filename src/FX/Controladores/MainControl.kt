package FX.Controladores

import java.net.URL
import java.util.ResourceBundle
import javafx.scene.control.Button
import javafx.fxml.FXML
import javafx.fxml.Initializable
import FX.Main

public class MainControl: Initializable {
	companion object{
		lateinit var main: Main
	}
	
	@FXML
	lateinit var b_otro: Button
	
	public override fun initialize(url: URL?, rb: ResourceBundle?){
		println("Iniciado")
		b_otro.setOnAction{ _ ->
			main.segunda()
		}
	}
}