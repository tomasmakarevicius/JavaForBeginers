package paskaita2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by tmaka on 4/5/2017.
 */
public class ThirdExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your kg");
        double kg = sc.nextDouble();
        System.out.println("Please insert you height cm");
        double m = sc.nextDouble();
        double kmi = kg/(m*m);
        System.out.println("KMI yra >> " + kmi);
        double result = kmi(kg,m);
        System.out.println("KMI 2 yra >>" + result);

    }
    public static double kmi (double kg, double m){
        return kg/(m*m);
    }
}

    //TODO 1 - susikurti metoda kuris grazintu double ir per parametrus paimtu 2 double kintamuosius
    // 2 - grazintu double
    // 3 - per parametrus paimtu 2 double kintamuosius
    //4 - apskaiciuoja kmi


