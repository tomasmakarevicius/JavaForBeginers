package paskaita2;

import paskaita2.ConstructorExample.Constructorexample;

/**
 * Created by tmaka on 4/5/2017.
 */
public class SecondClassExample {

    public static void main(String[] args) {

        // kaip priskirti reiksme
        // int - nurodome tipa pvz (int, double, string, boolen ir t.t.)
        // x - Jusu lokalaus kintamojo vardas, nors ir petras!!! visada prasideda mazaja raide
        // 20 - sveikas skaicius, rasomas pagal nurodyta tipa!
        int x = 20;
        boolean isYouCanDrink = false;
        String name = "Petras or Sigis";//visada reiksme rasoma kabutese
        char a = 'a';
        //system.out.println naudojamas tik tada kai norime spausdinti i console. Ln nukelia i nauja eilute
        System.out.println("Petras");
        example2();
        SecondClassExample className = new SecondClassExample();
        SecondClassExample.example2();

        //konstruktoriaus iskvietimas
        Constructorexample co = new Constructorexample();
        Constructorexample col = new Constructorexample(12);


    }

    //metodas nieko negrazina
    public static void example2() {
        //cia metodo turinys kuris atliekamas kai yra iskvieviamas metodas!
    }

    public void example3() {
    }
}
