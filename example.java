import java.util.Scanner;
class Student{
    int id;
    String name;
    public void student_details(){
        System.out.println("Student id: "+id);
        System.out.println("Student's name is: "+name);
    }
}
public class example{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many student in the class: ");
        int studentcount=sc.nextInt();
        for(int i=1;i<=studentcount;i++){
            Student stu=new Student();
            System.out.print("Enter student id: ");
            stu.id = sc.nextInt();
            sc.nextLine(); // To consume the leftover newline
            System.out.print("Enter student name: ");
            stu.name = sc.nextLine();
            stu.student_details();
        }
        sc.close();
    }
}