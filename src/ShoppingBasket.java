import java.util.ArrayList;

public class ShoppingBasket {
    // properties
    private ArrayList<Product> products = new ArrayList<>();

    // methods
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    public ArrayList<Product> getProducts() {
        return products;
    }

    // add product to basket method
    public void addBasket(Product product){
      products.add(product);
    }
    // sum the price of basket method
    public void showPrice () {
        double sum = 0.0;
        for (int i = 0; i < products.size(); i++){
            sum += products.get(i).getPrice();
        }
    }
    // shows products in the basket
    public void showBasketProducts(){
        for (int i = 0; i < products.size(); i++){
            products.get(i).show(); // polymorphism !
        }
    }
}
