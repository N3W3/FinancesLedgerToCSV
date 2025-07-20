
import java.util.ArrayList;
import java.util.List;
import java.io.File;


public class Manage{
    private File folder; // repertoires dans lequel sont stockés les données mensuels
    private List<Data> donnees; // Liste de données avec toutes les caractéristiques nécessaires
    private List<String> files; // Liste des noms de fichiers a analyser dans le repertoir souhaité

    public Manage(){
        donnees = new ArrayList<>();
        folder = new File("2025/ledger");

    }

    /**
     * Recuperer les fichiers a analyser présents dans le repertoire
     */
    public void listFichiers(){

    }

    public void GeneratingData(){

    }

    public void WriteData(){

    }
}
