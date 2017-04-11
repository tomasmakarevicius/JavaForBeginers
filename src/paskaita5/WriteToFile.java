package paskaita5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by tmaka on 4/11/2017.
 */
public class WriteToFile {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Persons.txt"), true));
            bw.newLine();
            bw.write("Benas");
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
