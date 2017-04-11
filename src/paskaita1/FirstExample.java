package paskaita1;

import java.util.Scanner;

/**
 * Created by tmaka on 4/4/2017.
 */
public class FirstExample {

    public static void main (String[] args) {
        System.out.println("Hi Tomas");
        FirstExamplSupportClass example = new FirstExamplSupportClass();
        example.sayHi();

        int sum = example.sum(10, 20);
        //system.out.println(example.sum(10, 20)
        System.out.println(sum);

        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Please insert a number");
        int insertedNumb = scanner.nextInt();
        System.out.println("Inserted number>>" + insertedNumb);*/

        example.userName(scanner);

        example.actions(scanner);
    }



}
class FirstExamplSupportClass {

    public void userName(Scanner sc) {
        System.out.println("please insert your name :)");
        String name = sc.nextLine();
        System.out.println("Hi " + name);

        System.out.println("zodyje raidziu yra " + name.length());

    }

    public void actions(Scanner petras) {
        System.out.println("please insert first number");
        int first = petras.nextInt();
        System.out.println("please insert second number");
        int second = petras.nextInt();
        System.out.println("suma "+ sum(first,second));
        System.out.println("minusas "+ minus(first,second));
    }


    public void sayHi() {
        System.out.println("Labas");
    }

    public int sum(int firstNumb, int secondNumb) {
        return firstNumb + secondNumb;

    }

    public int minus(int firstNumb, int secondNumb) {
        return firstNumb - secondNumb;

    }
}