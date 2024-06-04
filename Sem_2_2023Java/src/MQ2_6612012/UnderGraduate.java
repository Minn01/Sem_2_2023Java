/*
Name : Min Thant
ID : 6612012
Section : 544
 */

package MQ2_6612012;

public class UnderGraduate extends Student {
    private double gpa;
    private int maxYear = 4;

    public UnderGraduate() {}

    public UnderGraduate(int id, String name) {
        setId(id);
        setName(name);
    }

    public UnderGraduate(int id, String name, int maxYear) {
        setId(id);
        setName(name);
        setMaxYear(maxYear);
        if (maxYear < 1 || maxYear > 4) {
            setTranscript(new double[4]);
        } else {
            setTranscript(new double[maxYear]);
        }
    }

    public double getGpa() {
        double sum = 0.0;
        for (double i : getTranscript()) {
            sum += i;
        }
        return sum / getTranscript().length;
    }

    public void setGPA(double gpa) {
        if (gpa < 0) {
            this.gpa = 0;
        } else if (gpa > 4) {
            this.gpa = 4;
        } else {
            this.gpa = gpa;
        }
    }

    public int getMaxYear() {
        return maxYear;
    }

    public void setMaxYear(int maxYear) {
        if (maxYear < 0 || maxYear > 4) {
            this.maxYear = 4;
        } else {
            this.maxYear = maxYear;
        }
    }

    @Override
    public void printTranscript(int id) {
        super.printTranscript(id);
        System.out.println("Total GPA : " + getGpa());
    }

    public void updateGPA(int year, double gpa) {
        if (gpa < 1 || gpa > 4) {
            getTranscript()[year-1] = 0.0;
        } else {
            getTranscript()[year - 1] = gpa;
        }
    }
}
