/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionii.g44;

/**
 *
 * @author apmejiar
 */
//Las funciones son las que RETORNAN, es decir, al final tienen la palabra clave RETURN
//Los métodos imprimen (System.out,println()) NO RETORNAN, tienen como palabra clave VOID
public class VehiculoClass {
    //Ambos son métodos Get y Set
    //Get: Es una función que nos permite obtener o consultar el valor de la variable
    //Set: Es un método que nos permite modificar el valor de una variable
    private String placa;
    private String marca;
    private String color;
    private int modelo;

    
    //identificadores de la clase donde podemos instanciarla desde otras clases e inicializar los atributos
    public VehiculoClass(String placa_v, String marca_v,String color_v, int modelo_v) {
        //A la variable global le asigno como valor el que ingresa como parametro de la función
        this.placa = placa_v;
        this.marca = marca_v;
        this.color = color_v;
        this.modelo = modelo_v;
        System.out.println("Placa: " + this.placa + "\nMarca: "+ this.marca + "\nColor: "+ this.color + "\nModelo: " + this.modelo);
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
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
    
    
    public String consultar_informacion_vehiculo(){
        return getPlaca() + "\n" + getMarca() + "\n" + getColor() + "\n" + getModelo();
    }
}
