import java.util.Scanner;

public class Shoe extends Product {
    enum kind {SPORT, FORMAL, COMFORT}

    //properties
    private kind kind;
    private boolean is_for_men;
    private String brand;

    // specified method to set parameters
    @Override
    public void set() {
        super.set();
        Scanner input = new Scanner(System.in);
        int temp_int = 0;
        String temp;
        boolean temp_boolean;
        System.out.println("please choose kind of  Shoe " +
                "\n{1.SPORT, 2.FORMAL, 3.COMFORT}:");
        temp_int = input.nextInt();
        switch (temp_int){
            case 1:
                this.kind = kind.SPORT;
                break;
            case 2:
                this.kind = kind.FORMAL;
                break;
            case 3:
                this.kind = kind.COMFORT;
                break;
            default:
                System.out.println("wrong number");
        }
        System.out.println("please confirm is it for men or not? {type true or false} ");
        temp_boolean = input.nextBoolean();
        this.is_for_men = temp_boolean;
        System.out.println("please enter brand of product");
        temp = input.next();
        this.brand = temp;

    }

    // method to show items
    @Override
    public void show() {
        super.show();
        System.out.println(" Kind of this Shoe: " + this.kind +
                "\n brand of this Shoe: " + this.brand);
        if (is_for_men == true){
            System.out.println(" for men ");
        }
        else {
            System.out.println(" for women ");
        }
    }

}
