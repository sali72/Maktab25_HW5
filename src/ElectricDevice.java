import java.util.Scanner;

public class ElectricDevice extends Product {
    enum kind {TV, RADIO, SMARTPHONE, LAPTOP}

    //properties
    private kind kind;
    private String brand;

    //setters & getters
    public void setKind(ElectricDevice.kind kind) {
        this.kind = kind;
    }

    public ElectricDevice.kind getKind() {
        return kind;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    // specified method to set parameters
    @Override
    public void set() {
        super.set();
        Scanner input = new Scanner(System.in);
        String temp;
        int temp_int = 0;
        System.out.println("please choose kind of electric device " +
                "\n{1.TV, 2.RADIO, 3.SMARTPHONE, 4.LAPTOP}:");
        temp_int = input.nextInt();
        switch (temp_int){
            case 1:
                this.kind = kind.TV;
                break;
            case 2:
                this.kind = kind.RADIO;
                break;
            case 3:
                this.kind = kind.SMARTPHONE;
                break;
            case 4:
                this.kind = kind.LAPTOP;
                break;
                default:
                    System.out.println("wrong number");
        }
        System.out.println("please enter brand of product");
        temp = input.next();
        this.brand = temp;
    }
}
