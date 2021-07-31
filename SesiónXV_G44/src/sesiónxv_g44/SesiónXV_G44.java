/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesiónxv_g44;

import controller_pkg.Conexion;
import views_pkg.Departments;

/**
 *
 * @author apmejiar
 */
public class SesiónXV_G44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos las instancias de las clases o jframe
        Conexion inst_conn = new Conexion();
        Departments inst_frame = new Departments();
        //Mediante la instancia llamamos los métodos que necesitamos
        inst_conn.getConnection();
        inst_frame.setVisible(true);
    }
    
}
