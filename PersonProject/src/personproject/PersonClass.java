/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personproject;

import java.util.Date;

/**
 *
 * @author apmejiar
 */
public class PersonClass {

    //1. Creamos las variables de forma private
    //2. Insertamos los Getter y los Setter: clic secundario>refactor>encapsulate fields
    //3. Insertamos el constructor de la clase: clic secundario>insert code>constructor
    //4. Creamos la función o método que consulte los getter de la clase
    private String nombre;
    private String tipo_documento;
    private int nro_documento;
    private String fecha_nacimiento;
    private char genero;
    private boolean actualmente_estudia;

    public PersonClass(String nombre, String tipo_documento, int nro_documento, String fecha_nacimiento, char genero, boolean actualmente_estudia) {
        this.nombre = nombre;
        this.tipo_documento = tipo_documento;
        this.nro_documento = nro_documento;
        this.fecha_nacimiento = fecha_nacimiento;
        this.genero = genero;
        this.actualmente_estudia = actualmente_estudia;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipo_documento
     */
    public String getTipo_documento() {
        return tipo_documento;
    }

    /**
     * @param tipo_documento the tipo_documento to set
     */
    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    /**
     * @return the nro_documento
     */
    public int getNro_documento() {
        return nro_documento;
    }

    /**
     * @param nro_documento the nro_documento to set
     */
    public void setNro_documento(int nro_documento) {
        this.nro_documento = nro_documento;
    }

    /**
     * @return the fecha_nacimiento
     */
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * @param fecha_nacimiento the fecha_nacimiento to set
     */
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     * @return the genero
     */
    public char getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * @return the actualmente_estudia
     */
    public boolean isActualmente_estudia() {
        return actualmente_estudia;
    }

    /**
     * @param actualmente_estudia the actualmente_estudia to set
     */
    public void setActualmente_estudia(boolean actualmente_estudia) {
        this.actualmente_estudia = actualmente_estudia;
    }

    public String consultar_info_persona_funcion() {
        String estudia;
        if (isActualmente_estudia() == true) {
            estudia = "Actualmente se encuentra estudiando";
        } else {
            estudia = "Actualmente no se encuentra estudiando";
        }
        return "Información del usuario:\n      >>Nombre: " + getNombre() + "\n      >>Tipo documento: " + getTipo_documento() + "\n      >>Cédula: " + getNro_documento() + "\n      >>" + estudia;
    }

    public void consultar_info_persona_metodo() {
        String estudia;
        if (isActualmente_estudia() == true) {
            estudia = "Actualmente se encuentra estudiando";
        } else {
            estudia = "Actualmente no se encuentra estudiando";
        }
        System.out.println("Información del usuario:\n      >>Nombre: " + getNombre() + "\n      >>Tipo documento: " + getTipo_documento() + "\n      >>Cédula: " + getNro_documento() + "\n      >>" + estudia);
    }

    public void consultar_info_persona_por_cedula(int cedula) {
        String estudia;
        
        if (getNro_documento() == cedula) {
            if (isActualmente_estudia() == true) {
                estudia = "Actualmente se encuentra estudiando";
            } else {
                estudia = "Actualmente no se encuentra estudiando";
            }
            System.out.println("Usuario consultado con cédula:"+ cedula+"\n      >>Nombre: " + getNombre() + "\n      >>Tipo documento: " + getTipo_documento() +  "\n      >>" + estudia);
        }else{
            System.out.println("Usuario consultado con cédula " + cedula + " no existe.");
        }

    }
}
