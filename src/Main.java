import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("bobik", 5);
        Dog d2 = new Dog("tuzik", 10);
        Dog d3 = new Dog("polkan", 15);

        SampleArrayList<Dog> dogs = new SampleArrayList<>();

        dogs.add(d1);
        dogs.add(d2);
        dogs.add(d3);

        Iterator<Dog> dogIterator = dogs.iterator();

        while (dogIterator.hasNext()){
            System.out.println(dogIterator.next().toString());
        }

        System.out.println();

        System.out.println(dogs.get(1).toString());
        System.out.println();

        dogs.delete(2);

        for (Dog dog : dogs) {
            System.out.println(dog.toString());
        }

    }
}
