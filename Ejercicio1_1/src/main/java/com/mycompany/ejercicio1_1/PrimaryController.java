package com.mycompany.ejercicio1_1;

import java.time.LocalDate;
import java.time.Period;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtFecha;

    @FXML
    private Label lblResultado;

    @FXML
    private void hazCalcular() {
           
            String textoFecha = txtFecha.getText().trim();
            String[] partes = textoFecha.split("/");
            
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int anio = Integer.parseInt(partes[2]);

            LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
            LocalDate fechaActual = LocalDate.now();

            Period periodo = Period.between(fechaNacimiento, fechaActual);
            
            int anios = periodo.getYears();
            int meses = periodo.getMonths();

            lblResultado.setText("Tiene " + anios + " años con " + meses + " meses");
    }

    @FXML
    private void hazLimpiar() {
        txtFecha.clear();
        lblResultado.setText("Tiene 0 años con 0 meses");
        txtFecha.requestFocus();
    }
}