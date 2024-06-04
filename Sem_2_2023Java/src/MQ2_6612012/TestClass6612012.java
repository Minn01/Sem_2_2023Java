package MQ2_6612012;

import java.util.Arrays;

public class TestClass6612012 {
    public static void main(String[] args) {
        Student objStudent = new Student(6611234, "Mr.Parent", 8);
        objStudent.printTranscript(6611234);
        System.out.println();


        UnderGraduate objUnderGrad = new UnderGraduate(6610001, "Miss Child", 5);
        objUnderGrad.updateGPA(1, 2.0);
        objUnderGrad.updateGPA(2, -1.5);
        objUnderGrad.updateGPA(3, 3.0);
        objUnderGrad.updateGPA(4, 4.0);
        objUnderGrad.printTranscript(6610001);
    }
}
