
package com.mycompany.ejercicio2_2;

public class TrianguloRect extends FiguraRecta {

    public TrianguloRect(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return (this.ancho * this.alto) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt((ancho * ancho) + (alto * alto));
        return ancho + alto + hipotenusa;
    }

    @Override
    public String imprimeFigura() {
        return super.imprimeFigura() + "\nSe imprime un Triangulo con alto: " + alto + 
               ", ancho: " + ancho + ", area: " + String.format("%.2f", calcularArea()) + 
               ", perimetro: " + String.format("%.2f", calcularPerimetro());
    }
}
