/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ConnJv;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import Model.Compra;
import Model.Tarjeta;
import java.util.ArrayList;

/**
 *
 * @author AdminFull
 */
public class CompraController {

    public boolean setCompra(Compra c) {
        ConnJv.ConnetionSQL();
        try {
            Statement st = ConnJv.getConn().createStatement();
            String query = "insert into Compras values ('" + c.getConcepto() + "', " + c.getImporte() + ", " + c.getCuotas() + ", " + c.getTarjeta().getIdTarjeta() + ", '" + c.getFecha() + "' )";
            st.executeUpdate(query);
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(CompraController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        ConnJv.CloseConnSQL();
        return true;
    }

    public ArrayList getCompra() {
        ConnJv.ConnetionSQL();
        ArrayList compritas = new ArrayList();
        try {
            Statement st = ConnJv.getConn().createStatement();
            String query = "Select * from Compras order by fecha desc";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Compra c = new Compra();
                c.setIdCompra(rs.getInt("id_compra"));
                c.setConcepto(rs.getString("concepto"));
                c.setImporte(rs.getDouble("importe"));
                c.setCuotas(rs.getInt("cuotas"));
//                ResultSet rss = st.executeQuery("select * from Tarjetas where id_tarjeta = " + rs.getInt("id_tarjeta"));
//                Tarjeta t = new Tarjeta();
//                while (rss.next()) {
//                    t.setIdTarjeta(rss.getInt("id_tarjeta"));
//                    t.setDenominacion(rss.getString("denominacion"));
//                }
//                c.setTarjeta(t);
                c.setFecha(rs.getString("fecha"));
                compritas.add(c);
//                rss.close();
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(CompraController.class.getName()).log(Level.SEVERE, null, ex);
        }
        ConnJv.CloseConnSQL();
        return compritas;
    }
}
