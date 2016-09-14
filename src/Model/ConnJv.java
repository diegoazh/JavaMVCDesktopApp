/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AdminFull
 */
public class ConnJv {
    private static Connection conn = null;
    private static String url = "jdbc:sqlserver://192.168.0.20:1433;databaseName=JavaDevelopment";
    private static String user = "practica";
    private static String pass = "123";

    
    public static void ConnetionSQL() {
        try {
            conn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            Logger.getLogger(ConnJv.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void CloseConnSQL() {
        try {
            if (conn != null)
                conn.close();
            else
                return;
        } catch (SQLException ex) {
            Logger.getLogger(ConnJv.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConn() {
        return conn;
    }
    
    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        ConnJv.url = url;
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        ConnJv.user = user;
    }

    public static String getPass() {
        return pass;
    }

    public static void setPass(String pass) {
        ConnJv.pass = pass;
    }
}
