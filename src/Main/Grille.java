package Main;

import java.util.ArrayList;

public class Grille {

    private Tuile tuiles[][];
    
    public Tuile[][] getTuiles() {
        return tuiles;
    }
    
    public void setTuiles(ArrayList<Tuile> tuiles) {
        this.tuiles = tuiles;
    }
    
    public void initialisationGrille() {
        int compteurParcoursTuile = 0;
        for (int y = 0 ; y != 6 ; y++) {
            for (int x = 0 ; x != 6 ; x++) {

                if (x>=0 && y==0) {
                    
                } else if {
                    
                }
                tuiles[x][y] = new Tuile();
                tuiles[x][y].setX(x);
                tuiles[x][y].setY(y);
            }
        }
    }
    
    

}
