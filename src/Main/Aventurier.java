package Main;

import Roles.Enum_Roles;

public abstract class Aventurier {

     private Joueur joueur;
     private Pion pion;
     private Tuile tuile_precedente;
     private Tuile tuile_actuelle;
           
     public Aventurier () {
         main = 
     }
     
    public void setPosition (Tuile ) {
         if ()
     }
     

    public Joueur getJoueur() {
        return joueur;
    }


    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public Pion getPion() {
        return pion;
    }

    public void setPion(Pion pion) {
        this.pion = pion;
    }

    public Tuile getTuile_precedente() {
        return tuile_precedente;
    }

    public void setTuile_precedente(Tuile tuile_precedente) {
        this.tuile_precedente = tuile_precedente;
    }

    public Tuile getTuile_actuelle() {
        return tuile_actuelle;
    }

    public void setTuile_actuelle(Tuile tuile_actuelle) {
        this.tuile_actuelle = tuile_actuelle;
    }
     
    public abstract Enum_Roles getRole();
    
    
}
