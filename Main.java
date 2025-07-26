import java.util.*;

/**
 * Test class to run the School Management System.
 */
public class Main {
    public static void main(String[] args) {

        // Creating teachers
        Teacher t1 = new Teacher(1, "Ramesh", 5000);
        Teacher t2 = new Teacher(2, "Suresh", 6000);
        Teacher t3 = new Teacher(3, "Dinesh", 7000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(t1);
        teacherList.add(t2);
        teacherList.add(t3);

        // Creating students
        Student s1 = new Student(101, "Aman", 8);
        Student s2 = new Student(102, "Ravi", 9);
        Student s3 = new Student(103, "Riya", 10);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        // Creating school
        School school = new School(teacherList, studentList);

        // Students pay fees
        s1.updateFeesPaid(10000);
        school.updateTotalMoneyEarned(10000);

        s2.updateFeesPaid(15000);
        school.updateTotalMoneyEarned(15000);

        s3.updateFeesPaid(8000);
        school.updateTotalMoneyEarned(8000);

        // Teachers receive salary
        school.updateTotalMoneySpent(t1.getSalary());
        school.updateTotalMoneySpent(t2.getSalary());

        // Outputs
        System.out.println("Total Money Earned by School: ₹" + school.getTotalMoneyEarned());
        System.out.println("Total Money Spent by School (on salaries): ₹" + school.getTotalMoneySpent());
        System.out.println("Net Balance: ₹" + (school.getTotalMoneyEarned() - school.getTotalMoneySpent()));

        // Extra Info
        System.out.println("\nStudent Fees Info:");
        for (Student s : studentList) {
            System.out.println(s.getName() + " has paid ₹" + s.getFeesPaid() + ", remaining ₹" + s.getRemainingFees());
        }
    }
}
