package Main;

import Classes.*;
import DAL.StudentDAO;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
            SysFunctions run= new SysFunctions();
            //run.AddCurs();
            run.AddStudent();

    }
}



