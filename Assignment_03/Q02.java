import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] color = new String[4];
        System.out.println("Enter four color");
        for (int i = 0; i < color.length; i++) {
            color[i] = in.nextLine();
        }
        try{
            int c = Integer.parseInt(color[0]);
        } catch (Exception e){
            System.out.println(e);
        }

        try{
            System.out.println("Enter one more color");
            color[5] = in.nextLine();
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("The colors entered are");
        for (int i = 0; i < color.length; i++) {
            System.out.println(color[i]);
        }
    }
}
