package FX

import javafx.application.Application
import javafx.stage.Stage
import javafx.fxml.FXMLLoader
import javafx.scene.layout.AnchorPane
import javafx.scene.Scene
import FX.Controladores.MainControl
import javafx.stage.Modality
import FX.Controladores.DosControl

class Main: Application() {
	private lateinit var stage: Stage
	
	override fun start(stage: Stage){
		this.stage = stage
		
		principal()
	}
	
	public fun principal(){
		val root = FXMLLoader(Main::class.java.getResource("Stages/main_layout.fxml")).load() as AnchorPane
		val scene = Scene(root)
		
		MainControl.main = this
		stage.title = "Ventanita :3"
		stage.scene = scene
		stage.show()
	}
	
	public fun segunda(){
		val stage = Stage()
		val root = FXMLLoader(Main::class.java.getResource("Stages/Dos_layout.fxml")).load() as AnchorPane
		val scene = Scene(root)
		
		stage.initModality(Modality.WINDOW_MODAL)
		stage.initOwner(this.stage)
		
		DosControl.main = this
		DosControl.stage = stage
		stage.title = "Ventanita :3 x2"
		stage.scene = scene
		stage.show()
	}
	
}