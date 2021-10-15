package com.javadesdecero.sistema.animales;

public class Perro extends Mamifero {

    private String olfato;
    private String raza;
    private String fiel;

    @Override
    public void comer() {
        System.out.println("Como croquetas cualquiera");
    }

    public void acompaniar() {
        System.out.println("Acompaño a las personas");
    }

    @Override
    public void emitirSonido() {
        System.out.println("Estoy ladrando");
    }

    public String getOlfato() {
        return olfato;
    }

    public void setOlfato(String olfato) {
        this.olfato = olfato;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getFiel() {
        return fiel;
    }

    public void setFiel(String fiel) {
        this.fiel = fiel;
    }
}
