/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionvi_g44;

import Pkg_Veterinary.CatPetClass;
import Pkg_Veterinary.DoctorClass;
import Pkg_Veterinary.DogPetClass;
import Pkg_Veterinary.VeterinaryClass;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author apmejiar
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inst_entrada_datos = new Scanner(System.in);
        DoctorClass inst_doctor = new DoctorClass("Chaputin", "DOC_12345");
        VeterinaryClass inst_veterinary = new VeterinaryClass("San Miguel", 8909099, "Calle50 #11-11", "99900988-9",inst_doctor);
        System.out.println(inst_veterinary.ShowInfo(inst_doctor));
        //Fecha por defecto
        //Año a partir de 1900
        //Meses a partir de 0
        //Ingresar una fecha diferente a la actual con Date y SimpleDateFormat
        Date fecha_nacimiento = new Date(118,4,13); 
        SimpleDateFormat formato_1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formato_2 = new SimpleDateFormat("dd-MMM-yyyy");
        //System.out.println(formato_2.format(fecha_nacimiento)); //13-may-2018
        
        //1. Crear instancias de clases pet(dog, cat)
        //Solicitar al usuario que diligencie un formulario donde se solicita:
        //Nombre de la mascota, fecha de nacimiento y raza
       
        System.out.println("Diligencia la siguiente información de tu mascota:\nNombre:");
        String name_pet = inst_entrada_datos.nextLine();
        
        DateTimeFormatter formato_f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Fecha (dd/MM/yyyy):");
        String fecha = inst_entrada_datos.nextLine();
        LocalDate birth_date = LocalDate.parse(fecha,formato_f);
        //System.out.println(birth_date);
        Period pet_age = Period.between(birth_date, LocalDate.now());
        System.out.println(name_pet + " tiene " + pet_age.getYears() + " años.");
        System.out.println("Raza:");
        String raza_pet = inst_entrada_datos.nextLine();
        System.out.println("Estado de salud:\n         1. OK\n         2. NOT OK");
        int health_status_pet = inst_entrada_datos.nextInt();
        System.out.println("Sexo:");
        char sex_pet = inst_entrada_datos.next().charAt(0);
        
        //Instancia de la clase
        DogPetClass dog = new DogPetClass(1, name_pet, fecha, raza_pet, health_status_pet, sex_pet);
        CatPetClass cat = new CatPetClass(1, "Campo Elias", fecha, "Persia", 1);
        if(health_status_pet == 2){
            inst_veterinary.PetCareMethod(dog);
        }else if(health_status_pet == 1){
            System.out.println(dog.getName() + " se encuentra en óptimas condiciones");
        }else{
            System.out.println("Opción inválida");
        }
        
        dog.eat();
        cat.eat();
        dog.WalkAround();
        dog.WalkAround(2);
    }
    
}
