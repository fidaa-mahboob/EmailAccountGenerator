import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String mailboxCapacity;
    private String alternateEmail;


    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + firstName + " " + lastName);
        this.department = getDepartment();
        System.out.println("Deparment: " + this.department);
    }

    public String getDepartment() {
        System.out.println("DEPARTMENT CODE: \n1 = Sales\n2 = Engineering\n3 = Accounting\n0 = None\nEnter Department Code:");
        Scanner value = new Scanner(System.in);
        int departmentValue = value.nextInt();
        return switch (departmentValue) {
            case 1 -> "Sales";
            case 2 -> "Engineering";
            case 3 -> "Accounting";
            default -> "None";
        };
    }



}
