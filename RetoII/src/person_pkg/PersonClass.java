/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person_pkg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author apmejiar
 */
public class PersonClass {

    //1. Declaración de variables con visibilidad private
    private String name;
    private int id;

    //2. Insertar el constructor de la clase con todos los parametros
    public PersonClass(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //3. Añadir GETTER y SETTER
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

}

