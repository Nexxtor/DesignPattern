package patterns.creational.factory.dogs;

/**
 *  A implementation of {@link Dog}
 */
public class Poodle implements Dog {
    @Override
    public void speak() {
        System.out.println("The poodle says \"arf\"");
    }
}
