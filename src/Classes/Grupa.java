package Classes;

import java.util.ArrayList;
import java.util.Vector;

public class Grupa {
    private String numar;
    private ArrayList<Student> studenti = new ArrayList<Student>();

    public Grupa(String numar, ArrayList<Student> studenti) {
        this.numar = numar;
        this.studenti = studenti;
    }

    public String getNumar() {
        return numar;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }

    public ArrayList<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(ArrayList<Student> studenti) {
        this.studenti = studenti;
    }


}
