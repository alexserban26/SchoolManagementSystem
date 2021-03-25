package Classes;

import java.util.Scanner;

public class Curs {

    protected String denumire;
    protected String profesor;
    protected String serie;
    protected int credite=1;

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
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
        System.out.println("Introduceti numele profesorului care va preda cursul:");
        this.profesor=in.nextLine();
        System.out.println("Introduceti seria la care va preda cursul:");
        this.serie=in.nextLine();
        System.out.println("Introduceti numarul de credite ale cursului:");
        this.credite=Integer.parseInt(in.nextLine());
    }


    public void print(){
        System.out.println("Curs: "+this.denumire+" Numar credite: "+this.credite);
    }


}
