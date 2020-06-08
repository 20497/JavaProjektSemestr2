package Files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SaveFile {

    public void savingFile(String result){
        try (PrintWriter out = new PrintWriter("lastOutput.txt")) {
            out.println(result);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}

// Prosta klasa do zapisu outputu jako String - metoda savingFile tworzy obiekt PrintWriter
// który tworzy plik tekstowy o nazwie lastOutput, gdzie zapisywany będzie nasz output z aplikacji
