package Enum;

public enum Enum_Tuile {
    
    Le_Pont_Des_Abîmes("Le_Pont_Des_Abîmes",Enum_Etat.SECHE,Enum_Tresor.Null),
    La_Porte_De_Bronze("La_Porte_De_Bronze",Enum_Etat.INONDEE,Enum_Tresor.Null),
    La_Caverne_Des_Ombres("La_Caverne_Des_Ombres",Enum_Etat.SECHE,Enum_Tresor.Null),
    La_Porte_De_Fer("La_Porte_De_Fer",Enum_Etat.SECHE,Enum_Tresor.Null),
    La_Porte_dOr("La_Porte_dOr",Enum_Etat.SECHE,Enum_Tresor.Null),
    Les_Falaises_De_lOubli("Les_Falaises_De_lOubli",Enum_Etat.SECHE,Enum_Tresor.Null),
    Le_Palais_De_Corail("Le_Palais_De_Corail",Enum_Etat.SECHE,Enum_Tresor.Null),
    La_Porte_dArgent("La_Porte_dArgent",Enum_Etat.SECHE,Enum_Tresor.Null),
    Les_Dunes_De_lIllusion("Les_Dunes_De_lIllusion",Enum_Etat.COULEE,Enum_Tresor.Null),
    Heliport("Heliport",Enum_Etat.SECHE,Enum_Tresor.Null),
    La_Porte_De_Cuivre("La_Porte_De_Cuivre",Enum_Etat.SECHE,Enum_Tresor.Null),
    Le_Jardin_Des_Hurlements("Le_Jardin_Des_Hurlements",Enum_Etat.SECHE,Enum_Tresor.Null),
    La_Forêt_Pourpre("La_Forêt_Pourpre",Enum_Etat.SECHE,Enum_Tresor.Null),
    Le_Lagon_Perdu("Le_Lagon_Perdu",Enum_Etat.INONDEE,Enum_Tresor.Null),
    Le_Marais_Brumeux("Le_Marais_Brumeux",Enum_Etat.COULEE,Enum_Tresor.Null),
    Observatoire("Observatoire",Enum_Etat.INONDEE,Enum_Tresor.Null),
    Le_Rocher_Fantôme("Le_Rocher_Fantôme",Enum_Etat.COULEE,Enum_Tresor.Null),
    La_Caverne_Du_Brasier("La_Caverne_Du_Brasier",Enum_Etat.INONDEE,Enum_Tresor.Null),
    Le_Temple_Du_Soleil("Le_Temple_Du_Soleil",Enum_Etat.SECHE,Enum_Tresor.Null),
    Le_Temple_de_La_Lune("Le_Temple_de_La_Lune",Enum_Etat.COULEE,Enum_Tresor.Null),
    Le_Palais_Des_Marees("Le_Palais_Des_Marees",Enum_Etat.SECHE,Enum_Tresor.Null),
    Le_Val_Du_Crépuscule("Le_Val_Du_Crépuscule",Enum_Etat.SECHE,Enum_Tresor.Null),
    La_Tour_Du_Guet("La_Tour_Du_Guet",Enum_Etat.SECHE,Enum_Tresor.Null),
    Le_Jardin_Des_Murumues("Le_Jardin_Des_Murumues",Enum_Etat.INONDEE,Enum_Tresor.Null);

    private String nom_tuile;
    private Enum_Etat etat_tuile;
    private Enum_Tresor nom_tresor;
    
    private Enum_Tuile(String nom_tuile, Enum_Etat etat_tuile, Enum_Tresor nom_tresor){
        nom_tuile = nom_tuile;
        etat_tuile = etat_tuile;
        nom_tresor = nom_tresor;
    }
}
