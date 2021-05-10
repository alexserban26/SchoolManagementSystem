package DAL;

import Classes.CursStudent;
import Util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CursStudentDAO {
    static Connection con = DatabaseConnection.getConnection();

    public int add(CursStudent curs)
            throws SQLException
    {
        String query = "insert into CursStudent(IDCurs, IDstudent, medie) VALUES (?, ?, ?,)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, curs.getIDcurs());
        ps.setInt(2, curs.getIDstudent());
        ps.setInt(3,curs.getMedie());
        int n = ps.executeUpdate();
        return n;
    }

    public void delete(int id, int ids)
            throws SQLException
    {
        String query = "delete from CursStudent where IDcurs = ? and IDstudent = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.setInt(2, ids);
        ps.executeUpdate();
    }


    public static CursStudent getCurs(int id, int ids)
            throws SQLException
    {

        String query = "select * from CursStudent where IDcurs = ? and IDstudent = ?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, id);
        ps.setInt(2,ids);
        CursStudent curs = new CursStudent(0);
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            curs.setIDcurs(rs.getInt("IDcurs"));
            curs.setMedie(rs.getInt("medie"));
            curs.setIDstudent(rs.getInt("IDstudent"));
        }

        if (check == true) {
            return curs;
        }
        else
            return null;
    }


    public List<CursStudent> getCurss()
            throws SQLException
    {
        String query = "select * from CursStudent";
        PreparedStatement ps
                = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<CursStudent> ls = new ArrayList();

        while (rs.next()) {
            CursStudent curs = new CursStudent(0);

            curs.setIDcurs(rs.getInt("IDcurs"));
            curs.setMedie(rs.getInt("medie"));
            curs.setIDstudent(rs.getInt("IDstudent"));
            ls.add(curs);
        }
        return ls;
    }


    public void update(CursStudent curs)
            throws SQLException
    {

        String query
                = "update CursStudent set medie= ? where IDcurs = ? and IDstudent = ? ";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setInt(1, curs.getMedie());
        ps.setInt(2, curs.getIDcurs());
        ps.setInt(3,curs.getIDstudent());
        ps.executeUpdate();
    }
}
