/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personproject;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author apmejiar
 */
public class PersonProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inst_scanner = new Scanner(System.in);
        Date fecha_actual = new Date();
        SimpleDateFormat nuevo_formato_fecha = new SimpleDateFormat("dd/MM/yyyy");
        PersonClass ints_persona = new PersonClass("Rocky", "C.C.", 1053, nuevo_formato_fecha.format(fecha_actual), 'M', true);
        System.out.println("**********Función**********\n" + ints_persona.consultar_info_persona_funcion());
        System.out.println("\n**********Método**********");
        ints_persona.consultar_info_persona_metodo();
        System.out.println("\n**********Método consulta por cédula**********");
        ints_persona.consultar_info_persona_por_cedula(1053);
        System.out.println("\nDiligencia la cédula a consultar:");
        int cedula_persona = inst_scanner.nextInt();
        ints_persona.consultar_info_persona_por_cedula(cedula_persona);
    }
    
}
