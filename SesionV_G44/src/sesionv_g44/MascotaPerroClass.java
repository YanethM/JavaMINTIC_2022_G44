/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionv_g44;

import java.util.Scanner;

/**
 *
 * @author apmejiar
 */
public class MascotaPerroClass extends MascotaClass{
    
    public MascotaPerroClass(int codigo_mascota, String nombre_mascota, String raza, String fecha_nacimiento, char sexo_mascota, int nro_documento_dueño) {
        super(codigo_mascota, nombre_mascota, raza, fecha_nacimiento, sexo_mascota, nro_documento_dueño);
    }
    
    public void entrenar_Cachorro(int codigo_mascota){
        System.out.println("Deseas adquirir el plan de entrenamiento para " + getNombre_mascota()+ "? (Sí, No)");
        Scanner entrada_user = new Scanner(System.in);
        String respuesta_user = entrada_user.nextLine();
        //if(respuesta_user.toLowerCase() == "si" || respuesta_user.toLowerCase == "sí")
        if(respuesta_user.toUpperCase().equals("SI") || respuesta_user.toUpperCase().equals("SÍ")){
            System.out.println("       >> Añadir plan de entrenamiento para " + getNombre_mascota());
        }else if(respuesta_user.toUpperCase().equals("NO")){
            System.out.println("       >> Hasta pronto.");
        }else{
            System.out.println("       >> Opción inválida");
        }
    }
    
    public String entrenar_Cachorro_funcion(int codigo_mascota){
        System.out.println("Deseas adquirir el plan de entrenamiento para " + getNombre_mascota()+ "? (Sí, No)");
        Scanner entrada_user = new Scanner(System.in);
        String respuesta_user = entrada_user.nextLine();
        String plan="";
        //if(respuesta_user.toLowerCase() == "si" || respuesta_user.toLowerCase == "sí")
        if(respuesta_user.toLowerCase().equals("si") || respuesta_user.toLowerCase().equals("sí")){
            plan ="       >> Añadir plan de entrenamiento para " + getNombre_mascota();
        }else if(respuesta_user.toLowerCase().equals("no")){
            plan ="       >> Hasta pronto.";
        }else{
            plan ="       >> Opción inválida";
        }
        return plan;
    }
}
