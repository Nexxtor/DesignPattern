package patterns.creational.abstracfactory.shapes;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println(" ---- ");
        System.out.println("|    |");
        System.out.println(" ---- ");
    }
}
