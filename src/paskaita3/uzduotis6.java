package paskaita3;

import java.util.Scanner;

/**
 * Created by tmaka on 4/7/2017.
 */
public class uzduotis6 {
    //Parašyti programą kuri paprašytų vartotojo įvesti  5 žodžius.  Po to kai bus įvesti visi
    //žodžiai, jie turi būti atvaizduojami.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] masyvas = new String[5];

        System.out.println("Prasau iveskite 5 zodzius");
        for (int i = 0; i <5; i++){
            String zodis = sc.next();
            masyvas [i]= zodis;


        }



    }
}
