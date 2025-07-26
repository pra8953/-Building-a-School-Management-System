import java.util.List;

/**
 * Represents the school, managing students, teachers and finances.
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneySpent;
    private int totalMoneyEarned;

    /**
     * Constructor to initialize the school with teacher and student lists.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return this.teachers;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public int getTotalMoneyEarned() {
        return this.totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return this.totalMoneySpent;
    }

    /**
     * Updates the total money earned by the school.
     */
    public void updateTotalMoneyEarned(int money) {
        this.totalMoneyEarned += money;
    }

    /**
     * Updates the total money spent by the school (e.g., teacher salary).
     */
    public void updateTotalMoneySpent(int money) {
        this.totalMoneySpent += money;
    }
}
