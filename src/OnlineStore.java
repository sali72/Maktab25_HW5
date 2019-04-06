import java.util.Scanner;

public class OnlineStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("********** Ali's ONLINE STORE **********" +
                "\n" + "1) Customer" +
                "\n" + "2) Client" +
                "\n" + "3) Exit app " +
                "\n" + "Please choose an option: ");
        int x = input.nextInt();
        switch (x) {
            case 1:
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
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("please choose a valid option");
                }

            }
                break;
            case 2:

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
