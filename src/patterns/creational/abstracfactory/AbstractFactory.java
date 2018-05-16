package patterns.creational.abstracfactory;

import patterns.creational.abstracfactory.colors.Color;
import patterns.creational.abstracfactory.shapes.Shape;

public interface AbstractFactory {
    Shape getShape(String type);
    Color getColor(String type);
}
