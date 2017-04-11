package paskaita3_4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by tmaka on 4/6/2017.
 */
public class FirstExample {
    public static void main(String[] args) {

        int a = 30;
        int b = 40;

        if (a >= b) {
            System.out.println("taip tai tiesa");
        } else {
            System.out.println("Ne ne");
        }
        System.out.println("Value is >" + (a != b ? 120 : 100));

        if (a < b) {
            System.out.println("tiesa");
        } else if (a != b) {
            System.out.println("tiesa2");
        } else {
            System.out.println("ne");
        }

        int val = 2;
        switch (val) {
            case 1:
                System.out.println("radom 1");
                break;
            case 2:
                System.out.println("radom 2");
                break;
            default:
                System.out.println("Nieko nerado");
                break;

        }
        exceptionExample();
        masExample();
    }

    private static void masExample() {
        int[] mas = new int[3];
        //reiksmes idejimas i masyva
        mas[0] = 12;
        mas[1] = 1;
        mas[2] = 5;

        // reiksmes paemimas is masyvo
        System.out.println("1 reiksme yra " + mas[0]);
        printMas(mas);
    }

    private static void printMas(int[] mas){
        for (int i = 0; i < mas.length; i++){
            System.out.println("mas ["+i+"] yra >>" + mas [i]);


        }
    }

    private static void exceptionExample() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Irasykite tik skaiciu!!!");
        try {
            int numb = sc.nextInt();
            System.out.println("Jusu skaicius yra>> " + numb);
        } catch (InputMismatchException e) {
            System.out.println("Juk prasiau ivesti skaiciu!");
        }


    }
    private static boolean isStingEquals(String first, String second){
        return  first.equals(second);
    }


}

