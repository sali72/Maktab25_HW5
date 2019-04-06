import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

abstract public class Product {
    //properties
    private String product_name;
    private float price;
    private String product_details;
    //generating a uniq id
    public static final AtomicInteger next_id = new AtomicInteger();
    public final Integer product_id = next_id.getAndIncrement();


    //setters & getters
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setProduct_details(String product_details) {
        this.product_details = product_details;
    }

    public String getProduct_details() {
        return product_details;
    }

    // specified method to set parameters
    public void set() {
        Scanner input = new Scanner(System.in);
        String temp;
        float temp_float;
        System.out.println("please enter name of product");
        temp = input.next();
        this.product_name = temp;
        System.out.println("please enter price of product");
        temp_float = input.nextFloat();
        this.price = temp_float;
        System.out.println("please enter additional details that you want to add to this product");
        temp = input.next();
        this.product_details = temp;
    }

    // method to show items
    public void show() {
        System.out.println("=================== product number " + this.next_id + " ===================\n" +
                "\n product name: " + this.product_name +
                "\n product price: " + this.price +
                "\n product details: " + this.product_details +
                "\n product ID: " + this.product_id);
    }
}
