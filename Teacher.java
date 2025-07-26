/**
 * Represents a teacher in the school system.
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;

    /**
     * Constructor to initialize a teacher.
     * @param id Unique ID of the teacher
     * @param name Name of the teacher
     * @param salary Monthly salary of the teacher
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    /**
     * Updates the teacher's salary.
     * @param salary New salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
