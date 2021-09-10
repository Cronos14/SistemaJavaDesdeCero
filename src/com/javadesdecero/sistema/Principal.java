package com.javadesdecero.sistema;

public class Principal {
    public static void main(String[] args) {

        Escuela escuela = new Escuela();
        Grupo grupo = escuela.iniciarGrupo();

        System.out.println(grupo.nombre);

        for (int i = 0; i < grupo.alumnos.length; i++) {

            Alumno alumno = grupo.alumnos[i];
            String nombre = alumno.nombre;

            System.out.println("alumno "+i+ " "+nombre);

            Materia[] materiasAlumno = alumno.materias;

            for (int j = 0; j < materiasAlumno.length; j++) {

                Materia materiaAlumno = materiasAlumno[j];

                System.out.println("materia: "+materiaAlumno.nombre);
            }
        }
    }
}

//Se necesita un sistema para la gestion de alumnos de la escuela JavaDesdeCero,
//Este sistema debe de evalular los diferentes alumnos los cuales tienen n cantidad de materias,
// de igual manera cada alumno debe tener asignado uno grupo y la calificacion de cada materia.

//El sistema tambien debe de considerar a profesores que daran ciertas materias, estos profesores
//tienen que estar asociados a una o varias materias.