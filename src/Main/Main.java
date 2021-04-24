package Main;

import Classes.*;
import DAL.StudentDAO;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        Student stud = new Student();
        stud.setNume("Serban");
        stud.setPrenume("Alex");
        stud.setGrupa("251");
        StudentDAO studDao
                = new StudentDAO();

        // add
        studDao.add(stud);

        // read
        Student e = studDao.getStudent(2);
        System.out.println(e.getIDstudent() + " "
                + e.getNume() + " "+e.getPrenume()+" "
                + e.getGrupa());

        // read All
        List<Student> ls = studDao.getStudents();
        for (Student allstud : ls) {
            System.out.println(allstud);
        }

        // update
        Student student = studDao.getStudent(1);
        student.setPrenume("Andrei");
        studDao.update(student);

        // delete
        studDao.delete(1);
    }
}



