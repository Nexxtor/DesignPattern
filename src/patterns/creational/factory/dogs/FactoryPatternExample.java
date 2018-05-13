package patterns.creational.factory.dogs;

public class FactoryPatternExample {

    public static void main(String[] args) {
        // create a small dog
        Dog dog = DogFactory.getDog("small");
        dog.speak();

        // create a big dog
        dog = DogFactory.getDog("big");
        dog.speak();

        // create a working dog
        dog = DogFactory.getDog("working");
        dog.speak();
    }
}
