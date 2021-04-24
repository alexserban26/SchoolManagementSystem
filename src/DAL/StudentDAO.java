package DAL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Classes.Student;
import Util.DatabaseConnection;
public class StudentDAO implements StudentDALinterface{
    static Connection con = DatabaseConnection.getConnection();
    @Override
    public int add(Student stud)
            throws SQLException
    {

        String query = "insert into Student(nume, prenume, grupa) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, stud.getNume());
        ps.setString(2, stud.getPrenume());
        ps.setString(3,stud.getGrupa());
        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public void delete(int id)
            throws SQLException
    {
        String query = "delete from Student where IDstudent =?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    @Override
    public Student getStudent(int id)
            throws SQLException
    {

        String query = "select * from Student where IDstudent= ?";
        PreparedStatement ps = con.prepareStatement(query);


        ps.setInt(1, id);
        Student stud = new Student();
        ResultSet rs = ps.executeQuery();
        boolean check = false;

        while (rs.next()) {
            check = true;
            stud.setIDstudent(rs.getInt("IDstudent"));
            stud.setNume(rs.getString("nume"));
            stud.setPrenume(rs.getString("prenume"));
            stud.setGrupa(rs.getString("grupa"));
        }

        if (check == true) {
            return stud;
        }
        else
            return null;
    }

    @Override
    public List<Student> getStudents()
            throws SQLException
    {
        String query = "select * from Student";
        PreparedStatement ps
                = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Student> ls = new ArrayList();

        while (rs.next()) {
            Student stud = new Student();
            stud.setIDstudent(rs.getInt("IDstudent"));
            stud.setNume(rs.getString("nume"));
            stud.setPrenume(rs.getString("prenume"));
            stud.setGrupa(rs.getString("grupa"));
            ls.add(stud);
        }
        return ls;
    }

    @Override
    public void update(Student stud)
            throws SQLException
    {

        String query
                = "update Student set nume=?, prenume= ?, grupa= ? where IDstudent = ?";
        PreparedStatement ps
                = con.prepareStatement(query);
        ps.setString(1, stud.getNume());
        ps.setString(2, stud.getPrenume());
        ps.setString(3, stud.getGrupa());
        ps.setInt(4,stud.getIDstudent());
        ps.executeUpdate();
    }
}

