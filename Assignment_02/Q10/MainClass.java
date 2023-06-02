package Q10;

import Q10.sports.Sports;
import Q10.student.Test;

public class MainClass implements Sports {
    public static void main(String[] args) {
        Test test = new Test();
        test.input();
        test.output();

        int TotalMarks = test.marks1+ test.marks2;
        int totalScore = score1+score2;

        System.out.println("Grand Total Marks: "+TotalMarks);
        System.out.println("Grand Total Score: "+totalScore);
    }
}
