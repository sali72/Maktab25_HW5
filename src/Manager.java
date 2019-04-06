import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    // properties
    public String user_name;
    private String password;

    // methods
    //getters and setters
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    //other methods
    //method to add a product to store
    public void addPruduct(ArrayList<Product> products) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("what kind of product do you want to add ?\n"
                + "1) Electrical devices\n" +
                "2) Shoe\n" +
                "3) Readable\n");
        x = input.nextInt();
        switch (x) {
            case 1: {
                System.out.println("how many ?");
                x = input.nextInt();
                for (int i = 0; i < x; i++) {
                    Product temp = new ElectricDevice();
                    temp.set();
                    products.add(temp);
                    System.out.println("Electric Devices added");
                }
            }
            break;
            case 2: {
                System.out.println("how many ?");
                x = input.nextInt();
                for (int i = 0; i < x; i++) {
                    Product temp = new Shoe();
                    temp.set();
                    products.add(temp);
                    System.out.println("Shoes added");
                }
            }
            break;
            case 3: {
                System.out.println("how many ?");
                x = input.nextInt();
                for (int i = 0; i < x; i++) {
                    Product temp = new Readable();
                    temp.set();
                    products.add(temp);
                    System.out.println("Readable added");
                }
            }
            break;
        }

    }
    
}
