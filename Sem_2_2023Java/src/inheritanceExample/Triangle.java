/*
Name : Min Thant
ID : 6612012
Sec : 544
 */

package inheritanceExample;
import java.util.Date;

public class Triangle extends GeometricObject {
    private double sideA, sideB, sideC;
    private double height;
    private String triangleType;
    private Date dateCreated;

    public Triangle() {}

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        if (!isValidTriangle()) {
            throw new IllegalArgumentException("The sides do not form a triangle");
        }
    }

    public Triangle(double sideA, double sideB, double sideC, double height, String triangleType) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        if (!isValidTriangle()) {
            throw new IllegalArgumentException("The sides do not form a triangle");
        }
        this.height = height;
        this.triangleType = triangleType;
    }

    public Triangle(String color, boolean filled, Date dateCreated, double sideA, double sideB, double sideC, double height, String triangleType) {
        super.setColor(color);
        super.setFilled(filled);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        if (!isValidTriangle()) {
            throw new IllegalArgumentException("The sides do not form a triangle");
        }
        this.height = height;
        this.triangleType = triangleType;
        this.dateCreated = dateCreated;
    }

    public Triangle(double base, double height) {
        this.sideB = base;
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getBase() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double getHeight() {
        return height;
    }

    public String getTriangleType() {
        return triangleType;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setTriangleType(String triangleType) {
        this.triangleType = triangleType;
    }

    public double getSemiPerimeter() {
        return (sideA + sideB + sideC) / 2.0;
    }

    public double getArea() {
        if (sideA == 0.0 && sideC == 0.0) {
            // For base and height calculations
            return (height*sideB) / 2.0;
        } else {
            // Heron's Formula
            double s = getSemiPerimeter();
            return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        }

    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public boolean isValidTriangle() {
        return (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA);
    }
}
