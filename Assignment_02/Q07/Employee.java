package Q07;

public class Employee extends Person{
    int Eid;
    double salary;
    Employee(String name, int age,int Eid, double salary) {
        super(name, age);
        this.Eid = Eid;
        this.salary = salary;
    }

    void empDisplay(){
        System.out.println("Employee Details:\n Name: "+name+"\n Age: "+age+"\n Employee ID: "+Eid
                            +"\n Salary: "+salary);
    }
}
