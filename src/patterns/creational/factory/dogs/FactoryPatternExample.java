package patterns.creational.factory.dogs;

public class FactoryPatternExample {

    public static void main(String[] args) {
        // create a small dog
        Dog dog = DogFactory.getDog(DogType.SMALL);
        dog.speak();

        // create a big dog
        dog = DogFactory.getDog(DogType.BIG);
        dog.speak();

        // create a working dog
        dog = DogFactory.getDog(DogType.WORKING);
        dog.speak();
    }
}
