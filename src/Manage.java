
import java.util.ArrayList;
import java.util.List;
import java.io.File;

/**
 *
 */
public class Manage{
    private File folder; // repertoires dans lequel sont stockés les données mensuels
    private List<Data> donnees; // Liste de données avec toutes les caractéristiques nécessaires
    private String[] files; // Tableau des noms de fichiers a analyser dans le repertoire souhaité

    /**
     * Constructeur de l'objet manipulant les données
     */
    public Manage(){
        donnees = new ArrayList<>();

        folder = new File("ledger"); //Emplacement du repertoire où sont stockés les fichiers .ledger

        // Tableau de fichiers présents dans le repertoire, si des fichiers sont présents dans le repertoire
        if(folder.list().length > 0){
          files = new String[folder.list().length];
          files = folder.list();
        }else{
            System.out.println("Error : No file in the folder");
        }

    }


    /**
     * Generer les objets données (correspondant a 1 mois), en utilisant les fichiers .ledger du repertoire selectionné
     * Les objets sont stockés dans une liste d'objet pour analyse plus tard
     */
    public void generateData(){
        for(int i = 0; i < files.length; i++){
            Data data = new Data(files[i]);
            donnees.add(data);
        }
    }

    /**
     *
     */
    public void writeCSV(){

    }
}
