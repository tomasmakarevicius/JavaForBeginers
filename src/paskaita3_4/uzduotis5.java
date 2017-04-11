package paskaita3_4;

import java.util.Scanner;

/**
 * Created by tmaka on 4/7/2017.
 */
public class uzduotis5 {
    //Parašyti programą, kuri paprašytų įvesti 5 skaičius. Baigus skaičių įvedimą, turi būti
    //atvaizduojama įvestų skaičių suma ir visi įvesti skaičiai.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] mas = new int[5];
        int sum = 0;

        System.out.println("Prasau iveskite penkis skaicius");

        for (int i = 0; i <5; i++){
            int sk = sc.nextInt();
            mas [i]= sk;
            sum = sum + sk;

        }
        System.out.println("ivestu skaiciu suma yra >>:" + sum);
        for ( int i = 0; i <5; i++){
            System.out.println("atvaizduojami ivesti skaiciai" + mas[i]);
        }

    }


}
