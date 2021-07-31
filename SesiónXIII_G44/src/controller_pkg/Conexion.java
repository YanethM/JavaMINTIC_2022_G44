package controller_pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author apmejiar
 */
public class Conexion {

    Connection connection;

    public Conexion() {
        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/admin_user_db_g44";
        try {
            Class.forName(driver);
            connection = (Connection) DriverManager.getConnection(url, user, password);
            if (connection != null) {
                System.out.println("Conexión exitosa");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No se pudo establecer conexión");
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
