import java.util.ArrayList;
import java.util.Scanner;

public class OnlineStore {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        System.out.println("********** Ali's ONLINE STORE **********" +
                "\n" + "1) Customer" +
                "\n" + "2) Client" +
                "\n" + "3) Exit app " +
                "\n" + "Please choose an option: ");
        int x = input.nextInt();
        switch (x) {
            case 1:// Customer
            {
                System.out.println("1)Sign in" +
                                 "\n2)Sign up" +
                                 "\n3)Exit");
                x = input.nextInt();
                switch (x){
                    case 1:
                        System.out.println();
                        break;
                    case 2:
                        Customer temp = new Customer();
                        customers.add(temp);

                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("please choose a valid option");
                }

            }
                break;
            case 2:// Client

                System.out.println("1)Sign in" +
                        "\n2)Sign up" +
                        "\n3)Exit");
                x = input.nextInt();
                switch (x){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("please choose a valid option");
                }

                break;
            case 3:
                break;
                default:
                    System.out.println("please choose a valid option");
        }

    }
    


}
