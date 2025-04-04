package syamkrishna;
import java.util.Scanner;

class EmployeeT {
    int empid;
    String name;
    float salary;
    String address;

    EmployeeT() {}

    EmployeeT(int empid, String name, float salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends EmployeeT {
    String department, subject;

    Teacher(int empid, String name, float salary, String address, String department, String subject) {
        super(empid, name, salary, address);  
        this.department = department;
        this.subject = subject;
    }

    public void display() {
        System.out.println("Teacher ID       : " + empid);
        System.out.println("Teacher Name     : " + name);
        System.out.println("Teacher Salary   : " + salary);
        System.out.println("Teacher Address  : " + address);
        System.out.println("Teacher Department : " + department);
        System.out.println("Teacher Subject  : " + subject);
        System.out.println("--------------------------------------");
    }
}


public class TeacherArrObjects{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        Teacher[] teachers = new Teacher[n];

        System.out.println("\nEnter teacher details one by one:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1) + " :");

            System.out.print("Enter Teacher ID (Integer): ");
            int tid = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter Teacher Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Teacher Salary (Float): ");
            float salary = sc.nextFloat();
            sc.nextLine(); 
            System.out.print("Enter Teacher Address: ");
            String address = sc.nextLine();

            System.out.print("Enter Teacher Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Teacher Subject: ");
            String subject = sc.nextLine();

            teachers[i] = new Teacher(tid, name, salary, address, department, subject);
        }

        System.out.println("\nTeacher Details:");
        for (Teacher t : teachers) {
            t.display();
        }

        sc.close();
    }
}