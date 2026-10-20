package com.mycompany.ejercicio1_4;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML 
    private TextField txtTabla;

    @FXML 
    private TextArea txtResultado;

   @FXML
private void hazCalcular() {
    
    int n = Integer.parseInt(txtTabla.getText().trim());
    txtResultado.clear();
    String resultadoFinal = "";
 
    for (int i = 1; i <= 10; i++) {
        int producto = n * i;
        resultadoFinal = resultadoFinal + n + " x " + i + " = " + producto + "\n";
    }
    
    txtResultado.setText(resultadoFinal);
}

    @FXML
    private void hazLimpiar() {
        txtTabla.clear();
        txtResultado.clear();
        txtTabla.requestFocus();
    }
}
