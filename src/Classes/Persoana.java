package Classes;

import java.util.Scanner;

public class Persoana {

    protected static String cod;
    protected String prenume;
    protected String nume;
    protected String contact;

    public Persoana() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti numele:");
        this.nume = in.nextLine();
        System.out.println("Introduceti prenumele:");
        this.prenume = in.nextLine();
        System.out.println("Introduceti datele de contact:");
        this.contact = in.nextLine();
        System.out.println("Introduceti CNP:");
        this.cod = in.nextLine();

    }
    public void print(){
        System.out.println(this.nume+" "+this.prenume+" "+this.contact);
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void ChangeContact(String contact){setContact(contact);}
}
