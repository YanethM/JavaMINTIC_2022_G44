/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionv_g44;

import java.util.ArrayList;

/**
 *
 * @author apmejiar
 */
public class MascotaColeccionClass {
    private ArrayList<String> nombres_mascotas = new ArrayList<>();
    
    public ArrayList añadir_elementos_array(){
        nombres_mascotas.add("Dante");
        nombres_mascotas.add("Donatelo");
        nombres_mascotas.add("Garfield");
        nombres_mascotas.add("Pluto");
        nombres_mascotas.add("Donald");
        return nombres_mascotas;
    }
    
    public ArrayList eliminar_elemento_array(){
        nombres_mascotas.remove(1);
        return nombres_mascotas;
    }
    
    public String consultar_elemento_array(){
        String nombre_consultado = nombres_mascotas.get(1);
        return nombre_consultado;
    }
    
    public ArrayList modificar_elemento_array(){
        nombres_mascotas.set(0, "Max");
        return nombres_mascotas;
    }
    
    public void validar_lista_vacia(){
        if(nombres_mascotas.isEmpty()==true){
            System.out.println("ArrayList se encuentra vacía");
        }else
            System.out.println("El arrayList tiene: "+ nombres_mascotas.size() + " elementos y son: " + nombres_mascotas);
    }
}
