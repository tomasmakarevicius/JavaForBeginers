package paskaita3_4;

/**
 * Created by tmaka on 4/6/2017.
 */
public class ConstructorExample {

    //tuscias konstruktorius; Visos klases pagal nutylejima turi tuscia konstruktoriu
    public ConstructorExample() {
        System.out.println("Tuscias konstruktorius");

    }
    //konstruktoriui perduodama reiksme vienas skaicius
    public  ConstructorExample (int id){
        System.out.println("2 konstruktorius su reiksme>>" + id);
    }
}


class MyMainApp {
    public static void main(String[] args) {
        ConstructorExample example = new ConstructorExample();
        ConstructorExample example1 = new ConstructorExample(123);
    }

}