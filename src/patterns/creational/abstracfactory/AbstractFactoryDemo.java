package patterns.creational.abstracfactory;

import patterns.creational.abstracfactory.colors.Color;
import patterns.creational.abstracfactory.shapes.Shape;

public class AbstractFactoryDemo {
    public static void main(String[] args){
        AbstractFactory factory;

        factory =  FactoryProducer.getFactory("color");
        Color blue = factory.getColor("blue");
        blue.fill();


        factory = FactoryProducer.getFactory("shape");
        Shape shape = factory.getShape("square");
        shape.draw();
    }
}
