/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pkg_Veterinary;

/**
 *
 * @author apmejiar
 */
public class CatPetClass extends PetClass{
    
    public CatPetClass(int code, String name, String born_date, String raza, int healthStatus) {
        super(code, name, born_date, raza, healthStatus);
    }
    
    @Override
    public void eat(){
        System.out.println("Tipo de alimento que le das a " + super.getName());
        String nombre_alimento = inst_entrada_datos.nextLine();
        System.out.println("El gato " + super.getName() + " se alimenta con " + nombre_alimento);
    }
}
