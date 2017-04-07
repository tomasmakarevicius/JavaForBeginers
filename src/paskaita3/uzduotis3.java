package paskaita3;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

/**
 * Created by tmaka on 4/7/2017.
 */
public class uzduotis3 {
    //Parašyti programą, kuri paprašytų vesti skaičius tol, kol bus įvestas skaičius 0. Pabaigoje
    //turi būti atvaizduojama įvestų skaičių suma.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  suma = 0;
        int sk;

        do {
            System.out.println("Prasau iveskite skaiciu");
            sk = sc.nextInt();
            suma = suma + sk; // suma += sk (iskart sudeda)

        } while (sk!=0);
        System.out.println("ivestu skaiciu suma>> " + suma);


    }
}
