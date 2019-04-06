import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineStore {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // properties
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Manager> managers = new ArrayList<>();
        Manager manager_1 = new Manager(); // managers can only be defined in the app
        manager_1.user_name = "ali";       // here we have one manager
        manager_1.setPassword("alipass");
        managers.add(manager_1);
        ShoppingBasket shoppingBasket = new ShoppingBasket();// our only shopping basket

        System.out.println("********** Ali's ONLINE STORE **********");
        int x;// number that customer enters
        // main code
        do { // do while starts
            System.out.println("\n" + "1) Customer" +
                    "\n" + "2) manager" +
                    "\n" + "3) Exit app " +
                    "\n" + "Please choose an option: ");
            x = input.nextInt();
            if (x == 1)// ******************* Customer *********************
            {
                System.out.println("1)Sign in" +
                        "\n2)Sign up" +
                        "\n3)Exit");
                x = input.nextInt();
                switch (x) {
                    case 1:
                        for (int i = 0; i < 3; i++) {
                            // gets user and pass
                            // you are allowed to enter it only 3 times
                            if (isCustomerSignedIn(customers) == true) {
                                System.out.println(" *** Welcome *** ");
                                do {
                                    System.out.println("1) add products" +
                                            "\n2) delete products" +
                                            "\n3) exit" +
                                            "\n Please choose an option: ");
                                    x = input.nextInt();
                                    if (x==1){
                                        showProducts(products);
                                        addToBasket(products,shoppingBasket);
                                    }
                                    else if (x == 2){
                                        shoppingBasket.showBasketProducts();
                                        deleteFromBasket(products,shoppingBasket);
                                    }
                                } while (x != 3);
                                x=0;
                                break;
                            } else
                                System.out.println("you have " + (3 - i - 1) + " more chances!");
                        }
                        break;
                    case 2:
                        Customer temp = new Customer();
                        customers.add(temp);
                        customerSignUp(temp);
                        break;
                    case 3:
                        x = 0;
                        continue;
                    default:
                        System.out.println("please choose a valid option");
                }

            } else if (x == 2)// **************** manager ********************
            {
                for (int i = 0; i < 3; i++) {
                    // manager is introduced in the app so there is no need to sign up
                    // gets user and pass
                    // you are allowed to enter it only 3 times
                    if (isManagerSignedIn(managers) == true) {
                        System.out.println(" *** *** Welcome *** ***");

                        do {
                            System.out.println("1) add products\n" +
                                    "2) delete products\n" +
                                    "3) show products\n" +
                                    "4) exit\n" +
                                    "please choose an option: ");
                            x = input.nextInt();
                            if (x == 1) {
                                manager_1.addPruduct(products);
                            } else if (x == 2) {
                                manager_1.deletePruduct(products);
                            }
                            else if (x == 3){
                                showProducts(products);
                            }
                        } while (x != 4);

                        break;
                    } else
                        System.out.println("you have " + (3 - i - 1) + " more chances!");
                }
                x = 0;
                continue;
            } else if (x == 3) { //exit app
                break;
            } else
                System.out.println("please choose a valid option");
        } while (x != 3);//end of do while
        //end of main code

    }
    // methods area
    // method that signs up
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

    }// end of customerSignUp

    // method that signs in Customer !!
    static boolean isCustomerSignedIn(@NotNull ArrayList<Customer> customers) {

        System.out.println("please enter your user name: ");
        String claimed_user_name = input.next();
        System.out.println("please enter your user password: ");
        String claimed_password = input.next();

        for (int i = 0; i < customers.size(); i++) {
            if (claimed_user_name.equals(customers.get(i).user_name)) {
                System.out.println("user name is true");
                if (claimed_password.equals(customers.get(i).getPassword())) {
                    System.out.println("password is true");
                    return true;
                }
            }
        }
        System.out.println("your user name or password was wrong");
        return false;
    }// end of isCustomerSigendIn

    // method that signs in Manager !!
    static boolean isManagerSignedIn(@NotNull ArrayList<Manager> managers) {

        System.out.println("please enter your user name: ");
        String claimed_user_name = input.next();
        System.out.println("please enter your user password: ");
        String claimed_password = input.next();

        for (int i = 0; i < managers.size(); i++) {
            if (claimed_user_name.equals(managers.get(i).user_name)) {
                System.out.println("user name is true");
                if (claimed_password.equals(managers.get(i).getPassword())) {
                    System.out.println("password is true");
                    System.out.println();
                    return true;
                }
            }
        }
        System.out.println("your user name or password was wrong");
        return false;
    }// end of inManagerSignedIn

    // It shows all of products
    static void showProducts(@NotNull ArrayList<Product> products){
        for (int i = 0; i < products.size(); i++){
            products.get(i).show(); // polymorphism !
        }
    }

    // method to add basket some product
    static void addToBasket(@NotNull ArrayList<Product> products, ShoppingBasket shoppingBasket ){
        int x;
        int x_count;
        System.out.println( "\n Which product do you want to add (set id)?: ");
        x = input.nextInt();
        System.out.println( "how many ? ");
        x_count = input.nextInt();
        if (x_count > 0 ) { // it checks if customer added a positive number or not
            for (int i = 0; i < products.size(); i++) {

                if (x == products.get(i).product_id) {
                    if (products.get(i).getProduct_count() > x_count) { // It checks if we have enough products or not
                        shoppingBasket.getProducts().add(products.get(i));// It adds product from store to shopping basket
                        // line below reduces amount of product_count in shop
                        products.get(i).setProduct_count(products.get(i).getProduct_count() - x_count);
                        // line below sets true number of product_count to last product added to basket
                        // which we added 2 lines above
                        shoppingBasket.getProducts().get(shoppingBasket.getProducts().size()-1).setProduct_count(x_count);
                    }
                    else if (products.get(i).getProduct_count() == x_count){
                        shoppingBasket.getProducts().add(products.get(i));
                        products.remove(i);
                    }
                    else {
                        System.out.println("sorry we only have " + products.get(i).getProduct_count()
                        + " of this product");
                    }
                }
                else {
                    System.out.println(" there is no product with that id");
                }
            }
        }
        else {
            System.out.println("invalid number");
        }
    }// end of method addToBasket

    // method that deletes products from basket
    static void deleteFromBasket(@NotNull ArrayList<Product> products, ShoppingBasket shoppingBasket){
        int x_count;
        int x;
        System.out.println( "\n Which product do you want to delete(set id)?: ");
        x = input.nextInt();
        System.out.println( " how many ? ");
        x_count = input.nextInt();
        if (x_count > 0 ) { // it checks if customer added a positive number or not
            // finds the product
            int size_of_basket = shoppingBasket.getProducts().size();
            for (int i = 0; i < size_of_basket; i++) {

                if (x == shoppingBasket.getProducts().get(i).product_id) {
                    // if we find the product that customer entered
                    // variable below shows how many of that product do we have
                    int count_of_the_product = shoppingBasket.getProducts().get(i).getProduct_count();

                    if (count_of_the_product > x_count) { // It checks if there is enough products or not
                        // below we check if we had that item in the shop or not
                        for (int j = 0; j < products.size(); j++) {
                            if (x == products.get(j).product_id){
                                products.get(j).setProduct_count( x_count + products.get(j).getProduct_count());
                            }
                        }
                        // if it goes out of for, it means that we didn't have that item so we add it
                        products.add(shoppingBasket.getProducts().get(i));
                        shoppingBasket.getProducts().get(i).setProduct_count(count_of_the_product - x_count);

                    }
                    else if (count_of_the_product == x_count){
                        // below we check if we had that item in the shop or not
                        for (int j = 0; j < products.size(); j++) {
                            if (x == products.get(j).product_id){
                                products.get(j).setProduct_count( x_count + products.get(j).getProduct_count());
                            }
                        }
                        // if it goes out of for, it means that we didn't have that item so we add it
                        products.add(shoppingBasket.getProducts().get(i));
                        shoppingBasket.getProducts().remove(i);
                    }
                    else {
                        System.out.println("sorry we only have " + products.get(i).getProduct_count()
                                + " of this product");
                    }
                }
                else {
                    System.out.println(" there is no product with that id");
                }
            }
        }
        else {
            System.out.println(" invalid number ");
        }
    }// end of deleteFromBasket method


}
