/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sebastian Estevez
 */

public class Main {

    public static void main(String[] args) {

        // Crear objeto de la clase padre
        AutoMovil auto1 = new AutoMovil();

        auto1.setMarca("Toyota");
        auto1.setModelo("Corolla");
        auto1.setAño(2022);
        auto1.setColor("Blanco");

        System.out.println("\n--- AUTOMOVIL ---");
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Modelo: " + auto1.getModelo());
        System.out.println("Año: " + auto1.getAño());
        System.out.println("Color: " + auto1.getColor());

        auto1.encender();
        auto1.acelerar();
        auto1.frenar();
        auto1.apagar();

        // Crear objeto de la clase hija
        HondaCivic civic1 = new HondaCivic();

        civic1.setMarca("Honda");
        civic1.setModelo("Civic");
        civic1.setAño(2025);
        civic1.setColor("Negro");

        System.out.println("\n--- HONDA CIVIC ---");
        System.out.println("Marca: " + civic1.getMarca());
        System.out.println("Modelo: " + civic1.getModelo());
        System.out.println("Año: " + civic1.getAño());
        System.out.println("Color: " + civic1.getColor());

        civic1.encender();
        civic1.acelerar();
        civic1.frenar();
        civic1.apagar();
    }
}
