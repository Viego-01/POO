package com.mycompany.nomina;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    
    
      @FXML private TextArea txt1;
      @FXML private TextField txt2;
      @FXML private TextField txt3;
      @FXML private TextField txt4;
      @FXML private TextField txt5;
      @FXML private TextField txt6;
      
      

      
    @FXML
    private void btnCalcular(){
        String obtHE = txt2.getText();
        int horasExt = Integer.parseInt(obtHE);
        int pagoExt = horasExt*120;
        txt3.setText(String.valueOf(pagoExt));
        
        String obtSB = txt1.getText();
        int sueldoBase = Integer.parseInt(obtSB);
        int subtotal = pagoExt + sueldoBase;
        txt4.setText(String.valueOf(subtotal));
        
        double isr = subtotal * .16;
        txt5.setText(String.valueOf(isr));
        
        double neto = subtotal-isr;
        txt6.setText(String.valueOf(neto));
                
        
    }
    
            
}

