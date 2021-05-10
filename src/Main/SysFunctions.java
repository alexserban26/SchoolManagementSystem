package Main;

import Classes.*;
import DAL.*;
import DAL.StudentDAO;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class SysFunctions {
    public void AddStudent() throws SQLException {
        Student stud = new Student();
        StudentDAO studDao = new StudentDAO();
        studDao.add(stud);
    }

    public void SelectStudent() throws SQLException {
        StudentDAO studDao = new StudentDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti ID-ul studentului:");
        int x = in.nextInt();
        Student e = studDao.getStudent(x);
        System.out.println(e.getIDstudent() + " "
                + e.getNume() + " " + e.getPrenume() + " "
                + e.getGrupa());
    }

    public void SelectAllStudents() throws SQLException {
        StudentDAO studDao = new StudentDAO();
        List<Student> ls = studDao.getStudents();
        for (Student allstud : ls) {
            System.out.println(allstud.getIDstudent() + " " + allstud.getNume() + " " + allstud.getPrenume() + " "
                    + allstud.getGrupa());
        }
    }

    public void UpdateStudent() throws SQLException {
        StudentDAO studDao = new StudentDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti ID-ul studentului:");
        int x = in.nextInt();
        Student student = studDao.getStudent(x);
        System.out.println("Introduceti prenumele cu care doriti sa schimbati:");
        student.setPrenume(in.nextLine());
        studDao.update(student);
    }

    public void DeleteStudent() throws SQLException {
        StudentDAO studDao = new StudentDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti ID-ul studentului:");
        int x = in.nextInt();
        studDao.delete(x);
    }

    public void AddCurs() throws SQLException {
        Curs curs = new Curs();
        CursDAO cursDAO = new CursDAO();
        cursDAO.add(curs);
    }

    public void SelectCurs() throws SQLException {
        CursDAO cursDAO = new CursDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti ID-ul cursului:");
        int x = in.nextInt();
        Curs e = cursDAO.getCurs(x);
        System.out.println(e.getIDcurs() + " "
                + e.getDenumire() + " " + e.getCredite() + " "
                + e.getSerie());
    }

    public void SelectAllCurs() throws SQLException {
        CursDAO cursDAO = new CursDAO();
        List<Curs> ls = cursDAO.getCurss();
        for (Curs allcurs : ls) {
            System.out.println(allcurs.getIDcurs() + " " + allcurs.getDenumire() + " " + allcurs.getCredite() + " "
                    + allcurs.getSerie());
        }
    }

    public void UpdateCurs() throws SQLException {
        CursDAO cursDAO = new CursDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti ID-ul Cursului:");
        int x = in.nextInt();
        Curs curs = CursDAO.getCurs(x);
        System.out.println("Introduceti numarul de credite al cursului:");
        curs.setCredite(in.nextInt());
        cursDAO.update(curs);
    }

    public void DeleteCurs() throws SQLException {
        CursDAO cursDAO = new CursDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti ID-ul cursului:");
        int x = in.nextInt();
        cursDAO.delete(x);
    }

    public void AddCursStudent() throws SQLException {
        CursStudent curs = new CursStudent();
        CursStudentDAO cursDAO = new CursStudentDAO();
        cursDAO.add(curs);
    }

    public void SelectCursStudent() throws SQLException {
        CursStudentDAO cursDAO = new CursStudentDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti ID-ul cursului:");
        int x = in.nextInt();
        System.out.println("Introduceti ID-ul studentului:");
        int y = in.nextInt();
        CursStudent e = cursDAO.getCurs(x,y);
        System.out.println(e.getIDcurs() + " "
                + e.getIDstudent() + " " + e.getMedie());
    }

    public void SelectAllCursStudent() throws SQLException {
        CursStudentDAO cursDAO = new CursStudentDAO();
        List<CursStudent> ls = cursDAO.getCurss();
        for (CursStudent e : ls) {
            System.out.println(e.getIDcurs() + " "
                    + e.getIDstudent() + " " + e.getMedie());
        }
    }

    public void UpdateCursStudent() throws SQLException {
        CursStudentDAO cursDAO = new CursStudentDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti ID-ul cursului:");
        int x = in.nextInt();
        System.out.println("Introduceti ID-ul studentului:");
        int y = in.nextInt();
        System.out.println("Introduceti media la curs a studentului:");
        int z = in.nextInt();
        CursStudent curs = CursStudentDAO.getCurs(x,y);
        curs.setMedie(z);
        cursDAO.update(curs);
    }

    public void DeleteCursStudent() throws SQLException {
        CursStudentDAO cursDAO = new CursStudentDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti ID-ul cursului:");
        int x = in.nextInt();
        System.out.println("Introduceti ID-ul studentului:");
        int y = in.nextInt();
        cursDAO.delete(x,y);
    }

    public void AddProfesor() throws SQLException {
        Profesor stud = new Profesor();
        ProfesorDAO studDao = new ProfesorDAO();
        studDao.add(stud);
    }

    public void SelectProfesor() throws SQLException {
        ProfesorDAO studDao = new ProfesorDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti ID-ul Profesorului:");
        int x = in.nextInt();
        Profesor e = studDao.getProfesor(x);
        System.out.println(e.getIDprofesor() + " "
                + e.getNume() + " " + e.getPrenume());
    }

    public void SelectAllProfesors() throws SQLException {
        ProfesorDAO studDao = new ProfesorDAO();
        List<Profesor> ls = studDao.getProfesors();
        for (Profesor allprof : ls) {
            System.out.println(allprof.getIDprofesor() + " " + allprof.getNume() + " " + allprof.getPrenume());
        }
    }

    public void UpdateProfesor() throws SQLException {
        ProfesorDAO studDao = new ProfesorDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti ID-ul Profesorului:");
        int x = in.nextInt();
        Profesor Profesor = studDao.getProfesor(x);
        System.out.println("Introduceti prenumele cu care doriti sa schimbati:");
        Profesor.setPrenume(in.nextLine());
        studDao.update(Profesor);
    }

    public void DeleteProfesor() throws SQLException {
        ProfesorDAO studDao = new ProfesorDAO();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti ID-ul Profesorului:");
        int x = in.nextInt();
        studDao.delete(x);
    }



}
