public class Employee {
    private int id;
    private static int counter = 1;
    private String firstName;
    private String lastName;
    private String middleName;
    private String department;
    private double salary;


    public Employee(String firstName, String lastName, String middleName, String department, double salary) {

        this.id = counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return this.id + " " + this.firstName + " " + this.lastName + " " + this.middleName + " " + this.department + " " + this.salary + " руб";
    }


    public String getFullName() {
        return this.firstName + " " + this.lastName + " " + this.middleName;
    }

}
