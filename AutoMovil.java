/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sebastian Estevez
 */

public class AutoMovil {

    // 4 atributos privados (encapsulamiento)
    private String marca;
    private String modelo;
    private int año;
    private String color;

    // Constructor
    public AutoMovil() {
        System.out.println("Constructor de AutoMóvil");
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 4 métodos
    public void encender() {
        System.out.println("El automóvil está encendido.");
    }

    public void apagar() {
        System.out.println("El automóvil está apagado.");
    }

    public void acelerar() {
        System.out.println("El automóvil está acelerando.");
    }

    public void frenar() {
        System.out.println("El automóvil está frenando.");
    }
}
