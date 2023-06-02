import java.util.Scanner;

// ans of bit a
interface EmpInterface{
    void dislpayEmp();
    void giveBonus(double amount);
}

abstract class Employee{
    int empID;
    String Fname, Lname;
    double salary;

    Employee(int empID,String Fname,String Lname,double salary){
        this.salary = salary;
        this.empID = empID;
        this.Fname =Fname;
        this.Lname = Lname;
    }

}

//bit b
class Manager extends Employee implements EmpInterface{

    double bonus;
    Manager(int empID, String Fname, String Lname, double salary) {
        super(empID, Fname, Lname, salary);
    }

    @Override
    public void dislpayEmp() {

    }

    @Override
    public void giveBonus(double amount) {
        bonus = amount;
    }
}



//Main class
public class PrevYear {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter the Size of the array :");
        int size = in.nextInt();
        EmpInterface[] emp  = new Manager[size];// array of type reference Empinterface and object of type Manager

        for (int i = 0; i < emp.length; i++) {
            int empID = in.nextInt();
            String Fname = in.nextLine(), Lname= in.nextLine();
            double salary = in.nextDouble();
            emp[i] =  new Manager(empID,Fname,Lname,salary);
            // to check bouns is less than or equals to 0
            try{
                System.out.println("Enter the bonus: ");
                double bonous = in.nextDouble();
                if (bonous<=0)
                    throw new Exception("Bonus can not be negative");
                else
                    emp[i].giveBonus(bonous);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


        // bit c koi v 2 error aapne hisab se lena hai or uske hisab se exception handling krna hai

        String[] nameOfStudent = new String[2];
        try{
            nameOfStudent[0] = in.nextLine();
            nameOfStudent[1] = in.nextLine();
            nameOfStudent[2] = in.nextLine();
        }catch (Exception e){
            System.out.println(e);
        }

        try{
            for (int i = 0; i < nameOfStudent.length; i++) {
                for (int j = 0; j < nameOfStudent[i].length(); j++) {
                    if (nameOfStudent[i].charAt(j)>='0' && nameOfStudent[i].charAt(j)<='9')
                        throw new Exception("Name can not contain Numbers");

                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
