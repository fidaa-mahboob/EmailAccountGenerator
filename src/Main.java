// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Email email = new Email("John", "Smith");
        email.setAlternateEmail("js@gmail.com");
        email.setMailboxCapacity("100");
        System.out.println(email.showInfo());
    }
}