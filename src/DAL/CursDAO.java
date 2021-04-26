package DAL;

import Classes.Curs;
import Util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CursDAO{

    static Connection con = DatabaseConnection.getConnection();

    public int add(Curs curs)
            throws SQLException
    {
        String query = "insert into Curs(denumire, serie, credite,IDprofesor) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, curs.getDenumire());
        ps.setString(2, curs.getSerie());
        ps.setInt(3,curs.getCredite());
        ps.setInt(4,curs.getProfesor());
        int n = ps.executeUpdate();
        return n;
    }

    public void delete(int id)
            throws SQLException
    {
        String query = "delete from Curs where IDcurs = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }


    public static Curs getCurs(int id)
            throws SQLException
    {

        String query = "select * from Curs where IDcurs= ?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, id);
        Curs curs = new Curs(0);
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            curs.setIDcurs(rs.getInt("IDcurs"));
            curs.setDenumire(rs.getString("denumire"));
            curs.setProfesor(rs.getInt("IDprofesor"));
            curs.setCredite(rs.getInt("credite"));
            curs.setSerie(rs.getString("serie"));
        }

        if (check == true) {
            return curs;
        }
        else
            return null;
    }


    public List<Curs> getCurss()
            throws SQLException
    {
        String query = "select * from Curs";
        PreparedStatement ps
                = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Curs> ls = new ArrayList();

        while (rs.next()) {
            Curs curs = new Curs(0);
            curs.setIDcurs(rs.getInt("IDcurs"));
            curs.setDenumire(rs.getString("denumire"));
            curs.setProfesor(rs.getInt("IDprofesor"));
            curs.setCredite(rs.getInt("credite"));
            curs.setSerie(rs.getString("serie"));
            ls.add(curs);
        }
        return ls;
    }


    public void update(Curs curs)
            throws SQLException
    {

        String query
                = "update Curs set denumire=?, profesor= ?, serie= ? where IDcurs = ?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setString(1, curs.getDenumire());
        ps.setInt(2, curs.getProfesor());
        ps.setString(3, curs.getSerie());
        ps.setInt(4,curs.getIDcurs());
        ps.executeUpdate();
    }
}
