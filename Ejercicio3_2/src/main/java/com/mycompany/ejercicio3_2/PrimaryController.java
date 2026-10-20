package com.mycompany.ejercicio3_2;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class PrimaryController {

    @FXML private Button btnIniciar;
    @FXML private ProgressBar barraLiebre;
    @FXML private ProgressBar barraTortuga;
    @FXML private Label lblLiebre;
    @FXML private Label lblTortuga;

    @FXML
    private void hazIniciar() {
        btnIniciar.setDisable(true);
        barraLiebre.setProgress(0.0);
        barraTortuga.setProgress(0.0);

        Thread hiloLiebre = new Thread(() -> {
            try {
                for (int i = 1; i <= 100; i++) {
                    Thread.sleep(80); 
                    
                        
                    if (i == 50) {
                        Platform.runLater(() -> lblLiebre.setText("La Liebre: ¡Se durmió!"));
                        Thread.sleep(5000); // Duerme 5 segundos largos
                    } else if (i == 51) {
                        Platform.runLater(() -> lblLiebre.setText("La Liebre: ¡Despertó!"));
                    }

                    double avance = i / 100.0;
                    Platform.runLater(() -> barraLiebre.setProgress(avance));
                }
                Platform.runLater(() -> lblLiebre.setText("La Liebre: ¡Perdió la carrera!"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread hiloTortuga = new Thread(() -> {
            try {
                for (int i = 1; i <= 100; i++) {
                    Thread.sleep(100); 
                    
                    Platform.runLater(() -> lblTortuga.setText("La Tortuga: ¡Esta corriendo!"));

                    double avance = i / 100.0;
                    Platform.runLater(() -> barraTortuga.setProgress(avance));
                }
                
                Platform.runLater(() -> lblTortuga.setText("La Tortuga: ¡Ganó la carrera!"));
                
                
                Platform.runLater(() -> btnIniciar.setDisable(false));
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        hiloLiebre.start();
        hiloTortuga.start();
    }
}
