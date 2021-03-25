package Classes;

public class Angajat extends Persoana{

    protected String functie;
    private int salariu;

    public Angajat(String functie, int salariu) {
        this.functie = functie;
        this.salariu = salariu;
    }

    public Angajat() {

    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }
}
