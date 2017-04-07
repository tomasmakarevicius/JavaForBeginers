package paskaita3;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by tmaka on 4/6/2017.
 */
public class ConstructorExample {

    //tuscias konstruktorius visos klases pagal nutylejima tuscia konstruktoriu
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