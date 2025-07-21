
/**
 * La classe {@code Data} correspond aux données financières sur un mois
 *
 * <p>
 * Chaque donnée est composée de différents attributs tels que le mois {@code String} et l'année {@code Integer} pour situer le fichier dans le temps.
 * Ainsi que l'extension de fichier {@code String}, permettant de verifier plus tard si le fichier selectionné est bien un fichier ledger.
 * De plus, les données prennent en compte les dépenses totales faites dans le mois {@code double}, les entrées d'argent durant le mois {@code double} et
 * les dépenses mensuels se répétants tous les mois {@code double}.
 *
 * La classe permet aussi de récolter les informations tels que le reste sur le compte check a la fin du mois {@code double}, la somme épargné durant le mois {@code double},
 * l'investissement en bourse effectué durant le mois {@code double} et l'investissement effectué en cryptoMonnaie {@code double}.
 * </p>
 */
public class Data{
    // Dates
    private String month;
    private Integer year;

    // File extension
    private String fileExtension;

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

        // Recuperer le mois et l'années concerné ainsi que l'extension de fichier
        // fileName = Month+Year
        String[] date = fileName.split("[_\\.]");
        if(date.length == 3){
          month = date[0];
          year = Integer.parseInt(date[1]);
          fileExtension = date[2];
        }
    }

    /**
     * Recupération des données et mise en place dans les attributs de l'objet
     *
     */
    public void setData(String fileName){
        String ledgerFileRoot = "ledger/" + fileName; // Chemin d'acces pour le fichier ledger
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

    /**
     * Getter extension de fichier
     */
    public String getFileExtension(){
        return fileExtension;
    }
}
