package Enum;

public enum Enum_Tuile {
    
    Le_Pont_Des_Abîmes("Le_Pont_Des_Abîmes",Enum_Etat.SECHE,Enum_Tresor.Null),
    La_Porte_De_Bronze("Le_Pont_Des_Abîmes",Enum_Etat.SECHE,Enum_Tresor.Null),
    La_Caverne_Des_Ombres,
    La_Porte_De_Fer,
    La_Porte_dOr,
    Les_Falaises_De_lOubli,
    Le_Palais_De_Corail,
    La_Porte_dArgent,
    Les_Dunes_De_lIllusion,
    Heliport,
    La_Porte_De_Cuivre,
    Le_Jardin_Des_Hurlements,
    La_Forêt_Pourpre,
    Le_Lagon_Perdu,
    Le_Marais_Brumeux,
    Observatoire,
    Le_Rocher_Fantôme,
    La_Caverne_Du_Brasier,
    Le_Temple_Du_Soleil,
    Le_Temple_de_La_Lune,
    Le_Palais_Des_Marees,
    Le_Val_Du_Crépuscule,
    La_Tour_Du_Guet,
    Le_Jardin_Des_Murumues;

    private String nom_tuile;
    private Enum_Etat etat_tuile;
    private Enum_Tresor nom_tresor;
    
    private Enum_Tuile(String nom_tuile, Enum_Etat etat_tuile, Enum_Tresor nom_tresor){
        nom_tuile = nom_tuile;
        etat_tuile = etat_tuile;
        nom_tresor = nom_tresor;
    }
}
