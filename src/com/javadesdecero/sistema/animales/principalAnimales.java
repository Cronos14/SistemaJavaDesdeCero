package com.javadesdecero.sistema.animales;

public class principalAnimales {
    public static void main(String[] args) {

        Animal miAnimal = new Perro();

//        if(miAnimal instanceof Perro) {
//            Perro miPerro = (Perro) miAnimal;
//            miPerro.criar();
//            miPerro.acompaniar();
//        }
//
//        miAnimal.comer();

        Animal miMamifero = new Mamifero();
        Animal miPerro = new Perro();
        Animal miGato = new Gato();
        Animal miPerroMaltes = new Maltes();

        Animal[] animales = new Animal[4];

        animales[0] = miMamifero;
        animales[1] = miPerro;
        animales[2] = miGato;
        animales[3] = miPerroMaltes;

        for (int i = 0; i< animales.length; i++) {
            Animal animalActual = animales[i];
            if (animalActual instanceof Perro) {
                Perro perroActual = (Perro) animalActual;
                perroActual.acompaniar();
            }
            animalActual.comer();
        }
    }
}
