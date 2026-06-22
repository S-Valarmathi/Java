import java.util.Scanner;

public class CustomerData {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter customer id: ");
        int customerId = sc.nextInt();

        System.out.print("Enter phone number: ");
        long phoneNumber = sc.nextLong();

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = sc.nextDouble();

        System.out.print("Enter membership status (true/false): ");
        boolean membership = sc.nextBoolean();

        System.out.println("\nCustomer Details");
        System.out.println("Name: " + customerName);
        System.out.println("ID: " + customerId);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Membership: " + membership);

        sc.close();
    }
}