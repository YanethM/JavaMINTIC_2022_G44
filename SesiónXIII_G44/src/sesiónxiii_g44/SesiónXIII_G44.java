/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesiónxiii_g44;

import controller_pkg.*;
import views_pkg.Employees;

/**
 *
 * @author apmejiar
 */
public class SesiónXIII_G44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion inst_conn = new Conexion();
        Employees inst_employee = new Employees();
        inst_conn.getConnection();
        inst_employee.setVisible(true);
    }

}
