package paskaita3;

import java.util.Scanner;

/**
 * Created by tmaka on 4/6/2017.
 */
public class uzduotis1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Prasau irasykite skaiciu");
        int numb = sc.nextInt();

        if (numb % 2 == 0) {
            System.out.println("lyginis");
        }else{
            System.out.println("nelyginis");
        }
    }
}
