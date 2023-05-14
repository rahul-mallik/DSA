
import java.util.Scanner;

class Address {
    String country;
}
class Date {
    int date,month,year;
    Date(int date,int month,int year) {
        this.date=date;
        this.month=month;
        this.year=year;
    }

    String display(){
        return (date+" "+month+" "+year);
    }

}
class Employee {
    String name,jobPosition,contactNumber;
    int empId;
    double salary;
    Date hireDate;
    Address address;
    Employee(String name,String jobPosition,String contactNumber,int empId,double salary,Date hireDate,Address address) {
        this.name=name;
        this.empId=empId;
        this.salary=salary;
        this.hireDate=hireDate;
        this.jobPosition=jobPosition;
        this.contactNumber=contactNumber;
        this.address=address;
    }
    Employee (String contactNumber){
        this.contactNumber = contactNumber;
    }

    void display(){
        System.out.println("Name of the employee: "+name);
        System.out.println("Employee ID: "+empId);
        System.out.println("Salary of the employee: "+salary);
        System.out.println("Date of hiring: "+hireDate.date+" "+hireDate.month+" "+hireDate.year);
        System.out.println("Employee's Job Post: "+jobPosition);
        System.out.println("Employee's contact number: "+contactNumber);
        System.out.println("Employee belongs to: "+address.country+"\n");
    }
}
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Employee worker[]=new Employee[500];

        for (int i = 0; i < worker.length; i++) {
            System.out.println("Enter Employee"+(i+1)+" Details: ");
            System.out.print("Enter name: ");
            String name = in.nextLine();
            System.out.print("Enter Employee ID: ");
            int empId = in.nextInt();
            System.out.print("Enter Salary: ");
            double Salary = in.nextDouble();
            System.out.print("Enter the date of hiring(DD MM YYYY): ");
            int date = in.nextInt();
            int month = in.nextInt();
            int year = in.nextInt();
            Date date1 = new Date(date,month,year);
            in.nextLine();
            System.out.print("Enter the Job Position: ");
            String jobPosition = in.nextLine();
            System.out.print("Enter the Contact Number(with country code): ");
            String number=in.nextLine();
            System.out.print("Enter the country employee belongs to: ");
            Address address = new Address();
            address.country = in.nextLine();

            worker[i] = new Employee(name,jobPosition,number,empId,Salary,date1,address);
        }

        arrangeEmployeeBySalary(worker);

        while(true) {
            System.out.println("Get information of employees' by " +
                    "\n1. By Job Position." +
                    "\n2. By Hiring date." +
                    "\n3. No. of foreign employees." +
                    "\n4. By salary in given range." +
                    "\n5. Exit.");
            System.out.print("Enter your choice(1-5): ");
            int choice = in.nextInt();
            if(choice ==5)
                break;

            switch (choice) {
                case 1:
                    System.out.print("Enter the Job position: ");
                    String pos = in.next();
                    getEmployeesByJobPosition(worker,pos);
                    break;
                case 2:
                    System.out.print("Enter the starting date(DD MM YYYY): ");
                    int date = in.nextInt();
                    int month = in.nextInt();
                    int year = in.nextInt();
                    Date starting = new Date(date,month,year);
                    System.out.print("Enter the ending date(DD MM YYYY): ");
                    date = in.nextInt();
                    month = in.nextInt();
                    year = in.nextInt();
                    Date ending = new Date(date,month,year);
                    getEmployeesByHireDate(worker,starting,ending);
                    break;
                case 3:
                    System.out.println("No. of foreign employees "+foreignEmployeeCount(worker));
                    break;
                case 4:
                    System.out.println("Enter the range of salary: ");
                    System.out.print("Min amount: ");
                    double minAmt = in.nextDouble();
                    System.out.print("Max amount: ");
                    double maxAmt = in.nextDouble();
                    getEmployeesBySalary(worker,minAmt,maxAmt);
                    break;
                default:
                    System.out.println("Invalid Input :(");
            }
        }

    }

    public static void arrangeEmployeeBySalary(Employee e[]) {
        for (int i = 0; i < e.length; i++) {
            for (int j = 1; j < e.length ; j++) {
                if (e[j].salary > e[j - 1].salary) {
                    Employee temp = e[j];
                    e[j] = e[j - 1];
                    e[j - 1] = temp;
                }
            }
        }
    }

    public static void getEmployeesByJobPosition(Employee e[], String jp){
        System.out.println("Details of Employee who are posted as "+jp);
        for (int i = 0; i < e.length; i++) {
            if(e[i].jobPosition.toLowerCase().equals(jp))
                e[i].display();
        }
    }

    public static void getEmployeesByHireDate(Employee e[], Date d1, Date d2){
        //here d1 is considered as starting date and d2 as the ending date
        boolean isBetween;
        System.out.println("Details of the employee's hired between "+ d1.display()+" and "+d2.display());
        for (int i = 0; i < e.length; i++) {
            isBetween = true;
            if(e[i].hireDate.year < d1.year || e[i].hireDate.year>d2.year)
                isBetween = false;
            else if (e[i].hireDate.year == d1.year && e[i].hireDate.month < d1.month)
                isBetween = false;
            else if (e[i].hireDate.year == d2.year && e[i].hireDate.month > d2.month)
                isBetween = false;
            else if (e[i].hireDate.year == d1.year && e[i].hireDate.month == d1.month && e[i].hireDate.date < d1.date)
                isBetween = false;
            else if (e[i].hireDate.year == d2.year && e[i].hireDate.month == d2.month && e[i].hireDate.date > d2.date)
                isBetween = false;

            if (isBetween)
                e[i].display();
        }
    }

    public static int foreignEmployeeCount(Employee e[]){
        int foreignEmp = 0;

        for (int i = 0; i < e.length; i++) {
            char[] num = e[i].contactNumber.toCharArray();
            if(num[1]!='9' || num[2]!='1' || num[0]!='+')
                foreignEmp++;
        }
        return foreignEmp;
    }

    public static void getEmployeesBySalary(Employee e[], double s1, double s2){
        System.out.println("Details of the Employee whose salary lies between "+s1+" and "+s2+" are: ");
        for (int i = 0; i < e.length; i++) {
            if (e[i].salary>=s1 && e[i].salary<=s2)
                e[i].display();
        }
    }
}
