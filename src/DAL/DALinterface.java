package DAL;
import Classes.Student;
import java.sql.SQLException;
import java.util.List;

public interface DALinterface {


        public int add(Student object)
                throws SQLException;
        public void delete(int id)
                throws SQLException;
        public Student getStudent(int id)
                throws SQLException;
        public List<Student> getStudents()
                throws SQLException;
        public void update(Student object)
                throws SQLException;
    }

