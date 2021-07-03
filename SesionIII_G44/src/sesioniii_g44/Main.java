/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesioniii_g44;

import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author apmejiar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Trabajar con fechas en java
        Date fecha_actual = new Date();
        //Trabajar con clase Scanner para permitir el ingreso de texto por parte del user
        Scanner inst_entrada = new Scanner(System.in);
        // Instancia la clase mascota
        MascotaGetSetClass inst_mascota = new MascotaGetSetClass();
        System.out.println("FORMA I: Consulta información desde el contructor");
        MascotaConstructorClass inst_mascotac = new MascotaConstructorClass("Dante",fecha_actual, false, "Labrador",999);
        MascotaFuncionConsultaClass inst_mascotaf = new MascotaFuncionConsultaClass("Rocky2", fecha_actual,false,"bull terrier",1053);
      
        
        //Mediante la instancia llamo los métodos o funciones de la clase
        System.out.println("\nFORMA II: Consulta información a partir del GET y SET");
        inst_mascota.setNombre_mascota("Rocky");
        System.out.println("    >>Nombre: " + inst_mascota.getNombre_mascota());

        //System.out.println("Fecha: " + fecha_actual.toString());
        inst_mascota.setFecha_nacimiento(fecha_actual);
        System.out.println("    >>Fecha nacimiento: " + inst_mascota.getFecha_nacimiento());

        //Validar si es true o false para modificar el mensaje de salida
        inst_mascota.setHistorial_clinico(true);
        if (inst_mascota.isHistorial_clinico() == true) {
            System.out.println("    >>" + inst_mascota.getNombre_mascota() + " ya tiene historial clinico.");
        } else {
            System.out.println("    >>" + inst_mascota.getNombre_mascota() + " no tiene historial clinico.");
        }

        //Imprimir salida de la forma III:
        System.out.println("\nFORMA III: Consulta información a función que contiene todos los GETTER de la clase");
        System.out.println(inst_mascotaf.consultar_informacion_mascota());
        
        System.out.println("\nINFORMACIÓN DEL DUEÑO DE LA MASCOTA");
        //Solicitar información al usuario acerca del dueño de la mascota:
        System.out.println(">>Nombre:");
        String nombre_user = inst_entrada.nextLine();
        
        System.out.println(">>Tipo documento:");
        String tipo_doc_user = inst_entrada.nextLine();
        
        System.out.println(">>N° documento:");
        int num_doc_user = inst_entrada.nextInt();
        
        System.out.println(">>N° telefono:");
        int contacto_user = inst_entrada.nextInt();
        //Las variables que almacenan el valor que ingresa el usuario, pasan a ser los
        //parametros de la clase
        DueñoMascotaClass inst_dueño = new DueñoMascotaClass(nombre_user,tipo_doc_user,num_doc_user, contacto_user, inst_mascotaf.getNombre_mascota());
        System.out.println(inst_dueño.consultar_informacion_dueño_mascota());
    }

}
