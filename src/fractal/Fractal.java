/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractal;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author higor
 */
public class Fractal extends Application {
    
    @Override
    public void start(Stage primaryStage) {
      Button btnRun = new Button();
		btnRun.setText("Clique para gerar a imagem");
		btnRun.setPrefSize(300, 30);
		btnRun.setLayoutX(75);
		btnRun.setLayoutY(30);
		
		TextArea expInput = new TextArea();
		expInput.setPrefSize(440, 100);
		expInput.setLayoutX(5);
		expInput.setLayoutY(90);
                expInput.setText("Higor Henrique Reculiano\nRA: 081180036\nEdite o Arquivo 'Input.txt' localizado na pasta do programa.\nNão altere o tipo da letra, apenas quantidade"
                        + " e ordem das regras.");
                expInput.setEditable(false);
		
		Pane root = new Pane();
		root.getChildren().add(btnRun);
		root.getChildren().add(expInput);
		
		Scene scene = new Scene(root, 450, 200);
		
		primaryStage.setTitle("Fractal");
		primaryStage.setScene(scene);
		primaryStage.show();
			
		btnRun.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent event)
			{
				ProcessadorDeImagem.start();
			}
		});
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
