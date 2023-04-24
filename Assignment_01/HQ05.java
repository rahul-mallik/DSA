package Assignment_01;

import java.util.Scanner;

public class HQ05 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        //setting values
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random()*2);
            }
        }
        
        //displaying values
        for (int[] outer: matrix) {
            for (int ele: outer) {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        //for getting which row has the highest no of ones
        int maxRow = 0, prev = 0,c=0;
        for (int[] outer:matrix) {
            int count = 0;
            for (int ele:outer) {
                if (ele == 1)
                    count++;
            }
            if (count>prev){
                prev = count;
                maxRow = c;
            }
            c++;
        }
        c=0;
        prev = 0;
        int maxColumn = 0;
        System.out.println("The Largest row index: "+maxRow);
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][i]==1)
                    count++;
            }
            if (count>prev){
                prev = count;
                maxColumn = c;
            }
            c++;
        }
        System.out.println("The largest column index: "+maxColumn);
    }
}
/*
    OUTPUT
    1 1 0 1 
    1 0 1 0 
    0 0 1 1 
    1 1 1 1 
    The Largest row index: 3
    The largest column index: 0
*/
