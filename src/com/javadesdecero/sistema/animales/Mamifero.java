package com.javadesdecero.sistema.animales;

public class Mamifero extends Animal {
    private String colorPelo;
    private String cola;
    private String terrestre;

    public void criar() {

    }

    @Override
    public void comer() {
//        super.comer();
        System.out.println("Como carne");
    }

    @Override
    public void desplazar() {
        System.out.println("Me desplazo con mis patas");
    }

    @Override
    public void emitirSonido() {
        System.out.println("Emito sonido como un mamifero");
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getCola() {
        return cola;
    }

    public void setCola(String cola) {
        this.cola = cola;
    }

    public String getTerrestre() {
        return terrestre;
    }

    public void setTerrestre(String terrestre) {
        this.terrestre = terrestre;
    }
}
