import java.util.Scanner;

public class Hq01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Enter account number: ");
        int accNum = in.nextInt();
        System.out.print("Enter balance: ");
        double accBal = in.nextDouble();


        System.out.println("Details of account holder" +
                "\n Name:"+name+
                "\n Account NUmber: "+accNum+
                "\n Balance: "+accBal);

        System.out.print("Enter the amount to withdraw: ");
        double withdraw = in.nextDouble();
        accBal = accBal - withdraw;
        try{
            if(accBal<0)
                throw new InvalidBalanceException("Balance cannot be less than 0");
            else
                System.out.println("After withdraw, Balance = "+accBal);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class InvalidBalanceException extends Exception{
    public InvalidBalanceException(String msg) {
        super(msg);
    }
}

/*
    OUTPUT
    Enter your name: Rahul
    Enter account number: 1231
    Enter balance: 700
    Details of account holder
     Name:Rahul
     Account NUmber: 1231
     Balance: 700.0
    Enter the amount to withdraw: 900
    InvalidBalanceException: Balance cannot be less than 0

 */