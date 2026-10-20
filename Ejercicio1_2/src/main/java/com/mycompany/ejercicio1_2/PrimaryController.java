package com.mycompany.ejercicio1_2;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtDinero;

    @FXML
    private TextArea txtDesglose;

    @FXML
    private void hazDesglosar() {
        
            int dinero = Integer.parseInt(txtDinero.getText().trim());
            int[] denominaciones = {500, 200, 100, 50, 20, 10, 5, 2, 1};
            String[] nombres = {
                "Billetes de $500",
                "Billetes de $200",
                "Billetes de $100",
                "Billetes de $50",
                "Billetes de $20",
                "Monedas de $10",
                "Monedas de $5",
                "Monedas de $2",
                "Monedas de $1"
            };

        txtDesglose.clear();
        String resultado = "";

        for (int i = 0; i < denominaciones.length; i++) {
            int cantidad = dinero / denominaciones[i]; 
            dinero = dinero % denominaciones[i];       
        resultado = resultado + nombres[i] + "\t\t" + cantidad + "\n";
    }

   
    txtDesglose.setText(resultado);
}

    @FXML
    private void hazLimpiar() {
        txtDinero.clear();
        txtDesglose.clear();
        txtDinero.requestFocus();
    }
}

