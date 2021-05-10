package Classes;

import java.util.Scanner;
import java.util.Vector;

public class CursStudent extends Curs{

    protected Vector<Integer> note = new Vector<>();
    private int IDstudent;
    private int medie;

    public Vector<Integer> getNote() {
        return note;
    }

    public void setNote(Vector<Integer> note) {
        this.note = note;
    }

    public int getMedie() {
        return medie;
    }

    public void setMedie(int medie) {
        this.medie = medie;
    }

    public int getIDstudent() {
        return IDstudent;
    }

    public void setIDstudent(int IDstudent) {
        this.IDstudent = IDstudent;
    }
    public CursStudent(int x){};
    public CursStudent() {
        super(0);
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti notele pentru cursul "+this.denumire+" studentului "+this.IDstudent+" (0=STOP):");
        int nota;
        nota = Integer.parseInt(in.nextLine());
        while (nota != 0) {
            if (nota > 10) System.out.println("Eroare! Nota introdusa este prea mare. Introduceti alta nota:");
            else this.note.add(nota);
            nota = Integer.parseInt(in.nextLine());
        }
        calcul_medie();
        System.out.println("Media: "+this.getMedie());
    }
    public CursStudent(Curs curs) {
        this.profesor= curs.getProfesor();
        this.denumire= curs.getDenumire();
        this.serie= curs.getSerie();
        this.credite=curs.getCredite();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti notele pentru cursul "+this.denumire+"(0=STOP):");
        int nota;
        nota = Integer.parseInt(in.nextLine());
        while (nota != 0) {
            if (nota > 10) System.out.println("Eroare! Nota introdusa este prea mare. Introduceti alta nota:");
            else this.note.add(nota);
            nota = Integer.parseInt(in.nextLine());
        }
        calcul_medie();
        System.out.println("Media: "+this.getMedie());
    }

    public void calcul_medie(){///60% examen final(ultima nota)
        int s=0;
        int med;
        for(int i=0;i<note.size()-1;i++) s=s+note.get(i);
        med=(int)(((s/(note.size()-1))*0.4)+(note.lastElement()*0.6));
        setMedie(med);
    }

    public void add_note(){
        Scanner in = new Scanner(System.in);
        int nota;
        nota = Integer.parseInt(in.nextLine());
        while (nota != 0) {
            if (nota > 10) System.out.println("Eroare! Nota introdusa este prea mare. Introduceti alta nota:");
            else this.note.add(nota);
            nota = Integer.parseInt(in.nextLine());
        }
        calcul_medie();
        System.out.println("Noua medie: "+this.getMedie());
    }


}
