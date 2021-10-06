package com.javadesdecero.sistema;

import com.javadesdecero.sistema.alumnos.Alumno;

public class Principal {
    public static void main(String[] args) {

        Escuela escuela = new Escuela();
        Grupo grupo = escuela.iniciarGrupo();
        Alumno alumno = null;

        System.out.println(grupo.nombre);

        for (int i = 0; i < grupo.alumnos.length; i++) {

            alumno = grupo.alumnos[i];
            String nombre = alumno.getNombre();

            System.out.println("alumno "+i+ " "+nombre);

            Materia[] materiasAlumno = alumno.getMaterias();

            for (int j = 0; j < materiasAlumno.length; j++) {

                Materia materiaAlumno = materiasAlumno[j];

                System.out.println("materia: "+materiaAlumno.nombre);
            }
            alumno.verMateria(alumno);
        }

    }
}

//Se necesita un sistema para la gestión de alumnos de la escuela JavaDesdeCero,
//Este sistema debe de evaluar los diferentes alumnos los cuales tienen n cantidad de materias,
// de igual manera cada alumno debe tener asignado uno grupo y la calificación de cada materia.

//El sistema también debe de considerar a profesores que darán ciertas materias, estos profesores
//tienen que estar asociados a una o varias materias.