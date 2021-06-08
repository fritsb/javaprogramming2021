package nl.streeksoft.novi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileHandler {
    private static String fileName = "teams.txt";

    public static void writeData(String data) {
        try {
            File dataFile = new File(fileName);
            if(dataFile.exists() && dataFile.isFile()) {
                FileWriter fw = new FileWriter(dataFile, true); // with this  FileWriter fw = new FileWriter(dataFile, false);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(data);
                bw.newLine();
                bw.close();
            }
            else {
                System.out.println("Ongeldig bestand");
            }
        }
        catch(Exception ex) {
            System.out.println("Exception opgetreden tijdens het wegschrijven: " + ex.getMessage());
        }
    }

}
