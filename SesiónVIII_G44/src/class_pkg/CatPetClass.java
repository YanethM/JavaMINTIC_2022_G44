/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_pkg;

/**
 *
 * @author apmejiar
 */
public class CatPetClass extends PetClass{
    
    public CatPetClass(int code, String name, int born_year, String color, String health_status, String breed, boolean pedigree) {
        super(code, name, born_year, color, health_status, breed, pedigree);
    }
    
    @Override
    public void crud_pet(){
        
    }
}
