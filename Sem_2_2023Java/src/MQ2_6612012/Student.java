/*
Name : Min Thant
ID : 6612012
Section : 544
 */

package MQ2_6612012;

public class Student {
    private int id;
    private String name;
    private double[] transcript;
    private int maxYear;

    public Student() {}

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, int maxYear) {
        this.id = id;
        this.name = name;
        this.transcript = new double[maxYear];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getTranscript() {
        return transcript;
    }

    public void setTranscript(double[] transcript) {
        this.transcript = transcript;
    }

    public void printTranscript(int id) {
        System.out.println("Student Id: " + id);
        System.out.println("Student name: " + name);
        int count = 1;
        for (double i : transcript) {
            System.out.println("Year " + count + " = " + i);
            count++;
        }
    }
}
