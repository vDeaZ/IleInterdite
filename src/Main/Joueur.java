package Main;

public class Joueur {
    
    private String nom;
    private Aventurier aventurier;
    private Pion pion;
    //private ArrayList<Cartes.Carte_Tresor_Abs> main;
    private int nbPointAction ;

    public Joueur(String nom, Aventurier aventurier,Pion pion){
        this.nom = nom;
        this.aventurier = aventurier;
        this.pion = pion;
        aventurier.setJoueur_associé(this);
        aventurier.setPion(pion);
    }
}
