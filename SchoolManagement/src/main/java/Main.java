import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher sarah = new Teacher(1, "Sarah", 550);
        Teacher michael = new Teacher(2, "Michael", 650);
        Teacher sophia = new Teacher(3, "Sophia", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(sarah);
        teacherList.add(michael);
        teacherList.add(sophia);

        Student emma = new Student(1, "Emma", 5);
        Student william = new Student(2, "William", 8);
        Student olivia = new Student(3, "Olivia", 6);

        List<Student> studentList = new ArrayList<>();
        studentList.add(emma);
        studentList.add(olivia);
        studentList.add(william);

        School lhs = new School(teacherList, studentList);

        Teacher benjamin = new Teacher(6, "Benjamin", 750);
        lhs.addTeacher(benjamin);

        emma.payFees(4800);
        william.payFees(5200);
        System.out.println("LHS has earned $" + lhs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        sarah.receiveSalary(sarah.getSalary());
        System.out.println("LHS has spent for salary to " + sarah.getName() +
                " and now has $" + lhs.getTotalMoneyEarned());

        sophia.receiveSalary(sophia.getSalary());
        System.out.println("LHS has spent for salary to " + sophia.getName() +
                " and now has $" + lhs.getTotalMoneyEarned());

        System.out.println(william);
        michael.receiveSalary(michael.getSalary());
        System.out.println(michael);
    }
}
