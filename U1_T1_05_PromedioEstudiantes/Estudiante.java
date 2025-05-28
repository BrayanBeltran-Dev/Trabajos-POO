package model;

public class Estudiante {
    private String nombre;
    private String matricula;
    
    private double[] notas = new double[5];
    
    public double calcularPromedio() {
        double suma = 0;
        for(int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }
        return suma / 5;
    }
    
    public boolean aprobado() {
        if (calcularPromedio() >= 70) {
            return true;
        } else {
            return false;
        }
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public double getNota(int posicion) {
        return notas[posicion];
    }
    
    public void setNota(int posicion, double valor) {
        notas[posicion] = valor;
    }
}