/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionii.g44;
//Scanner nos permite solicitar por teclado datos al usuario
import java.util.Scanner;
/**
 *
 * @author apmejiar
 */
public class SesionIIG44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciamos la librería Scanner para hacer uso de sus funciones
        Scanner entrada_datos_user = new Scanner(System.in);
        // Instanciar la clase VehiculoClass
        System.out.println("***********CLASE CONDUCTOR***********");
        System.out.println("Ingresa la siguiente información:");
        
        System.out.println("        >>>Nombre:");
        String nombre_c = entrada_datos_user.nextLine();
        
        System.out.println("        >>>Categoría:");
        String categoria_c = entrada_datos_user.nextLine();
        
//        System.out.println("        >>>Infracción:");
//        String infraccion_c = entrada_datos_user.nextLine();
        
        System.out.println("        >>>Número de licencia:");
        int licencia_c = entrada_datos_user.nextInt(); 
        
        ConductorClass inst_conductor = new ConductorClass(nombre_c,licencia_c,categoria_c,"");
        System.out.println("        Información del conductor:\n        Nombre: " + inst_conductor.getNombre() + "\n        Categoría: " + inst_conductor.getCategoria());
        System.out.println(inst_conductor.multar());
        
        
        System.out.println("\n\n***********CLASE VEHICULO***********");
        VehiculoClass inst_vehiculo = new VehiculoClass("MIN202", "Misión TIC", "Pink", 2022);
        System.out.println("Mensaje que se imprime desde el constructor de la clase Vehiculo");
        //Llamar funciones y métodos de la clase mediante la instancia
        System.out.println("\nConsulta de valores con la función GET");
        System.out.println("        Placa obtenida: " + inst_vehiculo.getPlaca());
        System.out.println("        Marca obtenida: " + inst_vehiculo.getMarca());
        System.out.println("        Color obtenido: " + inst_vehiculo.getColor());
        System.out.println("        Modelo obtenido: " + inst_vehiculo.getModelo());
        System.out.println("\nActualización de valores con el método SET");
        inst_vehiculo.setPlaca("TIC201");
        System.out.println("        Nueva placa: " + inst_vehiculo.getPlaca());
        inst_vehiculo.setMarca("Mazda");
        System.out.println("        Nueva marca: " + inst_vehiculo.getMarca());
        inst_vehiculo.setColor("Blue & Pink");
        System.out.println("        Nuevo color: " + inst_vehiculo.getColor());
        inst_vehiculo.setModelo(2021);
        System.out.println("        Nuevo modelo: " + inst_vehiculo.getModelo());
        System.out.println("\nImprimir return de función consultar_informacion_vehiculo");
        System.out.println(inst_vehiculo.consultar_informacion_vehiculo());
        //**************************************************************************
        
        
    }
    
}
