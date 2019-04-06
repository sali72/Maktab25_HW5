import java.util.Scanner;

public class Readable extends Product {
    enum kind{BOOK, JOURNALS, NEWSPAPER}
    //properties
    private kind kind;
    private String writers;
    private String publisher;
    private int page_number;

    // specified method to set parameters
    @Override
    public void set(){
        super.set();
        Scanner input = new Scanner(System.in);
        String temp;
        int temp_int = 0;
        System.out.println("please choose kind of  Readable " +
                "\n{1.BOOK, 2.JOURNALS, 3.NEWSPAPER}:");
        temp_int = input.nextInt();
        switch (temp_int){
            case 1:
                this.kind = kind.BOOK;
                break;
            case 2:
                this.kind = kind.JOURNALS;
                break;
            case 3:
                this.kind = kind.NEWSPAPER;
                break;
            default:
                System.out.println("wrong number");
        }
        System.out.println("please enter writers of product");
        temp = input.next();
        this.writers = temp;
        System.out.println("please enter publisher of product");
        temp = input.next();
        this.publisher = temp;
        System.out.println("please enter how many pages does it have");
        temp_int = input.nextInt();
        this.page_number = temp_int;




    }

}
