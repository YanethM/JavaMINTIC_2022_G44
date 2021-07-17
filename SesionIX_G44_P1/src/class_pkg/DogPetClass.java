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
public class DogPetClass extends PetClass {

    private String tipo_alimento;

    public DogPetClass(int code, String name, int born_year, String health_status, char sexo, String breed, boolean pedigree,String tipo_alimento) {
        super(code, name, born_year, health_status, sexo, breed, pedigree);
        this.tipo_alimento = tipo_alimento;
    }

    public String getTipo_alimento() {
        return tipo_alimento;
    }

    public void setTipo_alimento(String tipo_alimento) {
        this.tipo_alimento = tipo_alimento;
    }

}
