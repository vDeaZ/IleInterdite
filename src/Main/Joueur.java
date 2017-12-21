package Main;

public class Joueur {
    
    private String nom;
    private Aventurier aventurier;
    private Pion pion;
    //private ArrayList<Cartes.Carte_Tresor_Abs>;

    public Joueur(String nom, Aventurier aventurier, Pion pion){
        
        nom = nom;
        aventurier = aventurier;
        pion = pion;
        aventurier.setJoueur(this);
        aventurier.setPion(pion);
        
        
    }
}
