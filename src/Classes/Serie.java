package Classes;

import java.util.ArrayList;
import java.util.Collections;


public class Serie {
    protected String numar_serie;
    protected ArrayList<Grupa> grupe ;
    private ArrayList<Student> studenti = new ArrayList<>();

    public Serie(String numar_serie, ArrayList<Grupa> grupe) {
        this.numar_serie = numar_serie;
        this.grupe = grupe;
        AddStudenti();
        RankThemAll();
    }

    public String getNumar_serie() {
        return numar_serie;
    }

    public void setNumar_serie(String numar_serie) {
        this.numar_serie = numar_serie;
    }

    public ArrayList<Grupa> getGrupe() {
        return grupe;
    }

    public void setGrupe(ArrayList<Grupa> grupe) {
        this.grupe = grupe;
    }
    public void AddStudenti(){
        for (Grupa g:grupe)
            studenti.addAll(g.getStudenti());

    }
    public void RankThemAll(){
        Collections.sort(studenti);
    }
}
