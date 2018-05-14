package patterns.creational.factory.dogs;

public class DogFactory {

    public static Dog getDog(DogType type) {
        switch (type) {
            case SMALL:
                return new Poodle();
            case BIG:
                return new Rottweiler();
            case WORKING:
                return new SiberianHusky();
        }
        return null;
    }
}
