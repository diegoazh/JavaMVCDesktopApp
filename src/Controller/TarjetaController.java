/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ConnJv;
import Model.Tarjeta;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AdminFull
 */
public class TarjetaController {
    
    public ArrayList getTarjeta() {
        ConnJv.ConnetionSQL();
        ArrayList tarjetitas = new ArrayList();
        try {
            Statement st = ConnJv.getConn().createStatement();
            String query = "Select * from Tarjetas order by id_tarjeta";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Tarjeta t = new Tarjeta();
                t.setIdTarjeta(rs.getInt("id_tarjeta"));
                t.setDenominacion(rs.getString("denominacion"));
                tarjetitas.add(t);
            }
            rs.close();
            st.close();
            ConnJv.CloseConnSQL();
        } catch (SQLException ex) {
            Logger.getLogger(TarjetaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tarjetitas;
    }
    
}
