package Classes;

import java.util.ArrayList;

public class Deparament {
    protected String nume_dept;
    protected ArrayList<Profesor> profesori;

    public Deparament(String nume_dept, ArrayList<Profesor> profesori) {
        this.nume_dept = nume_dept;
        this.profesori = profesori;
    }

    public String getNume_dept() {
        return nume_dept;
    }

    public void setNume_dept(String nume_dept) {
        this.nume_dept = nume_dept;
    }

    public ArrayList<Profesor> getProfesori() {
        return profesori;
    }

    public void setProfesori(ArrayList<Profesor> profesori) {
        this.profesori = profesori;
    }
}
