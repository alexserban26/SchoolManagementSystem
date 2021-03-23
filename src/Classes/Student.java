package Classes;

import java.util.Scanner;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

public class Student extends Persoana{

    private static final AtomicInteger count = new AtomicInteger(0);
    private String grupa;
    private final int IDstudent;
    private Vector<CursStudent> situatie_scolara;
    private float medie=0;

    public Student(Curs curs) {
        super();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti grupa in care se afla studentul "+this.nume+" "+this.prenume+":");
        this.grupa = in.nextLine();
        this.IDstudent=count.incrementAndGet();
        AddCurs(curs);

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

    public void AddCurs(Curs curs){
        CursStudent c= new CursStudent(curs);
        this.situatie_scolara.add(c);
    }

    public void CalcMedie(){
        int suma=0;
        int suma_credite=0;
        for (CursStudent cursStudent : situatie_scolara) {
            suma += cursStudent.getMedie() * cursStudent.credite;
            suma_credite += cursStudent.credite;
        }
        setMedie((float)suma/suma_credite);
    }

    public void SituatieScolara(){

    }

    @Override
    public void print(){
        super.print();
        System.out.println("Grupa: "+this.grupa+" Nr. matricol:"+this.IDstudent);
    }
}
