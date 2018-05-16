package patterns.creational.abstracfactory.shapes;

import patterns.creational.abstracfactory.AbstractFactory;
import patterns.creational.abstracfactory.colors.Color;

public class FactoryShape implements AbstractFactory {
    @Override
    public Shape getShape(String type) {
        switch (type) {
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            case "circle":
                return new Circle();
        }
        return null;
    }

    @Override
    public Color getColor(String type) {
        return null;
    }
}
