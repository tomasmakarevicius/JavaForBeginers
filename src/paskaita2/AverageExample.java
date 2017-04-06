package paskaita2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by tmaka on 4/5/2017.
 */
public class AverageExample {

    public static void main(String[] args) {
        System.out.println("Vidutines kuro sanaudos: " + getAverage());
    }

    public static double getAverage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert km:");
        double km = sc.nextDouble();
        System.out.println("Please insert l");
        double l = sc.nextDouble();
        return average(km, l);
    }

    public static double average(double km, double l) {
        return (l * 100) / km;
    }
}
