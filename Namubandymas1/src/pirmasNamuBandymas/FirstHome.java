package pirmasNamuBandymas;

import java.util.Scanner;

/**
 * Created by tmaka on 4/5/2017.
 */
public class FirstHome {

    public static void main(String[] args) {
        System.out.println("Hi Tomas");
        FirstExampeSupportClass example = new FirstExampeSupportClass();
        example.sayHi();

        System.out.println(example.sum(10, 20));

        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Please insert a number");
        int InsertedNumb = scanner.nextInt();
        System.out.println("Inserted number >> "+ InsertedNumb);*/

        example.userName(scanner);

    }

}

class FirstExampeSupportClass{

    public void userName(Scanner sc){
        System.out.println("Please insert your name :)");
        String name = sc.nextLine();
        System.out.println("Hi " + name);

    }

    public void sayHi(){
        System.out.println("Labas");
    }

    public int sum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;

    }
}
