package classEx1;
import java.util.Scanner;

public class FindHollowSphereVolume {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Hollow Sphere Volume Calculator");

        System.out.print("Enter the outer radius: ");
        double outerRadius = reader.nextDouble();

        System.out.print("Enter the inner radius: ");
        double innerRadius = reader.nextDouble();

        double output = (4.0/3.0) * Math.PI * (Math.pow(outerRadius, 3) - Math.pow(innerRadius, 3));

        System.out.printf("The volume of this hollow sphere is %.2f", output);
        reader.close();
    }

}

//Min Thant
//6612012
