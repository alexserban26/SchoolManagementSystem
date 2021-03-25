package Classes;

import java.util.Vector;

public class Profesor extends Angajat{
    private static int salariu_baza = 4000;
    private Vector<Curs> cursuri_predate=new Vector<Curs>();

    public Profesor(Vector<Curs> cursuri_predate) {
        super();
        this.cursuri_predate = cursuri_predate;
    }

    public static int getSalariu_baza() {
        return salariu_baza;
    }

    public static void setSalariu_baza(int salariu_baza) {
        Profesor.salariu_baza = salariu_baza;
    }

    public Vector<Curs> getCursuri_predate() {
        return cursuri_predate;
    }

    public void setCursuri_predate(Vector<Curs> cursuri_predate) {
        this.cursuri_predate = cursuri_predate;
    }
}
