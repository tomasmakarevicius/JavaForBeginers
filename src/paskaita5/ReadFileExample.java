package paskaita5;

import java.io.*;

/**
 * Created by tmaka on 4/11/2017.
 */
public class ReadFileExample {
    public static void main(String[] args) {
        // galima rasyti viska vienoje eiluteje
        //BufferedReader bf = new BufferedReader(new FileReader(new File("Persons.txt")));
        try {
            //sukuriamas failas
            File file = new File("Persons.txt");
            //sukuriamas faile reader objektas
            FileReader fileReader = new FileReader(file);
            //sukurti BuferredReader
            BufferedReader bf = new BufferedReader(fileReader);
            String line = null;
            while ((line = bf.readLine()) != null){
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println("Failas nerastas");
        }catch (IOException e){
            System.out.println("Nenuskaite failo");
        }
    }
}
