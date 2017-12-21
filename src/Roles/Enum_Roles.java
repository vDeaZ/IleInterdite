package Roles;

public static enum Enum_Roles {
    PILOTE,
    EXPLORATEUR,
    INGENIEUR,
    PLONGEUR,
    MESSAGER,
    NAVIGATEUR;
    
    private String libelle;
    
    public String getRole () {
        
        switch (this) {
            case PILOTE :
                return ("Explorateur");
                break;
                
            case EXPLORATEUR :
                return ("Explorateur");
                break;
                
            case INGENIEUR :
                return ("Ingénieur");
                break;
                
            case PLONGEUR :
                return ("Explorateur");
                break;
                
            case NAVIGATEUR :
                return ("Explorateur");
                break;
        }
    }
    
}
