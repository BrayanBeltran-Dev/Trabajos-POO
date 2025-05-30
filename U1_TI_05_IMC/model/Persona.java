package model;

public class Persona {
    private String nombre;
    private Double altura;
    private Double peso;

    public Persona(String nombre, Double altura, Double peso) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }
}
