package Main;

import Enum.Enum_Etat;
import Enum.Enum_Role;
import java.util.ArrayList;

public abstract class Aventurier {

    private String nom;
    private Pion pion;
    private Tuile position;
           
    Aventurier (String nom, Pion pion) {
        nom = nom;
        pion = pion;
    }
         
    public abstract Enum_Role getRole();
    public abstract ArrayList<Tuile> getTuilesDeplacables(Grille grille);

    public ArrayList<Tuile> getTuilesAssechables(Grille grille) {
        if (getRole() == Enum_Role.EXPLORATEUR) {
            
        } else {
            
        }
        
    }
    public void setPosition (Tuile tuile) {
        position = tuile;
    }
 
    public void AssecherTuile (Tuile tuile) {
        tuile.setEtat(Enum_Etat.ASSECHEE);
    }
    
    public Pion getPion() {
        return pion;
    }

    public void setPion(Pion pion) {
        this.pion = pion;

    }
    
    
    
}
