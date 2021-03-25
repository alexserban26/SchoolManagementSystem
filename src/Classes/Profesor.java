package Classes;

import java.util.Vector;

public class Profesor extends Angajat{
    private static int salariu_baza = 4000;
    private Vector<Curs> cursuri_predate=new Vector<Curs>();

    public Profesor(Vector<Curs> cursuri_predate) {
        super();
        this.cursuri_predate = cursuri_predate;
        Calcul_salariu();
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
    public void Calcul_salariu(){
        if(getCursuri_predate().size()>3) setSalariu((int)(getSalariu_baza()*getCursuri_predate().size()*0.6));
        if(getCursuri_predate().size()<=3) setSalariu((int)(getSalariu_baza()*getCursuri_predate().size()*0.75));
        if(getCursuri_predate().size()>5) setSalariu((int)(getSalariu_baza()*getCursuri_predate().size()*0.5));
    }
    public void AddCurs(Curs curs){
        this.cursuri_predate.add(curs);
        Calcul_salariu();
    }
    public void Avansare(String functie){
        setFunctie(functie);
    }
}
