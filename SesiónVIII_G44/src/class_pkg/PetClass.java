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
public class PetClass {
    
    private Scanner inst_datos = new Scanner(System.in);
    //Manejo de color de texto por consola:
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    
    private int code;
    private String name;
    private int born_year;
    private String color;
    private String health_status;
    private String breed;
    private boolean pedigree;

    public PetClass() {
    }

    
    public PetClass(int code, String name, int born_year, String color, String health_status, String breed, boolean pedigree) {
        this.code = code;
        this.name = name;
        this.born_year = born_year;
        this.color = color;
        this.health_status = health_status;
        this.breed = breed;
        this.pedigree = pedigree;
    }

    
    
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBorn_year() {
        return born_year;
    }

    public void setBorn_year(int born_year) {
        this.born_year = born_year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHealth_status() {
        return health_status;
    }

    public void setHealth_status(String health_status) {
        this.health_status = health_status;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    
    
    public void crud_pet(){
        ArrayList<PetClass> arrayObjectPet = new ArrayList<>();
        boolean exit_program = false;
        while(!exit_program){
            System.out.println(ANSI_PURPLE + "===================================================================" +ANSI_RESET);
            System.out.println(ANSI_BLUE + "                    VETERINARIA MINTIC.INC" +ANSI_RESET);
            System.out.println(ANSI_PURPLE + "===================================================================" +ANSI_RESET);
            
        }
    }

    /**
     * @return the pedigree
     */
    public boolean isPedigree() {
        return pedigree;
    }

    /**
     * @param pedigree the pedigree to set
     */
    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }

   
}
