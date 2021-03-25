package Classes;

import java.util.ArrayList;
import java.util.Vector;

public class Serie {
    protected String numar_serie;
    protected ArrayList<Grupa> grupe=new ArrayList<Grupa>();

    public Serie(String numar_serie, ArrayList<Grupa> grupe) {
        this.numar_serie = numar_serie;
        this.grupe = grupe;
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
}
