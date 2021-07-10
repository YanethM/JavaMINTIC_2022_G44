/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pkg_Veterinary;

import java.util.Scanner;

/**
 *
 * @author apmejiar
 */
public class PetClass {
    Scanner inst_entrada_datos = new Scanner(System.in);
    private int code;
    private String name;
    private String born_date;
    private String raza;
    private int healthStatus;

    public PetClass(int code, String name, String born_date, String raza, int healthStatus) {
        this.code = code;
        this.name = name;
        this.born_date = born_date;
        this.raza = raza;
        this.healthStatus = healthStatus;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the born_date
     */
    public String getBorn_date() {
        return born_date;
    }

    /**
     * @param born_date the born_date to set
     */
    public void setBorn_date(String born_date) {
        this.born_date = born_date;
    }

    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

  
    
    public void eat(){
        System.out.println("Ingresa el nombre del alimento: ");
        String nombre_alimento = inst_entrada_datos.nextLine();
        System.out.println(getName() + " se alimenta con " + nombre_alimento);
    }
    
    public void WalkAround(){
        System.out.println(getName()+ " esta dando su paseo.");
    }
    
    public void WalkAround(int km){
        System.out.println(getName()+ " esta dando su paseo de " + km +" km.");
    }
    
    
    public String ShowPet(){
        System.out.println("Ingresa código de la mascota a consultar");
        int code_pet = inst_entrada_datos.nextInt();
        String informacion_mascota;
        //char gender = inst_entrada_datos.next().charAt(0);
        if(getCode() == code_pet){
            informacion_mascota = getName() +" " + getBorn_date()+" "+ getRaza()+" "+getHealthStatus();
        }else{
            informacion_mascota = "No se tienen registros de la mascota consultada.";
        }
        return informacion_mascota;
    }

    /**
     * @return the healthStatus
     */
    public int getHealthStatus() {
        return healthStatus;
    }

    /**
     * @param healthStatus the healthStatus to set
     */
    public void setHealthStatus(int healthStatus) {
        this.healthStatus = healthStatus;
    }
}
