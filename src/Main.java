import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("bobik", 5);
        Dog d1n1 = new Dog("bobik", 7);
        Dog d1n2 = new Dog("bobik", 8);
        Dog d2 = new Dog("tuzik", 10);
        Dog d3 = new Dog("polkan", 15);
        Dog d4 = new Dog("alkan", 25);
        Dog d5 = new Dog("balkan", 5);
        Dog d6 = new Dog("cutzik", -5);

        SampleArrayList<Dog> dogs = new SampleArrayList<>();

        dogs.add(d1);
        dogs.add(d1n1);
        dogs.add(d1n2);
        dogs.add(d2);
        dogs.add(d3);
        dogs.add(d4);
        dogs.add(d5);
        dogs.add(d6);

        Iterator<Dog> dogIterator = dogs.iterator();

        while (dogIterator.hasNext()) {
            System.out.println(dogIterator.next().toString());
        }

        System.out.println();

        System.out.println(dogs.get(1).toString());
        System.out.println();

        dogs.delete(2);

        for (Dog dog : dogs) {
            System.out.println(dog.toString());
        }
        System.out.println();

        dogs.sort();

        for (Dog dog : dogs) {
            System.out.println(dog.toString());
        }


    }
}
