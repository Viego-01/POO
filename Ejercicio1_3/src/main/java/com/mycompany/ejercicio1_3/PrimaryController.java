package com.mycompany.ejercicio1_3;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtNumero;
    @FXML private TextField txtCantidadCifras;
    @FXML private TextField txtSumaImpares;
    @FXML private TextField txtSumaPares;
    @FXML private TextField txtSumaTotal;
    @FXML private TextField txtCifraMayor;
    @FXML private TextField txtCifraMenor;
    @FXML private ListView<Integer> listDivisores;

    @FXML
private void hazAnalizar() {
   
    String texto = txtNumero.getText().trim();
    int numero = Integer.parseInt(texto);
    
    int cantidadCifras = texto.length();
    int sumaPares = 0;
    int sumaImpares = 0;
    int sumaTotal = 0;
    int mayor = -1;
    int menor = 10;

    for (int i = 0; i < texto.length(); i++) {
        int cifra = Character.getNumericValue(texto.charAt(i));
        
        sumaTotal += cifra;
        
        if (cifra % 2 == 0) {
            sumaPares += cifra;
        } else {
            sumaImpares += cifra;
        }
        
        if (cifra > mayor) mayor = cifra;
        if (cifra < menor) menor = cifra;
    }

    txtCantidadCifras.setText(String.valueOf(cantidadCifras));
    txtSumaImpares.setText(String.valueOf(sumaImpares));
    txtSumaPares.setText(String.valueOf(sumaPares));
    txtSumaTotal.setText(String.valueOf(sumaTotal));
    txtCifraMayor.setText(String.valueOf(mayor));
    txtCifraMenor.setText(String.valueOf(menor));

    listDivisores.getItems().clear();
    for (int i = 1; i <= numero; i++) {
        if (numero % i == 0) {
            listDivisores.getItems().add(i);
          }
        }
    }
}