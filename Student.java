/**
 * Represents a student in the school system.
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * Constructor to create a new student with fixed total fees (30,000).
     * @param id Unique ID of the student
     * @param name Name of the student
     * @param grade Grade/class of the student
     */
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Updates the amount of fees paid by the student.
     * @param fees Fees paid
     */
    public void updateFeesPaid(int fees) {
        this.feesPaid += fees;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getGrade() {
        return this.grade;
    }

    public int getFeesPaid() {
        return this.feesPaid;
    }

    public int getFeesTotal() {
        return this.feesTotal;
    }

    /**
     * Returns the remaining fees.
     * @return Remaining fees
     */
    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }
}
