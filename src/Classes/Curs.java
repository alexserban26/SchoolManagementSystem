package Classes;

import java.util.Scanner;

public class Curs {

    protected int IDcurs;



    protected String denumire;
    protected int profesor;
    protected String serie;
    protected int credite=1;
    public void setIDcurs(int IDcurs) {
        this.IDcurs = IDcurs;
    }

    public int getIDcurs() {
        return IDcurs;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getProfesor() {
        return profesor;
    }

    public void setProfesor(int profesor) {
        this.profesor = profesor;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getCredite() {
        return credite;
    }

    public void setCredite(int credite) {
        this.credite = credite;
    }

    public Curs(){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti denumirea cursului: ");
        this.denumire=in.nextLine();
        System.out.println("Introduceti ID-ul profesorului care va preda cursul:");
        this.profesor=in.nextInt();
        System.out.println("Introduceti seria la care va preda cursul:");
        this.serie=in.nextLine();
        System.out.println("Introduceti numarul de credite ale cursului:");
        this.credite=Integer.parseInt(in.nextLine());
    }
    public Curs(int x){}
//    public Curs(int prof){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Introduceti denumirea cursului: ");
//        this.denumire=in.nextLine();
//        System.out.println("Introduceti numele profesorului care va preda cursul:");
//        this.profesor=prof;
//        System.out.println("Introduceti seria la care va preda cursul:");
//        this.serie=in.nextLine();
//        System.out.println("Introduceti numarul de credite ale cursului:");
//        this.credite=Integer.parseInt(in.nextLine());
//    }


    public void print(){
        System.out.println("Curs: "+this.denumire+" Numar credite: "+this.credite);
    }


}
