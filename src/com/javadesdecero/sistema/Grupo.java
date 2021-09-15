package com.javadesdecero.sistema;

import com.javadesdecero.sistema.alumnos.Alumno;

public class Grupo {
    String nombre;
    Alumno[] alumnos;

    public Grupo(String nombre, Alumno[] alumnos){
        this.nombre = nombre;
        this.alumnos = alumnos;
    }
}
