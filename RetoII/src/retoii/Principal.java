/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoii;

import java.util.ArrayList;
import java.util.Scanner;
import person_pkg.AdminEmployeeClass;
import person_pkg.ClientPersonClass;
import person_pkg.EmployeePersonClass;
import person_pkg.PersonClass;

/**
 *
 * @author apmejiar
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciar clase person
        Scanner inst_input_data = new Scanner(System.in);

        ArrayList listEmployeesPersons = new ArrayList();
        ArrayList listClientsPersons = new ArrayList();
        System.out.println("Deseas añadir:\n        1. Empleados\n        2. Clientes");
        int add_person_type = inst_input_data.nextInt();

        System.out.println("Cantidad a añadir");
        int cant_persons_add = inst_input_data.nextInt();

        if (add_person_type == 1) {
            for (int i = 1; i <= cant_persons_add; i++) {
                System.out.println("********EMPLEADO " + i + "********\nNombre empleado");
                String name_employee = inst_input_data.next();
                inst_input_data.nextLine();

                System.out.println("Número documento ");
                int id_employee = inst_input_data.nextInt();
                System.out.println("El empleado ocupará un cargo administrativo? (Si, No)");
                String admin_position = inst_input_data.next();
                if(admin_position.toLowerCase().equals("si")||admin_position.toLowerCase().equals("sí")){
                    AdminEmployeeClass inst_admin = new AdminEmployeeClass(name_employee, id_employee, "Category 1", 23);
                    listEmployeesPersons.add(inst_admin);
                }else if(admin_position.toLowerCase().equals("no")){
                    EmployeePersonClass inst_employee = new EmployeePersonClass(name_employee, id_employee);
                    listEmployeesPersons.add(inst_employee);
                }else{
                    System.out.println("Opción inválida");
                }
            }
            
            for (int i = 0; i < listEmployeesPersons.size(); i++) {
                EmployeePersonClass inst_employee_get = (EmployeePersonClass) listEmployeesPersons.get(i);
               
                System.out.println("Nombre: " + inst_employee_get.getName());
                System.out.println("Documento: " + inst_employee_get.getId());
            }
             for (int i = 0; i < listEmployeesPersons.size(); i++) {
               
                AdminEmployeeClass inst_admin_get = (AdminEmployeeClass) listEmployeesPersons.get(i);
                System.out.println("Nombre: " + inst_admin_get.getName());
                System.out.println("Documento: " + inst_admin_get.getId());
                System.out.println("Categoría: "+ inst_admin_get.getCategory());
                System.out.println("Subordinados: "+ inst_admin_get.getNum_subordinates());
            }
            
            System.out.println("Qué más deseas hacer\n      1. Listar los empleados\n      2. Editar un empleado\n      3. Eliminar un empleado\n      4. Salir del sistema");
            int opcion_intermedia = inst_input_data.nextInt();
            if (opcion_intermedia == 1) {
                System.out.println("EMPLEADOS");
                for (int i = 0; i < listEmployeesPersons.size(); i++) {
                    System.out.println("\n==============================================================");
                    EmployeePersonClass inst_employee = (EmployeePersonClass) listEmployeesPersons.get(i);
                    System.out.println("Nombre: " + inst_employee.getName());
                    System.out.println("Documento: " + inst_employee.getId());
                    System.out.println("==============================================================");
                }
            } else if (opcion_intermedia == 2) {
                System.out.println("Posición empleado que deseas editar");
                int index_employee = inst_input_data.nextInt();
                if (index_employee >= 0 && index_employee < listEmployeesPersons.size()) {
                    EmployeePersonClass inst_employee = (EmployeePersonClass) listEmployeesPersons.get(index_employee);
                    System.out.println("Nombre actual: " + inst_employee.getName());
                    System.out.println("Documento actual: " + inst_employee.getId());
                    System.out.println("Deseas editar:\n        1. Nombre\n        2. Documento");
                    int option_edit = inst_input_data.nextInt();
                    System.out.println("Ingresa el nuevo valor");
                    if (option_edit == 1) {
                        String new_name = inst_input_data.nextLine();
                        inst_input_data.nextLine();
                        inst_employee.setName(new_name);
                    } else if (option_edit == 2) {
                        int new_document = inst_input_data.nextInt();
                        inst_employee.setId(new_document);
                    } else {
                        System.out.println("Opción inválida");
                    }
                    System.out.println("INFORMACIÓN ACTUALIZADA");
                    System.out.println("Nombre: " + inst_employee.getName());
                    System.out.println("Documento: " + inst_employee.getId());
                }

            } else if (opcion_intermedia == 3) {
                System.out.println("Posición empleado que deseas editar");
                int index_employee = inst_input_data.nextInt();
                if (index_employee >= 0 && index_employee < listEmployeesPersons.size()) {
                    EmployeePersonClass inst_employee = (EmployeePersonClass) listEmployeesPersons.remove(index_employee);

                    for (int i = 0; i < listEmployeesPersons.size(); i++) {
                        EmployeePersonClass inst_employee_get = (EmployeePersonClass) listEmployeesPersons.get(i);
                        System.out.println("Nombre: " + inst_employee_get.getName());
                        System.out.println("Documento: " + inst_employee_get.getId());
                    }
                }
            } else {
                System.out.println("Salir");
            }
        } else if (add_person_type == 2) {
            for (int i = 1; i <= cant_persons_add; i++) {
                System.out.println("********CLIENTE " + i + "********\nNombre cliente");
                String name_client = inst_input_data.nextLine();
                inst_input_data.nextLine();

                System.out.println("Número documento ");
                int id_client = inst_input_data.nextInt();

                ClientPersonClass inst_client = new ClientPersonClass(name_client, id_client);
                listClientsPersons.add(inst_client);
            }
            System.out.println("Qué más deseas hacer\n      1. Listar los empleados\n      2. Editar un empleado\n      3. Eliminar un empleado\n      4. Salir del sistema");
            int opcion_intermedia = inst_input_data.nextInt();
            if (opcion_intermedia == 1) {
                System.out.println("CLIENTES:");
                for (int i = 0; i < listClientsPersons.size(); i++) {
                    System.out.println("==============================================================");
                    ClientPersonClass inst_client = (ClientPersonClass) listClientsPersons.get(i);
                    System.out.println("Nombre: " + inst_client.getName());
                    System.out.println("Documento: " + inst_client.getId());
                    System.out.println("==============================================================");
                }
            } else if (opcion_intermedia == 2) {
                System.out.println("Posición cliente que deseas editar");
                int index_client = inst_input_data.nextInt();
                if (index_client >= 0 && index_client < listClientsPersons.size()) {
                    ClientPersonClass inst_client = (ClientPersonClass) listClientsPersons.get(index_client);
                    System.out.println("Nombre actual: " + inst_client.getName());
                    System.out.println("Documento actual: " + inst_client.getId());
                    System.out.println("Deseas editar:\n        1. Nombre\n        2. Documento");
                    int option_edit = inst_input_data.nextInt();
                    System.out.println("Ingresa el nuevo valor");
                    if (option_edit == 1) {
                        String new_name = inst_input_data.nextLine();
                        inst_input_data.nextLine();
                        inst_client.setName(new_name);
                    } else if (option_edit == 2) {
                        int new_document = inst_input_data.nextInt();
                        inst_client.setId(new_document);
                    } else {
                        System.out.println("Opción inválida");
                    }
                    System.out.println("INFORMACIÓN ACTUALIZADA");
                    System.out.println("Nombre: " + inst_client.getName());
                    System.out.println("Documento: " + inst_client.getId());
                }
            } else if (opcion_intermedia == 3) {
                System.out.println("Posición cliente que deseas editar");
                int index_client = inst_input_data.nextInt();
                if (index_client >= 0 && index_client < listClientsPersons.size()) {
                    ClientPersonClass inst_client = (ClientPersonClass) listClientsPersons.remove(index_client);

                    for (int i = 0; i < listClientsPersons.size(); i++) {
                        ClientPersonClass inst_client_get = (ClientPersonClass) listClientsPersons.get(i);
                        System.out.println("Nombre: " + inst_client_get.getName());
                        System.out.println("Documento: " + inst_client_get.getId());
                    }
                }
            } else {
                System.out.println("Salir");
            }
        } else {
            System.out.println("Opción inválida");
        }
    }
}
