package Main;

import Enum.Enum_NomTuile;
import Enum.Enum_Etat;
import Enum.Enum_Tresor;

public class Tuile {
    
    private String nom;
    private Enum_Etat etat;
    private Enum_Tresor tresor;
    private int y;
    private int x;
    
    public Tuile () {
        
        
    }

    public Enum_Tuile getNom() {
        return nom;
    }

    public void setNom(Enum_Tuile nom) {
        this.nom = nom;
    }

    public Enum_Etat getEtat() {
        return etat;
    }

    public void setEtat(Enum_Etat etat) {
        this.etat = etat;
    }

    public Enum_Tresor getTresor() {
        return tresor;
    }

    public void setTresor(Enum_Tresor tresor) {
        this.tresor = tresor;
    }
    
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}
