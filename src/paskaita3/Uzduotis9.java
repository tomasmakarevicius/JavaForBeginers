package paskaita3;

import java.util.Scanner;

/**
 * Created by tmaka on 4/7/2017.
 */
public class Uzduotis9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("prasau iveskite pirma skaiciu");
        double firstNumb = getCorrectNumber(sc);
        System.out.println("prasau iveskite antra skaiciu");
        double secondNumb = getCorrectNumber(sc);
        System.out.println("prasau iveskite komanda pvz (+; -; /; *)");

        String action = sc.next();
        calculator(firstNumb, secondNumb, action);
    }

    private static double getCorrectNumber(Scanner scanner) {
        while (true) {
            System.out.println("iveskita skaiciu:");
            try {
                double numb = scanner.nextDouble();
                return numb;
            } catch (Exception e) {
                System.out.println("KA TU DARAI AR MASTAI?");
                scanner.nextLine();
            }
        }

    }

    private static void calculator(double firstNumb, double secondNumb, String action) {
        switch (action) {
            case "+":
                sum(firstNumb, secondNumb);
                break;
            case "-":
                minus(firstNumb, secondNumb);
                break;
            case "*":
                multiply(firstNumb, secondNumb);
                break;
            case "/":
                division(firstNumb, secondNumb);
                break;
            default:
                System.out.println("KOMANDA NERASTA!!");
                break;
        }
    }

    private static void sum(double firstNumb, double secondNumb) {
        System.out.println("suma yra >> " + (firstNumb + secondNumb));
    }

    private static void minus(double firstNumb, double secondNumb) {
        System.out.println("skirtumas yra >> " + (firstNumb - secondNumb));
    }

    private static void multiply(double firstNumb, double secondNumb) {
        System.out.println("daugyba yra >> " + (firstNumb * secondNumb));
    }

    private static void division(double firstNumb, double secondNumb) {
        if (firstNumb != 0) {
            System.out.println("dalyba yra >> " + (firstNumb / secondNumb));
        } else {
            System.out.println("dalyba is nulio negalima!!!");

        }
    }
}