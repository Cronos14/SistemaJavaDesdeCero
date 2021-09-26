package com.javadesdecero.sistema.alumnos;

import com.javadesdecero.sistema.Materia;
import com.javadesdecero.sistema.Persona;

import java.util.Arrays;

public class Alumno extends Persona {
    private int numeroLista;
    private int grado;
    private String matricula;
    private String turno;
    private String nivel;
    private Materia[] materias;

    public Alumno(int edad, String nombre, String ocupacion, String sexo, String matricula) {
        super(edad, nombre, ocupacion, sexo);
        this.matricula = matricula;
    }

    public Materia verMateria(Alumno alumno) {

        Materia materiaAlumno = null;
        Materia[] materiasAlumno = alumno.getMaterias();
        String nombre = alumno.getNombre();
        System.out.println("alumno "+ nombre);

        for (int i = 0; i < materiasAlumno.length; i++) {
            materiaAlumno = materiasAlumno[i];
            System.out.println("materia: "+ materiaAlumno.getNombre());
        }
        System.out.println("metodo verMateria() ejecutado");
        return materiaAlumno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad > 3 && edad < 100) {
            this.edad = edad;
        } else {
            System.out.println("Edad incorrecta, favor de agregar una edad de 3 a 100 años");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroLista() {
        return numeroLista;
    }

    public void setNumeroLista(int numeroLista) {
        this.numeroLista = numeroLista;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "numeroLista=" + numeroLista +
                ", grado=" + grado +
                ", matricula='" + matricula + '\'' +
                ", turno='" + turno + '\'' +
                ", nivel='" + nivel + '\'' +
                ", materias=" + Arrays.toString(materias) +
                '}';
    }
}
