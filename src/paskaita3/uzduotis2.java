package paskaita3;

import java.util.Scanner;

/**
 * Created by tmaka on 4/6/2017.
 */
public class uzduotis2 {
    //Parašyti programą kuri paprašytų vartotojo įvesti žodį ir jį iš karto atvaizduotų, tada vėl
    //paprašytų įvesti kitą žodį, jį atvaizduotų, ir procesą kartotų tol, kol nebus įvestas žodis „pabaiga“.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Iveskite zodi");
            String name = sc.nextLine();
            System.out.println("zodis >> " + name);
            if (name.equals("pabaiga")) {
                break;


            }}}}