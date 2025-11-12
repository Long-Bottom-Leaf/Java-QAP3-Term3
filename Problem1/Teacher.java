package Problem1;

public class Teacher extends Person {
    private String mySubject;
    private double mySalary;

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);       // call Person constructor
        mySubject = subject;
        mySalary = salary;
    }

    // Getter methods
    public String getSubject() {
        return mySubject;
    }

    public double getSalary() {
        return mySalary;
    }

    // Setter methods
    public void setSubject(String subject) {
        mySubject = subject;
    }

    public void setSalary(double salary) {
        mySalary = salary;
    }

    public String toString() {
        return super.toString() + ", subject: " + mySubject + ", salary: $" + mySalary;     // super calls Person's toString()
    }
}
