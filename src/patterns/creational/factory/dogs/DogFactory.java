package patterns.creational.factory.dogs;

public class DogFactory {
    public static Dog getDog(String criteria) {
        switch (criteria) {
            case "small":
                return new Poodle();
            case "big":
                return new Rottweiler();
            case "working":
                return new SiberianHusky();
        }
        return null;
    }
}
