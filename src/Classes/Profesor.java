package Classes;

import java.util.Scanner;
import java.util.Vector;

public class Profesor extends Angajat{
    private static int salariu_baza = 4000;
    private Vector<Curs> cursuri_predate= new Vector<>();

    public Profesor() {
        super();
        int ok=1;
        System.out.println("Adaugati cursurile predate de profesorul "+nume+" "+prenume);
        Scanner in =new Scanner(System.in);
        while (ok==1){AddCurs();
            System.out.println("1=CONTINUARE (0=STOP)");
        ok=Integer.parseInt(in.nextLine());}
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
    public void AddCurs(){
        this.cursuri_predate.add(new Curs(nume+" "+prenume));
        Calcul_salariu();
    }
    public void Avansare(String functie){
        setFunctie(functie);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Cursuri predate:");
        for(Curs curs:cursuri_predate) System.out.println(curs.denumire);
    }
}
