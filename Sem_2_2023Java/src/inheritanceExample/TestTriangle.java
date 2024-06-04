/*
Name : Min Thant
ID : 6612012
Sec : 544
 */

package inheritanceExample;
import java.util.Date;

public class TestTriangle {
    public static void main(String[] args) {
        // Object with the default constructor
        Triangle obj1 = new Triangle();

        System.out.println("Object 1 - Default Constructor:");
        System.out.println("Color: " + obj1.getColor());
        System.out.println("Date Created: " + obj1.getDateCreated());
        System.out.println("Filled: " + obj1.isFilled());
        System.out.println();

        // Object with all the sides, height, and triangle type
        Triangle obj2 = new Triangle(15, 20, 15, 10, "Isosceles");

        System.out.println("Object 2 - All Sides, Height, and Triangle Type:");
        System.out.println("Side A: " + obj2.getSideA());
        System.out.println("Side B: " + obj2.getSideB());
        System.out.println("Side C: " + obj2.getSideC());
        System.out.println("Height: " + obj2.getHeight());
        System.out.println("Triangle Type: " + obj2.getTriangleType());
        System.out.println("Area: " + obj2.getArea());
        System.out.println("Perimeter: " + obj2.getPerimeter());
        System.out.println("Validity: " + obj2.isValidTriangle());
        System.out.println();

        // Object with sides only
        Triangle obj3 = new Triangle(3, 4, 5);

        System.out.println("Object 3 - Sides Only:");
        System.out.println("Side A: " + obj3.getSideA());
        System.out.println("Side B: " + obj3.getSideB());
        System.out.println("Side C: " + obj3.getSideC());
        System.out.println("Height: " + obj3.getHeight());
        System.out.println("Triangle Type: " + obj3.getTriangleType());
        System.out.println("Area: " + obj3.getArea());
        System.out.println("Perimeter: " + obj3.getPerimeter());
        System.out.println("Validity: " + obj3.isValidTriangle());
        System.out.println();

        // Object with only base and height
        Triangle obj4 = new Triangle(20, 10);

        System.out.println("Object 4 - Base and Height Only:");
        System.out.println("Base: " + obj4.getBase());
        System.out.println("Height: " + obj4.getHeight());
        System.out.println("Area: " + obj4.getArea());
        System.out.println("Validity: " + obj4.isValidTriangle());
        System.out.println("Triangle Type: " + obj4.getTriangleType());
        System.out.println();

        // Object with color, filled, and sides
        Triangle obj5 = new Triangle("Blue", true, new Date(), 5, 12, 13, 8, "Right Angled");

        System.out.println("Object 5 - Color, Filled, and Sides:");
        System.out.println("Color: " + obj5.getColor());
        System.out.println("Date Created: " + obj5.getDateCreated());
        System.out.println("Filled: " + obj5.isFilled());
        System.out.println("Side A: " + obj5.getSideA());
        System.out.println("Side B: " + obj5.getSideB());
        System.out.println("Side C: " + obj5.getSideC());
        System.out.println("Height: " + obj5.getHeight());
        System.out.println("Triangle Type: " + obj5.getTriangleType());
        System.out.println("Area: " + obj5.getArea());
        System.out.println("Perimeter: " + obj5.getPerimeter());
        System.out.println("Validity: " + obj5.isValidTriangle());

        // Testing set methods
        System.out.println("\nTesting set methods:");

        obj1.setColor("Red");
        obj1.setFilled(true);
        obj1.setSideA(5);
        obj1.setSideB(6);
        obj1.setSideC(7);
        obj1.setHeight(8);

        System.out.println("Object 1 - After Setting Values:");
        System.out.println("Color: " + obj1.getColor());
        System.out.println("Filled: " + obj1.isFilled());
        System.out.println("Side A: " + obj1.getSideA());
        System.out.println("Side B: " + obj1.getSideB());
        System.out.println("Side C: " + obj1.getSideC());
        System.out.println("Height: " + obj1.getHeight());
        System.out.println("Triangle Type: " + obj1.getTriangleType());
        System.out.println("Validity: " + obj1.isValidTriangle());
    }
}
