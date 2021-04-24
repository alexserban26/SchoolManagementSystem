package DAL;
import Classes.Student;
import java.sql.SQLException;
import java.util.List;

public interface StudentDALinterface {


        public int add(Student stud)
                throws SQLException;
        public void delete(int id)
                throws SQLException;
        public Student getStudent(int id)
                throws SQLException;
        public List<Student> getStudents()
                throws SQLException;
        public void update(Student stud)
                throws SQLException;
    }

