package patterns.creational.abstracfactory;

import patterns.creational.abstracfactory.colors.FactoryColor;
import patterns.creational.abstracfactory.shapes.FactoryShape;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "color":
                return  new FactoryColor();
            case "shape":
                return new FactoryShape();
        }
        return null;
    }
}
