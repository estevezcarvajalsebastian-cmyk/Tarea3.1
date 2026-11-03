/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sebastian Estevez
 */

public class HondaCivic extends AutoMovil {

    // Constructor
    public HondaCivic() {
        System.out.println("Constructor de HondaCivic");
    }

    // Sobrescritura del método acelerar
    @Override
    public void acelerar() {
        System.out.println("El Honda Civic está acelerando rápidamente.");
    }

    // Sobrescritura del método frenar
    @Override
    public void frenar() {
        System.out.println("El Honda Civic está utilizando sus frenos.");
    }
}
