/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionii.g44;

/**
 *
 * @author apmejiar
 */
public class ConductorClass {
    private String nombre;
    private int nro_licencia;
    private String categoria;
    private String tipo_infraccion;
    private boolean multar;

    public ConductorClass(String nombre, int nro_licencia, String categoria, String tipo_infraccion) {
        this.nombre = nombre;
        this.nro_licencia = nro_licencia;
        this.categoria = categoria;
        this.tipo_infraccion = tipo_infraccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNro_licencia() {
        return nro_licencia;
    }

    public void setNro_licencia(int nro_licencia) {
        this.nro_licencia = nro_licencia;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo_infraccion() {
        return tipo_infraccion;
    }

    public void setTipo_infraccion(String tipo_infraccion) {
        this.tipo_infraccion = tipo_infraccion;
    }
    
    public boolean multar(){
        //Validamos si se ingreso texto al solicitar el tipo de infracción
        if(getTipo_infraccion() != ""){
            //Decimos que si la infracción fue diferente de vacío. Si hay texto.
            System.out.println("Aplicar multa al conductor " + getNombre());
            multar = true;
        }else{
            //De lo contrario, quiere decir que NO se ingreso texto en tipo de infracción
            System.out.println("Todo esta OK.");
            multar = false;
        }
        return multar;
    }
}
