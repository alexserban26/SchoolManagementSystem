package Classes;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

public class Student extends Persoana implements Comparable<Student> {

    private static final AtomicInteger count = new AtomicInteger(0);
    private String grupa;
    private final int IDstudent;
    private Vector<CursStudent> situatie_scolara = new Vector<>(0);
    private float medie = 0;

    public Student() {
        super();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti grupa in care se afla studentul " + this.nume + " " + this.prenume + ":");
        this.grupa = in.nextLine();
        this.IDstudent = count.incrementAndGet();
        //AddCurs(curs);
        int ok = 1;
        System.out.println("Adaugati cursurile la care participa studentul " + nume + " " + prenume);
        while (ok == 1) {
            AddCurs();
            System.out.println("1=CONTINUARE (0=STOP)");
            ok = Integer.parseInt(in.nextLine());
        }
        CalcMedie();


    }

    public static AtomicInteger getCount() {
        return count;
    }

    public String getGrupa() {
        return grupa;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public int getIDstudent() {
        return IDstudent;
    }

    public Vector<CursStudent> getSituatie_scolara() {
        return situatie_scolara;
    }

    public void setSituatie_scolara(Vector<CursStudent> situatie_scolara) {
        this.situatie_scolara = situatie_scolara;
    }

    public float getMedie() {
        return medie;
    }

    public void setMedie(float medie) {
        this.medie = medie;
    }

    public void AddCurs(Curs curs) {
        CursStudent c = new CursStudent(curs);
        this.situatie_scolara.add(c);
    }

    public void AddCurs() {
        CursStudent c = new CursStudent();
        this.situatie_scolara.add(c);
    }

    public void CalcMedie() {
        int suma = 0;
        int suma_credite = 0;
        for (CursStudent cursStudent : situatie_scolara) {
            suma += cursStudent.getMedie() * cursStudent.credite;
            suma_credite += cursStudent.credite;
        }
        setMedie((float) suma / suma_credite);
    }

    public void SituatieScolara() {
        CalcMedie();
        print();
        int contor = 0;
        int total = 0;
        for (CursStudent curs : situatie_scolara) {
            if (curs.getMedie() < 5) {
                System.out.println(curs.denumire + " Picat " + curs.getMedie());
                contor++;
            } else System.out.println(curs.denumire + " Promovat " + curs.getMedie());
            total += curs.credite;
        }
        if (contor >= total / 2)
            System.out.println("Studentul " + nume + " " + prenume + " " + "a picat anul.(nr. credite: " + String.valueOf(total - contor) + ")");
        else System.out.println("Studentul " + nume + " " + prenume + " " + "a promovat anul.");

    }

    @Override
    public void print() {
        super.print();
        System.out.println("Grupa: " + this.grupa + " Nr. matricol:" + this.IDstudent);
    }


    @Override
    public int compareTo(Student o) {
        return (int) (o.medie-this.medie);
    }
}
