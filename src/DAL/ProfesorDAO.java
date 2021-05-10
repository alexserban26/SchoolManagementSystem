package DAL;

import Classes.Profesor;
import Util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfesorDAO {

    static Connection con = DatabaseConnection.getConnection();
    
    public int add(Profesor profesor)
            throws SQLException
    {
        String query = "insert into Profesor(nume, prenume) VALUES (?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, profesor.getNume());
        ps.setString(2, profesor.getPrenume());
        int n = ps.executeUpdate();
        return n;
    }

    
    public void delete(int id)
            throws SQLException
    {
        String query = "delete from Profesor where IDprofesor = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    
    public Profesor getProfesor(int id)
            throws SQLException
    {

        String query = "select * from Profesor where IDprofesor= ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        Profesor stud = new Profesor(0);
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            stud.setIDprofesor(rs.getInt("IDProfesor"));
            stud.setNume(rs.getString("nume"));
            stud.setPrenume(rs.getString("prenume"));
        }

        if (check == true) {
            return stud;
        }
        else
            return null;
    }

    
    public List<Profesor> getProfesors()
            throws SQLException
    {
        String query = "select * from Profesor";
        PreparedStatement ps
                = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Profesor> ls = new ArrayList();

        while (rs.next()) {
            Profesor profesor = new Profesor(0);
            profesor.setIDprofesor(rs.getInt("IDprofesor"));
            profesor.setNume(rs.getString("nume"));
            profesor.setPrenume(rs.getString("prenume"));
            ls.add(profesor);
        }
        return ls;
    }

    
    public void update(Profesor profesor)
            throws SQLException
    {

        String query
                = "update Profesor set nume=?, prenume= ? where IDprofesor = ?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setString(1, profesor.getNume());
        ps.setString(2, profesor.getPrenume());
        ps.setInt(3,profesor.getIDprofesor());
        ps.executeUpdate();
    }
}
