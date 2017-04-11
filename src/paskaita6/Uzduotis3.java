package paskaita6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by tmaka on 4/11/2017.
 */
//Sukurti objekto klasę, kuri saugotų informaciją apie Vartotoją (vardas, pavardė, amžius, miestas).
// Parašyti metodą, kuris iš duotų parametrų (vardas, pavardė, amžius, miestas) sukurtų objektą ir įdėtų jį kolekciją.
// Kolekcijos rezultatus atspausdinti ekrane.

//Naudojant sukurtą kolekciją, surikiuoti duomenis, naudojant Collections.sort ar sort metodą.
// Atspausdinti rezultatą ekrane.

public class Uzduotis3 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        Uzduotis3 uzduotis3 = new Uzduotis3();
        uzduotis3.createPerson(persons, "Petras", "Petraitis", 36, "Kaunas");
        uzduotis3.createPerson(persons, "Jonas", "Petraitis", 33, "Klaipeda");
        uzduotis3.createPerson(persons, "Petras", "Jonaitis", 30, "Vilnius");

        uzduotis3.spauzd(persons);
    }

    private void spauzd(List<Person> list) {
        for (Person p : list) {
            /*System.out.println(p.getVardas() + " " + p.getPavarde() + " " + p.getAmzius() + " " + p.getMiestas());*/   //uzkomentavom ir darom kitu budu
            System.out.println(p); //spausdina pagal toString metoda (@override)
        }
    }

    private void createPerson(List<Person> person, String vardas, String pavarde, int amzius, String miestas) {
        Person p = new Person(vardas, pavarde, amzius, miestas);
        /*p.setVardas(vardas);
        p.setPavarde(pavarde);
        p.setAmzius(amzius);
        p.setMiestas(miestas);*/
        person.add(p);
    }
}

class Person {
    private String vardas;
    private String pavarde;
    private int amzius;
    private String miestas;

    //Cia yra musu konstruktorius
    public Person(String vardas, String pav, int age, String town) {
        this.vardas = vardas; //naudosim klases lygio kintamaji
        this.pavarde = pav;
        this.amzius = age;
        this.miestas = town;

    }

    @Override
    public String toString() {
        return "Person{" +
                "vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", amzius=" + amzius +
                ", miestas='" + miestas + '\'' +
                '}';
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public int getAmzius() {
        return amzius;
    }

    public void setAmzius(int amzius) {
        this.amzius = amzius;
    }

    public String getMiestas() {
        return miestas;
    }

    public void setMiestas(String miestas) {
        this.miestas = miestas;
    }
}
