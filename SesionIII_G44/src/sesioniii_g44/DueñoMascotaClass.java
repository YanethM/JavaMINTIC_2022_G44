/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesioniii_g44;

/**
 *
 * @author apmejiar
 */
public class DueñoMascotaClass {
    //1. Declaramos los atributos de forma private
    //2. Insertamos código GETTER de los atributos
    //3. Insertamos el constructor de la clase
    //4. Creamos una función que retorna un tipo de dato String con todos los GETTER de la clase
    private String nombre;
    private String tipo_documento;
    private int nro_documento;
    private int telefono;
    private String nombre_mascota;

    public DueñoMascotaClass(String nombre, String tipo_documento, int nro_documento, int telefono, String nombre_mascota) {
        this.nombre = nombre;
        this.tipo_documento = tipo_documento;
        this.nro_documento = nro_documento;
        this.telefono = telefono;
        this.nombre_mascota = nombre_mascota;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public int getNro_documento() {
        return nro_documento;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }
    
    public String consultar_informacion_dueño_mascota(){
        return ">> El dueño de " + getNombre_mascota() + " es "+ getNombre() 
                + " identificado con " + getTipo_documento() + " número " + 
                getNro_documento()+" se puede contactar al número " + getTelefono();
    }
}
