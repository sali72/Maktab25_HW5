import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineStore {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        System.out.println("********** Ali's ONLINE STORE **********");
        int x;
        do {
            System.out.println("\n" + "1) Customer" +
                    "\n" + "2) Client" +
                    "\n" + "3) Exit app " +
                    "\n" + "Please choose an option: ");
            x = input.nextInt();
            if (x == 1)// Customer
            {
                System.out.println("1)Sign in" +
                        "\n2)Sign up" +
                        "\n3)Exit");
                x = input.nextInt();
                switch (x) {
                    case 1:
                        System.out.println();
                        break;
                    case 2:
                        Customer temp = new Customer();
                        customers.add(temp);
                        customerSignUp(temp);
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("please choose a valid option");
                }

            } else if (x == 2)// Client
            {
                System.out.println("1)Sign in" +
                        "\n2)Sign up" +
                        "\n3)Exit");
                x = input.nextInt();
                switch (x) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("please choose a valid option");
                }
            } else if (x == 3) { //exit app
                break;
            } else
                System.out.println("please choose a valid option");
        } while (x != 3);

    }

    static void customerSignUp(@NotNull Customer customer) {
        System.out.println("please enter your specification to sign up:");
        System.out.println("please enter a user name:");
        customer.user_name = input.next();
        System.out.println("please enter a password:");
        customer.setPassword(input.next());
//        System.out.println("please enter your name:");
//        customer.setName(input.next());
//        System.out.println("please enter your last_name:");
//        customer.setLast_name(input.next());
//        System.out.println("please enter your phone number:");
//        customer.setPhone_number(input.nextInt());
//        System.out.println("please enter your email:");
//        customer.setEmail(input.next());
//        System.out.println("please enter your address:");
//        customer.setAddress(input.next());
//        System.out.println("please enter your postal code:");
//        customer.setPostal_code(input.nextInt());

    }



}
