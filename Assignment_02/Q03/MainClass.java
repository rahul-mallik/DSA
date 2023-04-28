package Q03;

public class MainClass {
    public static void main(String[] args) {

        Student[] arr = new Student[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Details of Student "+(i+1)+": \n");
            arr[i] =  new Student();
            arr[i].getdata();
        }

        double highest = 0;
        int sNum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\nDetails of Student"+(i+1));
            arr[i].showdata();
            if(arr[i].DSA_Marks>highest){
                highest = arr[i].DSA_Marks;
                sNum = i;
            }
        }

        System.out.println("\nDetails of the student who has the highest marks:");
        arr[sNum].showdata();

    }
}
/*
    OUTPUT
    Enter Details of Student 1:

    Enter Student's Name: rahul
    Enter Student's Roll No.: 27
    Enter Student's DSA Marks: 29.5
    Enter Details of Student 2:

    Enter Student's Name: raju
    Enter Student's Roll No.: 32
    Enter Student's DSA Marks: 20
    Enter Details of Student 3:

    Enter Student's Name: kaju
    Enter Student's Roll No.: 31
    Enter Student's DSA Marks: 27
    Enter Details of Student 4:

    Enter Student's Name: rajesh
    Enter Student's Roll No.: 43
    Enter Student's DSA Marks: 26
    Enter Details of Student 5:

    Enter Student's Name: ramesh
    Enter Student's Roll No.: 23
    Enter Student's DSA Marks: 21

    Details of Student1
    Student's Name is rahul
    Student's Roll No. is 27
    Student's DSA Marks is 29.5

    Details of Student2 
    Student's Name is raju
    Student's Roll No. is 32
    Student's DSA Marks is 20.0

    Details of Student3
    Student's Name is kaju
    Student's Roll No. is 31
    Student's DSA Marks is 27.0

    Details of Student4
    Student's Name is rajesh
    Student's Roll No. is 43
    Student's DSA Marks is 26.0

    Details of Student5
    Student's Name is ramesh
    Student's Roll No. is 23
    Student's DSA Marks is 21.0
    Details of the student who has the highest marks:
    Student's Name is rahul
    Student's Roll No. is 27
    Student's DSA Marks is 29.5
 */
