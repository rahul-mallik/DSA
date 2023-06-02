package Q09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Exam[] xam = new Exam[5];

        for (int i = 0; i < xam.length; i++) {
            xam[i] = new Exam();
            xam[i].input_Student();
            xam[i].input_Marks();
        }

        for (int i = 0; i < xam.length; i++) {
            xam[i].display_Student();
            xam[i].display_Result();
        }
    }
}
