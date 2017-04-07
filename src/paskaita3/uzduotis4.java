package paskaita3;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by tmaka on 4/7/2017.
 */
public class uzduotis4 {
    //Papildykite 1.3. programą kuri neleistu įvesti ne skaičius, jei vartotojas įveda ne skaičių
    //programa prašo pakartoti tol kol bus įvestas skaičius.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int sk = 0;

        do {
            try {
                System.out.println("Prasau iveskite skaiciu");
                sk = sc.nextInt();
                suma = suma + sk; //prie sumos pridedam naujai ivesta skaiciu
            } catch (InputMismatchException e){
                sc.nextLine(); //atlaisvina buferi - be sitos eilutes gaunasi amzinas ciklas
                System.out.println("prasau pakartokite ir iveskite skaiciu");
            }


        } while(sk!=0);
        System.out.println("ivestu skaiciu suma >> " + suma);
    }
}