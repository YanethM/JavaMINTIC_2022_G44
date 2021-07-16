/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_pkg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author apmejiar
 */
public class DogPetClass extends PetClass {

    private Scanner inst_datos = new Scanner(System.in);
    //Manejo de color de texto por consola:
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_PURPLE = "\u001B[35m";

    public DogPetClass() {
    }

    public DogPetClass(int code, String name, int born_year, String color, String health_status, String breed, boolean pedigree) {
        super(code, name, born_year, color, health_status, breed, pedigree);
    }

    @Override
    public void crud_pet() {
        PetClass pet = new PetClass();
        ArrayList<DogPetClass> arrayObjectPet = new ArrayList<>();
        boolean exit_program = false;
        while (!exit_program) {
            System.out.println(ANSI_PURPLE + "===================================================================" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "                    VETERINARIA MINTIC.INC" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "===================================================================" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "Selecciona una opción del menú" + ANSI_RESET);
            System.out.println("        1. Añadir mascota");
            System.out.println("        2. Listar mascotas");
            System.out.println("        3. Editar mascota");
            System.out.println("        4. Eliminar mascotas");
            System.out.println(ANSI_RED + "        5. Salir del programa" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "Tu respuesta:" + ANSI_RESET);
            int option = Integer.parseInt(inst_datos.nextLine());
            //Métodos con arraylist(add(valor), get(index), set(index, valor_nuevo), remove(indice))
            switch (option) {
                case 1:
                    System.out.println(ANSI_RED + "Cuántos perros deseas añadir?" + ANSI_RESET);
                    int num_dogs = Integer.parseInt(inst_datos.nextLine());
                    System.out.println(ANSI_PURPLE + "===================================================================" + ANSI_RESET);
                    System.out.println(ANSI_BLUE + "            FORMULARIO DE REGISTRO MASCOTA" + ANSI_RESET);
                    for (int i = 1; i <= num_dogs; i++) {
                        System.out.println("\n" + ANSI_BLUE + "            Información mascota " + i + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "Código:" + ANSI_RESET);
                        int code = Integer.parseInt(inst_datos.nextLine());

                        System.out.println(ANSI_BLUE + "Nombre:" + ANSI_RESET);
                        String name = inst_datos.nextLine();

                        System.out.println(ANSI_BLUE + "Año de nacimiento" + ANSI_RESET);
                        int born_year = Integer.parseInt(inst_datos.nextLine());

                        System.out.println(ANSI_BLUE + "Color" + ANSI_RESET);
                        String color = inst_datos.nextLine();

                        System.out.println(ANSI_BLUE + "Estado de salud" + ANSI_RESET);
                        String health_status = inst_datos.nextLine();

                        System.out.println(ANSI_BLUE + "Raza" + ANSI_RESET);
                        String breed = inst_datos.nextLine();

                        System.out.println(ANSI_BLUE + "Es pedigree? (Sí, No)" + ANSI_RESET);
                        String pedigree = inst_datos.nextLine();
                        if (pedigree.toLowerCase().equals("si") || pedigree.toLowerCase().equals("sí")) {
                            pet.setPedigree(true);
                        } else if (pedigree.toLowerCase().equals("no")) {
                            pet.setPedigree(false);
                        } else {
                            System.out.println("Opción inválida");
                        }
                        DogPetClass dog = new DogPetClass(code, name, born_year, color, health_status, breed, pet.isPedigree());
                        arrayObjectPet.add(dog);
                        System.out.println(ANSI_PURPLE + "==============Se ha registrado la mascota exitosamente==============" + ANSI_RESET);
                    }
                    break;
                case 2:
                    System.out.println(ANSI_BLUE + "            BASE DE DATOS VETERINARIA MINTIC.INC" + ANSI_RESET);
                    for (int i = 0; i < arrayObjectPet.size(); i++) {
                        System.out.println("\n" + ANSI_BLUE + "            Mascota" + (i + 1) + ANSI_RESET);
                        DogPetClass dog = arrayObjectPet.get(i);
                        System.out.println(ANSI_BLUE + "Código: " + ANSI_RESET + dog.getCode());
                        System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + dog.getName());
                        System.out.println(ANSI_BLUE + "Año de nacimiento: " + ANSI_RESET + dog.getBorn_year());
                        System.out.println(ANSI_BLUE + "Color: " + ANSI_RESET + dog.getColor());
                        System.out.println(ANSI_BLUE + "Estado de salud: " + ANSI_RESET + dog.getHealth_status());
                        System.out.println(ANSI_BLUE + "Raza: " + ANSI_RESET + dog.getBreed());
                        System.out.println(ANSI_BLUE + "Pedigree: " + ANSI_RESET + dog.isPedigree());
                    }
                    break;
                case 3:
                    System.out.println(ANSI_BLUE + "            EDITAR MASCOTA EN MINTIC.INC" + ANSI_RESET);
                    System.out.println("Indicanos el indice de la mascota que deseas editar");
                    int index = Integer.parseInt(inst_datos.nextLine());
                    if (index >= 0 && index <= arrayObjectPet.size()) {
                        DogPetClass dog = arrayObjectPet.get(index);
                        System.out.println(ANSI_PURPLE + "Información actual de la mascota con código " + dog.getCode() + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + dog.getName());
                        System.out.println(ANSI_BLUE + "Año de nacimiento: " + ANSI_RESET + dog.getBorn_year());
                        System.out.println(ANSI_BLUE + "Color: " + ANSI_RESET + dog.getColor());
                        System.out.println(ANSI_BLUE + "Estado de salud: " + ANSI_RESET + dog.getHealth_status());
                        System.out.println(ANSI_BLUE + "Raza: " + ANSI_RESET + dog.getBreed());
                        System.out.println(ANSI_BLUE + "Pedigree: " + ANSI_RESET + dog.isPedigree());
                        System.out.println("Qué dato deseas editar?\n       1. Nombre\n       2. Año de nacimiento\n       3. Color\n       4. Raza\n       5. Estado de salud");
                        int option_e = Integer.parseInt(inst_datos.nextLine());
                        switch (option_e) {
                            case 1:
                                System.out.println(ANSI_PURPLE + "Nombre nuevo: " + ANSI_RESET);
                                String name = inst_datos.nextLine();
                                dog.setName(name);
                                break;
                            case 2:
                                System.out.println(ANSI_PURPLE + "Año de nacimiento nuevo: " + ANSI_RESET);
                                int year = Integer.parseInt(inst_datos.nextLine());
                                dog.setBorn_year(year);
                                break;
                            case 3:
                                System.out.println(ANSI_PURPLE + "Color nuevo: " + ANSI_RESET);
                                String color = inst_datos.nextLine();
                                dog.setColor(color);
                                break;
                            case 4:
                                System.out.println(ANSI_PURPLE + "Raza nueva: " + ANSI_RESET);
                                String breed = inst_datos.nextLine();
                                dog.setBreed(breed);
                                break;
                            case 5:
                                System.out.println(ANSI_PURPLE + "Estado de salud actual: " + ANSI_RESET);
                                String health_status = inst_datos.nextLine();
                                dog.setHealth_status(health_status);
                                break;
                            default:
                                System.out.println(ANSI_BLUE + "OPCIÓN INVÁLIDA" + ANSI_RESET);
                        }
                    }
                    break;
                case 4:
                    System.out.println(ANSI_BLUE + "            ELIMINAR MASCOTA EN MINTIC.INC" + ANSI_RESET);
                    System.out.println("Indicanos el indice de la mascota que deseas borrar del sistema");
                    index = Integer.parseInt(inst_datos.nextLine());
                    if (index >= 0 && index <= arrayObjectPet.size()) {
                        DogPetClass dog = arrayObjectPet.get(index);
                        System.out.println(ANSI_PURPLE + "Información actual de la mascota con código " + dog.getCode() + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + dog.getName());
                        System.out.println(ANSI_BLUE + "Estado de salud: " + ANSI_RESET + dog.getHealth_status());
                        System.out.println(ANSI_BLUE + "Seguro desea eliminar a " + dog.getName() + "? (Sí, No)" + ANSI_RESET);
                        String delete_pet = inst_datos.nextLine();
                        
                        if (delete_pet.toLowerCase().equals("si") || delete_pet.toLowerCase().equals("sí")) {
                            arrayObjectPet.remove(index);
                            System.out.println(ANSI_BLUE + "            BASE DE DATOS VETERINARIA MINTIC.INC" + ANSI_RESET);
                            for (int i = 0; i < arrayObjectPet.size(); i++) {
                                System.out.println("\n" + ANSI_BLUE + "            Mascota" + (i + 1) + ANSI_RESET);
                                DogPetClass lista_actual = arrayObjectPet.get(i);
                                System.out.println(ANSI_BLUE + "Código: " + ANSI_RESET + lista_actual.getCode());
                                System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + lista_actual.getName());
                                System.out.println(ANSI_BLUE + "Año de nacimiento: " + ANSI_RESET + lista_actual.getBorn_year());
                                System.out.println(ANSI_BLUE + "Color: " + ANSI_RESET + lista_actual.getColor());
                                System.out.println(ANSI_BLUE + "Estado de salud: " + ANSI_RESET + lista_actual.getHealth_status());
                                System.out.println(ANSI_BLUE + "Raza: " + ANSI_RESET + lista_actual.getBreed());
                                System.out.println(ANSI_BLUE + "Pedigree: " + ANSI_RESET + lista_actual.isPedigree());
                            }
                        } else {
                            System.out.println(ANSI_BLUE + "Cancelando proceso" + ANSI_RESET);
                        }
                    }
                    break;
                case 5:
                    exit_program = true;

                    System.out.println(ANSI_BLUE + "SALIENDO DEL PROGRAMA" + ANSI_RESET);

                    break;
                default:
                    System.out.println(ANSI_BLUE + "OPCIÓN INVÁLIDA" + ANSI_RESET);

            }
        }
    }
}
