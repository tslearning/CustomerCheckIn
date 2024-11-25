import java.util.Scanner;

public class Customer {

    String[] customer = new String[5];
    Scanner input = new Scanner(System.in);
    String firstName="";
    String lastName="";

    public void  inputCustomerData() {
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter the first name of the customer %d: ", i + 1);
            while (true) {
                firstName = input.nextLine().trim();
                if  (!firstName.isEmpty()) break;
                System.out.println("Firstname cannot be empty. Please try again.:");
                System.out.printf("Enter the first name of the customer %d: ", i + 1);
            }
            System.out.printf("Enter the last name of the customer %d: ", i + 1);

            while (true) {
                lastName = input.nextLine().trim();
                if  (!lastName.isEmpty()) break;
                System.out.println("Lastname cannot be empty. Please try again.:");
                System.out.printf("Enter the last name of the customer %d: ", i + 1);


            }
            customer[i] = firstName + " " + lastName;
        }
    }
    public void displayCustomerData() {
        System.out.println("Customer List:");
        for(String name:customer){
            System.out.println(name);
        }
    }
}
