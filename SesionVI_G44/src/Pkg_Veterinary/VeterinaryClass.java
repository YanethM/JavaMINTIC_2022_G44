/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pkg_Veterinary;

/**
 *
 * @author apmejiar
 */
public class VeterinaryClass {
    private String name;
    private int phone;
    private String address;
    private String NIT;
    private DoctorClass doctor;
    
    public VeterinaryClass(String name, int phone, String address, String NIT, DoctorClass doctor) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.NIT = NIT;
        this.doctor = doctor;
    }

    public int PetCare(PetClass pet_sick){
        System.out.println("Atendiendo a la mascota " + pet_sick.getName());
        return pet_sick.getHealthStatus();
    }
    
    public void PetCareMethod(PetClass pet_sick){
        System.out.println("Atendiendo a la mascota " + pet_sick.getName()+ "\nEstado de salud es delicado");
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
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the NIT
     */
    public String getNIT() {
        return NIT;
    }

    /**
     * @param NIT the NIT to set
     */
    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    /**
     * @return the doctor
     */
    public DoctorClass getDoctor() {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(DoctorClass doctor) {
        this.doctor = doctor;
    }
    
    public String ShowInfo(DoctorClass doc){
        return doc.getName() + " trabaja en la veterinaria " + getName() + " cuyo NIT es " + getNIT();
    }
    
}
