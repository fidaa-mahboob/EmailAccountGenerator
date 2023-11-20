import java.util.Arrays;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String emailAddress;
    private String department;
    private int passwordlength = 8;
    private String mailboxCapacity;
    private String alternateEmail;

    private String companyDomainName = "company.com";


    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + firstName + " " + lastName);
        this.department = getDepartment();
        System.out.println("Deparment: " + this.department);
        this.password = generateRandomPassword(passwordlength);
        System.out.println(generateRandomPassword(8));
        this.emailAddress = firstName.toLowerCase() + '.' + lastName.toLowerCase() + "@" + department + "." + companyDomainName;
        System.out.println("Your email address: " + this.emailAddress);
    }

    public String getDepartment() {
        System.out.println("DEPARTMENT CODE: \n1 = Sales\n2 = Engineering\n3 = Accounting\n0 = None\nEnter Department Code:");
        Scanner value = new Scanner(System.in);
        int departmentValue = value.nextInt();
        return switch (departmentValue) {
            case 1 -> "sales";
            case 2 -> "engineering";
            case 3 -> "accounting";s
            default -> "None";
        };
    }

    private String generateRandomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@£.,";
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            int rand = (int) (Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);
    }



}
