package com.javadesdecero.sistema;

public class Escuela {
    
    public Grupo iniciarGrupo() {

        Materia materiaMate = new Materia(
                "Matematicas",
                "Ciencias exactas"
        );

        Materia materiaEspaniol = new Materia(
                "Español",
                "Lenguas"
        );

        Materia materiaProgramacion = new Materia(
                "Programacion",
                "Informatica"
        );

        Materia materiaIngles = new Materia(
                "Ingles",
                "Lenguas"
        );

        Materia[] materias = new Materia[3];
        materias[0] = materiaMate;
        materias[1] = materiaEspaniol;
        materias[2] = materiaProgramacion;

        Alumno alumnoWan = new Alumno(
                "Manuel",
                "1234ABC",
                30,
                "M"
        );

        alumnoWan.materias = materias;

        Alumno alumnoJesus = new Alumno(
                "Jesus",
                "5678ABC",
                31,
                "M"
        );

        alumnoJesus.materias = materias;

        Materia[] materiasExtra = new Materia[4];
        materiasExtra[0] = materiaMate;
        materiasExtra[1] = materiaEspaniol;
        materiasExtra[2] = materiaProgramacion;
        materiasExtra[3] = materiaIngles;

        Alumno alumnoSilvia = new Alumno(
                "Silvia",
                "3586ABC",
                28,
                "F"
        );

        alumnoSilvia.materias = materiasExtra;

        Alumno[] alumnos = new Alumno[3];

        alumnos[0] = alumnoWan;
        alumnos[1] = alumnoJesus;
        alumnos[2] = alumnoSilvia;

        Grupo grupoA = new Grupo(
                "Grupo A",
                alumnos
        );

        return grupoA;
    }
}
