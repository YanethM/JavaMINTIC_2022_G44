/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculoproject;

/**
 *
 * @author apmejiar
 */
public class Vehiculo {
    private String placa;
    private String marca;
    private int modelo;
    private int cilindraje;

    public Vehiculo(String placa, String marca, int modelo, int cilindraje) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
    }


    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the cilindraje
     */
    public int getCilindraje() {
        return cilindraje;
    }

    /**
     * @param cilindraje the cilindraje to set
     */
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public String consultarInformacionVehiculo(){
        return "Información del vehiculo\n        >> Placa:" + getPlaca() + "\n        >> Marca: " 
                + getMarca() + "\n        >> Modelo: " + getModelo() + 
                "\n        >> Cilindraje: "+ getCilindraje();
    }
    
    public void consultarInformacionVehiculoPorPlaca(String placa){
        //Consultamos con getPlaca el valor de la variable placa global y lo
        //Comparamos con el que ingreso el usuario o el programador desde el main
        if(getPlaca().equals(placa)){
            System.out.println("\nLa placa consultada fue: " + getPlaca() + "\n        >> Marca: " + getMarca() + "\n        >> Modelo:" + getModelo() + "\n        >> Cilindraje: "+ getCilindraje());
        }else{
            System.out.println("No se tiene información del vehiculo consultado placa: " + placa);
        }
    }
    
}
