package com.javadesdecero.sistema.animales;

public class Animal {
    private String nombre;
    private double alto;
    private double ancho;
    private String color;

    public void comer() {
        System.out.println("Como como un animal");
    }

    public void desplazar() {
        System.out.println("Me desplazo como animal");
    }

    public void emitirSonido() {
        System.out.println("emito sonido como un animal");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
