package Roles;

public class Explorateur extends Aventurier {
    
    private Enum_Roles role;
    
    public Explorateur() {
        super();
        role = Enum_Roles.EXPLORATEUR;
    }
    
    @Override
    public Enum_Roles getRole() {
        return role;
    }
    
    @Override
    public ArrayList<Tuile> getTuilesDeplacement(Joueur joueur) {
        return super.getPosition().getGrille().getTuilesDeplacementExplorateur(joueur);
    }

    @Override
    public void Deplacement(Tuile tuile) {
        super.setPosition(tuile);
    }
    @Override
    public ArrayList<Tuile> getTuilesAssechables(Joueur joueur) {
        return super.getPosition().getGrille().getTuilesAssechablesExplorateur(joueur);
    }

    @Override
    public void AssecherTuile(Tuile tuile) {
        tuile.SetEtat(Etat.ASSECHEE);
    }


}
