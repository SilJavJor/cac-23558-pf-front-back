
package dao;

import conetions.ConexionDB;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Orator;


public class OratorsDAO {

    public void add(Orator orator) {
        // String sql = "INSERT INTO oradores (nombre, apellido, tema, fecha_alta) VALUES (?, ?, ?, ?)";
        String sql = "INSERT INTO orators (name, lastName, email, saved_date, modication_date) VALUES (?, ?, ?, ?, ?)";
        
        // bloque try-with-resources
        // asegura que los recursos abiertos en su declaración (dentro de los paréntesis) se cierren automáticamente al final del bloque try 
        try (Connection conn = ConexionDB.conectar();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, orator.getName());
            ps.setString(2, orator.getLastName());
            ps.setString(2, orator.getEmail());
            ps.setString(3, orator.getTitle());
            ps.setString(3, orator.getTopic());
            ps.setDate(4, (Date) orator.getSavedDate());
            ps.setDate(4, (Date) orator.getModificationDate());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Orator getById(int id) {
        String sql = "SELECT * FROM orators WHERE id = ?";
        
        try (Connection conn = ConexionDB.conectar();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Orator orator = new Orator();
                
                orator.setId(rs.getInt("id"));
                orator.setName(rs.getString("name"));
                orator.setLastName(rs.getString("last_name"));
                orator.setTitle(rs.getString("title"));
                orator.setTopic(rs.getString("topic"));
                orator.setSavedDate(rs.getDate("saved_date"));
                orator.setModificationDate(rs.getDate("modification_date"));
                
                return orator;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Orator> getAll() {
        List<Orator> orators = new ArrayList<>();
        String sql = "SELECT * FROM orators";
        
        try (Connection conn = ConexionDB.conectar();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Orator orator = new Orator();
                orator.setId(rs.getInt("id"));
                orator.setName(rs.getString("name"));
                orator.setLastName(rs.getString("last_name"));
                orator.setTitle(rs.getString("title"));
                orator.setTopic(rs.getString("topic"));
                orator.setSavedDate(rs.getDate("saved_date"));
                orator.setModificationDate(rs.getDate("modification_date"));

                orators.add(orator);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return orators;
    }

    public void update(Orator orator) {
        String sql = "UPDATE orators SET name = ?, lastName = ?, email = ?, saved_date = ?, modication_date = ? WHERE = id = ?";

        try (Connection conn = ConexionDB.conectar();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, orator.getName());
            ps.setString(2, orator.getLastName());
            ps.setString(2, orator.getEmail());
            ps.setString(3, orator.getTitle());
            ps.setString(3, orator.getTopic());
            ps.setDate(4, (Date) orator.getSavedDate());
            ps.setDate(4, (Date) orator.getModificationDate());
            ps.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM oradores WHERE id = ?";

        try (Connection conn = ConexionDB.conectar();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}