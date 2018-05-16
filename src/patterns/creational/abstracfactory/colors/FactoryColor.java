package patterns.creational.abstracfactory.colors;

import patterns.creational.abstracfactory.AbstractFactory;
import patterns.creational.abstracfactory.shapes.Shape;

public class FactoryColor implements AbstractFactory {

    @Override
    public Shape getShape(String type) {
        return null;
    }

    @Override
    public Color getColor(String type) {
        switch (type) {
            case "blue":
                return new Blue();
            case "red":
                return new Red();
            case "green":
                return new Green();
        }
        return null;
    }
}
