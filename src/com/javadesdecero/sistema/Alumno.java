package com.javadesdecero.sistema;

public class Alumno {
    String nombre;
    int numeroLista;
    int edad;
    int grado;
    String matricula;
    String turno;
    String sexo;
    String nivel;
    Materia[] materias;

    public Alumno(String nombre, String matricula, int edad, String sexo) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.edad = edad;
        this.sexo = sexo;
    }
}
