package com.javadesdecero.sistema.animales;

public class Gato extends Mamifero {

    @Override
    public void comer() {
        super.comer();
        System.out.println("como atun");
    }
}
