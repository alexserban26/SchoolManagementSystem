package Classes;

import java.util.Scanner;
import java.util.Vector;

public class CursStudent extends Curs{

    protected Vector<Integer> note;
    private int medie;

    public int getMedie() {
        return medie;
    }

    public void setMedie(int medie) {
        this.medie = medie;
    }


    public CursStudent(Curs curs) {

        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti denumirea cursului: ");
        this.denumire=in.nextLine();
        System.out.println("Introduceti numele profesorului care va preda cursul:");
        this.profesor=in.nextLine();
        System.out.println("Introduceti seria la care va preda cursul:");
        this.serie=in.nextLine();
        System.out.println("Introduceti numarul de credite ale cursului:");
        this.credite=Integer.parseInt(in.nextLine());

        System.out.println("Introduceti notele(0=STOP):");
        int nota;
        nota = Integer.parseInt(in.nextLine());
        while (nota != 0) {
            if (nota > 10) System.out.println("Eroare! Nota introdusa este prea mare. Introduceti alta nota:");
            else this.note.add(nota);
            nota = Integer.parseInt(in.nextLine());
        }
        calcul_medie();
    }

    public void calcul_medie(){///60% examen final(ultima nota)
        int s=0;c
        int med=0;
        for(int i=0;i<note.size()-1;i++) s=s+note.get(i);
        med=(int)(((s/(note.size()-1))*0.4)+(note.lastElement()*0.6));
        setMedie(med);
    }


}
