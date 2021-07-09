/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionv_g44;

import java.time.LocalDate;

/**
 *
 * @author apmejiar
 */
public class MascotaClass {
    //1. Declarar los atributos de forma global y visibilidad private
    //2. Encapsulate fields. Clic secundario > Refactor > Encapsulate fields > Select All
    //3. Insertar el constructor de la clase. Clic secundario > Insert code > Constructor
    //4. Crear el método o la función para consultar la infomación de los GETTER de la clase
    
    private int codigo_mascota;
    private String nombre_mascota;
    private String raza;
    private String fecha_nacimiento;
    private char sexo_mascota;
    private int nro_documento_dueño;

    public MascotaClass(int codigo_mascota, String nombre_mascota, String raza, String fecha_nacimiento, char sexo_mascota, int nro_documento_dueño) {
        this.codigo_mascota = codigo_mascota;
        this.nombre_mascota = nombre_mascota;
        this.raza = raza;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo_mascota = sexo_mascota;
        this.nro_documento_dueño = nro_documento_dueño;
    }

    
    

    /**
     * @return the codigo_mascota
     */
    public int getCodigo_mascota() {
        return codigo_mascota;
    }

    /**
     * @param codigo_mascota the codigo_mascota to set
     */
    public void setCodigo_mascota(int codigo_mascota) {
        this.codigo_mascota = codigo_mascota;
    }

    /**
     * @return the nombre_mascota
     */
    public String getNombre_mascota() {
        return nombre_mascota;
    }

    /**
     * @param nombre_mascota the nombre_mascota to set
     */
    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
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

    /**
     * @return the nro_documento_dueño
     */
    public int getNro_documento_dueño() {
        return nro_documento_dueño;
    }

    /**
     * @param nro_documento_dueño the nro_documento_dueño to set
     */
    public void setNro_documento_dueño(int nro_documento_dueño) {
        this.nro_documento_dueño = nro_documento_dueño;
    }

    //Función para consultar la información que contienen los GET de cada atributo
    public String consultar_info_mascota_f(){
        return "Código mascota: " + getCodigo_mascota() + "\n        >> Nombre: "+getNombre_mascota()+"\n        >> Fecha de nacimiento: " + getFecha_nacimiento() +"\n        >> Raza: " + getRaza();
    }
    
    //Método para consultar la información que contienen los GET de cada atributo
    public void consultar_info_mascota_m(){
        System.out.println("Código mascota: " + getCodigo_mascota() + "\n        >> Nombre: "+getNombre_mascota()+"\n        >> Fecha de nacimiento: " + getFecha_nacimiento() +"\n        >> Raza: " + getRaza());
    }
    
    //Método para consultar la información de una mascota especifica
    public void consultar_mascota_determinada(int codigo_masc_consultar){
        if(getCodigo_mascota() == codigo_masc_consultar){
            System.out.println("\nCódigo mascota consultada: " + getCodigo_mascota() + "\n        >> Nombre: "+getNombre_mascota()+"\n        >> Fecha de nacimiento: " + getFecha_nacimiento() +"\n        >> Raza: " + getRaza());
        }else{
            System.out.println("\nLa mascota que consultas no existe en el sistema");
        }
    }
}
