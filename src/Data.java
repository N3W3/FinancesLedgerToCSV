
public class Data{
    // Dates
    private String month;
    private Integer year;

    // Elements pris en compte dans le mois
    private double depenses;
    private double entrees;
    private double depensesMensuels;

    // Elements d'investissements du mois
    private double resteCompteCheck;
    private double epargne;
    private double bourse;
    private double crypto;


    /**
     * Constructeur données d'un mois
     *
     */
    public Data(String fileName){
        setData(fileName);
    }

    /**
     * Recupération des données et mise en place dans les attributs de l'objet
     *
     *
     */
    public void setData(String fileName){

    }

    /**
     * Getter Mois des données conernées
     */
    public String getMois(){
        return month;
    }

    /**
     * Getter Années des données concernées
     */
    public Integer getAnnees(){
        return year;
    }

    /**
     * Getter Dépenses au court du mois
     */
    public double getDepenses(){
        return depenses;
    }

    /**
     * Getter Entrées d'argent durant le mois
     */
    public double getEntrees(){
        return entrees;
    }

    /**
     * Getter des dépenses se répétants tous les mois
     */
    public double getDepensesMensuels(){
        return depensesMensuels;
    }

    /**
     * Getter reste a la fin du mois
     */
    public double getReste(){
        return resteCompteCheck;
    }

    /**
     * Getter placement Epargne du mois
     */
    public double getEpargne(){
        return epargne;
    }

    /**
     * Getter placement Bourse du mois
     */
    public double getBourse(){
        return bourse;
    }

    /**
     * Getter placement crypto du mois
     */
    public double getCrypto(){
        return crypto;
    }
}
