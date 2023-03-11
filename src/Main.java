import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------SHAPE-------------");
        Shape shape= new Shape();
        System.out.println(shape);
        shape= new Shape("red", false);
        System.out.println(shape);

        System.out.println("-----------TRIANGLE-----------");
        Triangle triangle= new Triangle();
        System.out.println(triangle);
        triangle= new Triangle("blue", true, 4,1,1);
        triangle.checkTypeTriangle();
        System.out.println(triangle);

    }
}