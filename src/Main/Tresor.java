package Main;

public class Tresor {

    private String nom;
    private boolean possede;
    
    public Tresor(String nom){
        setNom(nom);
        possede = false;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean getRecupere() {
        return possede;
    }

    public void setRecupere(boolean recupere) {
        this.possede = recupere;
    }
}
