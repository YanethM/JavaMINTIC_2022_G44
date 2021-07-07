/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculoproject;
import java.util.Scanner;
/**
 *
 * @author apmejiar
 */
public class VehiculoProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inst_scanner = new Scanner(System.in);
        Vehiculo inst = new Vehiculo("MIN202", "Misión TIC", 2022, 2000);
        System.out.println(inst.consultarInformacionVehiculo());
        
        //Consultar placa de forma estática
        inst.consultarInformacionVehiculoPorPlaca("MIN202");
        //Consultar placa de forma dinámica
        System.out.println("\nIngresa la placa del vehiculo a consultar:");
        String placa_consultada = inst_scanner.nextLine();
        inst.consultarInformacionVehiculoPorPlaca(placa_consultada);  
    }
    
}
