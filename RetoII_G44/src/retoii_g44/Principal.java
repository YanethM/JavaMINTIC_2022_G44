/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoii_g44;

import class_pkg.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author apmejiar
 */
public class Principal {

    private static Scanner inst_entrada_datos = new Scanner(System.in);
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    private static int option;

    public static void employee_crud() {
        
        ArrayList<EmployeeClass> employee_list = new ArrayList<>();
        boolean exit_system = false;
        //while(exit_system == true)
        while (!exit_system) {
            System.out.println(ANSI_BLUE + "INGRESA LA OPCIÓN"+ ANSI_RESET);
            System.out.println(" 1. Crear empleado");
            System.out.println(" 2. Listar empleados existentes");
            System.out.println(" 3. Eliminar un empleado");
            System.out.println(" 4. Modificar información empleado");
            System.out.println(" 5. Salir del sistema");

            option = Integer.parseInt(inst_entrada_datos.nextLine());
            //Según el número que el usuario ingrese llamamos los métodos del ArrayList
            //ADD("valor") Añadir
            //SET(indice) Modificar
            //REMOVE(indice) Eliminar
            //GET() Consultar
            switch (option) {
                case 1:
                    //Instanciamos la clase Empleado, mediante el constructor vacío
                  
                    System.out.println(ANSI_RED +"Cantidad de empleados a añadir"+ ANSI_RESET);
                    int cant_employee = Integer.parseInt(inst_entrada_datos.nextLine());

                    for (int i = 1; i <= cant_employee; i++) {
                        System.out.println("INGRESA LA SIGUIENTE INFORMACIÓN DEL EMPLEADO " + i);
                        System.out.println(ANSI_BLUE +"Nombre:"+ ANSI_RESET);
                        String name = inst_entrada_datos.nextLine();
                        System.out.println(ANSI_BLUE +"Apellido:"+ ANSI_RESET);
                        String lastname = inst_entrada_datos.nextLine();
                        System.out.println(ANSI_BLUE +"Documento:"+ ANSI_RESET);
                        int document = Integer.parseInt(inst_entrada_datos.nextLine());
                        System.out.println(ANSI_BLUE +"Salario:"+ ANSI_RESET);
                        int salary = Integer.parseInt(inst_entrada_datos.nextLine());
                        System.out.println(ANSI_BLUE +"Email:"+ ANSI_RESET);
                        String email = inst_entrada_datos.nextLine();
                        System.out.println(ANSI_BLUE +"Categoría:"+ ANSI_RESET);
                        int category = Integer.parseInt(inst_entrada_datos.nextLine());
                        CompanyClass company = new CompanyClass("MINTIC", "999999999-1");
                       
                        EmployeeClass inst_employee = new EmployeeClass(document, name, lastname, company);
                        employee_list.add(inst_employee);
                       

                    }
                    break;
                case 2:
                    System.out.println("Total empleados: " + employee_list.size());
                    for (int i = 0; i < employee_list.size(); i++) {
                        System.out.println("INFORMACIÓN EMPLEADO " + (i + 1));
                        EmployeeClass employee_get = (EmployeeClass) employee_list.get(i);
                        System.out.println("Nombre: " + employee_get.getName());
                        System.out.println("Apellido: " + employee_get.getLastname());
                        System.out.println("Documento: " + employee_get.getDocument());

                        System.out.println("Empresa: " + employee_get.getCompany());
                        System.out.println("Salario: " + employee_get.getSalary());
                        
                        String nombre_cargo = "";
                        if (employee_get.getCategory() == 1) {
                            AdminClass admin = new AdminClass(5);
                            nombre_cargo = "Administrador";
                            System.out.println("Categoria: " + nombre_cargo + "\nSubordinados a cargo: " + admin.getNum_subordinates());
                        } else if (employee_get.getCategory() == 2) {
                            nombre_cargo = "Subordinado";
                            System.out.println("Categoria: " + nombre_cargo);
                        } else {
                            System.out.println("Cargo inválido");
                        }
                    }
                    break;
            }
        }
    }

    public static void client_crud() {
        ArrayList<ClientClass> client_list = new ArrayList<>();
    }

    public static void company_crud() {
        ArrayList<CompanyClass> company_list = new ArrayList<>();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        employee_crud();
    }

}
