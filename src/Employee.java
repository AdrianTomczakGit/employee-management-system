public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String department;

    public Employee(int id, String firstName, String lastName, String email, String department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }
}