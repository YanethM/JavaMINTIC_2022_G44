/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionv_g44;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

/**
 *
 * @author apmejiar
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //>>>>>>>>>>>>>>>>FORMA I trabajar con fechas:<<<<<<<<<<<<<<<<
        Date fecha = new Date(120,10,10);
        ///13/05/2017
        Date fecha2 = new Date(117,04,13);
        //Año = a partir de 1900 sumamos los años faltantes para llegar al año que necesitamos
        //Mes: Iniciamos con enero = 0 diciembre = 11
        
        //Formato: dd/MM/yyyy 10/11/2010
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        //>>>>>>>>>>>>>>>>FORMA II trabajar con fechas:<<<<<<<<<<<<<<<<
        // Formato: yyyy-MM-dd
        //System.out.println(LocalDate.of(2020,Month.NOVEMBER,10));
        
        //1. Creamos la instancia de la clase
        //>>>>> Debemos inicializar los atributos del constructor de la instancia
        //2. Mediante la instancia llamamos las funciones o los métodos de la clase
        MascotaPerroClass inst_mascota_perro = new MascotaPerroClass(1, "Dante", "Bull terrier", formato.format(fecha), 'M', 1053811);
        MascotaPerroClass inst_mascota_perro_2 = new MascotaPerroClass(2, "Donatelo", "Pitbull", formato.format(fecha2), 'M', 1053811);
        MascotaColeccionClass inst_arraylist_class = new MascotaColeccionClass();
        System.out.println(inst_arraylist_class.añadir_elementos_array());
        System.out.println(inst_arraylist_class.eliminar_elemento_array());
        System.out.println(inst_arraylist_class.consultar_elemento_array());
        System.out.println(inst_arraylist_class.modificar_elemento_array());
        inst_arraylist_class.validar_lista_vacia();
        
        
        System.out.println(inst_mascota_perro.getNombre_mascota());
        System.out.println(inst_mascota_perro_2.getNombre_mascota());
        //Acceder a los métodos y funciones de la superclase mediante la instancia inst_mascota_perro
        System.out.println(inst_mascota_perro.consultar_info_mascota_f());
        inst_mascota_perro.consultar_info_mascota_m();
        inst_mascota_perro.consultar_mascota_determinada(1);
        
        //Acceder a los métodos y funciones de la superclase mediante la instancia inst_mascota_perro
        System.out.println(inst_mascota_perro_2.consultar_info_mascota_f());
        inst_mascota_perro_2.consultar_info_mascota_m();
        inst_mascota_perro_2.consultar_mascota_determinada(2);
        
        inst_mascota_perro.entrenar_Cachorro(1);
        System.out.println(inst_mascota_perro_2.entrenar_Cachorro_funcion(2));
    }
    
}
