package com.mycompany.ejercicio3_1;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtClics;
    @FXML private Button btnContar;
    @FXML private ProgressBar progressBar;
    @FXML private Button btnEsperar;

    private int contador = 0;

    @FXML
    private void hazContar() {
        contador++;
        txtClics.setText(String.valueOf(contador));
    }

    @FXML
    private void hazEsperar() {
        
        btnEsperar.setDisable(true);
        progressBar.setProgress(0.0);

       
        Thread hilo = new Thread(() -> {
            try {
                for (int i = 1; i <= 100; i++) {
                    Thread.sleep(100);
                    final double progreso = i / 100.0;

                    
                    Platform.runLater(() -> progressBar.setProgress(progreso));
                }
                
                
                Platform.runLater(() -> btnEsperar.setDisable(false));
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        hilo.start();
    }
}