/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pkg_Veterinary;

import java.util.Scanner;

/**
 *
 * @author apmejiar
 */
public class DogPetClass extends PetClass{
    private char sexo_mascota; //'H' - 'M'  
    Scanner inst_entrada_datos = new Scanner(System.in);
    public DogPetClass(int code, String name, String born_date, String raza, int healthStatus, char sexo_mascota) {
        //Super se utiliza para acceder a las variables y métodos de la clase padre
        super(code, name, born_date, raza, healthStatus);
        //this se utiliza para acceder a las variables propias de esta clase
        this.sexo_mascota = sexo_mascota;
    }

    
    @Override
    public void eat(){
        System.out.println("Tipo de alimento que le das a " + super.getName());
        String nombre_alimento = inst_entrada_datos.nextLine();
        System.out.println("El perro " + super.getName() + " se alimenta con " + nombre_alimento);
    }
    /**
     * @return the sexo_mascota
     */
    public char getSexo_mascota() {
        return sexo_mascota;
    }

    /**
     * @param sexo_mascota the sexo_mascota to set
     */
    public void setSexo_mascota(char sexo_mascota) {
        this.sexo_mascota = sexo_mascota;
    }
}
