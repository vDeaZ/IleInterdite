package Main;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Utils {
 
    public static enum EtatTuile {
        ASSECHEE("Asséchée"), 
        INONDEE("Inondée"),
        COULEE("Coulée");

        String libelle ;
        
        EtatTuile(String libelle) {
            this.libelle = libelle ;
        }

        @Override
        public String toString() {
            return this.libelle ;
        }
    }

    public static ArrayList<Aventurier> melangerAventuriers(ArrayList<Aventurier> arrayList) {
        if (Parameters.ALEAS) {
            Collections.shuffle(arrayList);
        }
        return arrayList ;
    }
    
    /**
     * Permet de poser une question à laquelle l'utilisateur répond par oui ou non
     * @param question texte à afficher
     * @return true si l'utilisateur répond oui, false sinon
     */
    public static Boolean poserQuestion(String question) {
        System.out.println("Divers.poserQuestion(" + question + ")");
        int reponse = JOptionPane.showConfirmDialog (null, question, "", JOptionPane.YES_NO_OPTION) ;
        System.out.println("\tréponse : " + (reponse == JOptionPane.YES_OPTION ? "Oui" : "Non"));
        return reponse == JOptionPane.YES_OPTION;
    }    
    
    /**
     * Permet d'afficher un message d'information avec un bouton OK
     * @param message Message à afficher 
     */
    public static void afficherInformation(String message) {
        JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.OK_OPTION);
    }
}
