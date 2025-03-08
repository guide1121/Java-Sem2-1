w
import java.util.HashMap;
import java.util.Map;
import MiniShop.*;
public class Cart {
        Map<Product, Integer> items = new HashMap<>();

        public void addProduct(Product product, int quantity) {
                this.items.put(product, quantity);
        }

        public double calculateTotal() {
                // ##################################################
                // TODO:Calculate total price of all products in cart

                // ##################################################

                int totalPrices = 0;
                for(Integer price : items.values()){ 
                        totalPrices += price;
                }       

                return totalPrices;

        }

        public void clearCart() {
                // ##################################################
                // TODO: clear all products in cart

                // ##################################################

                if(items.isEmpty()){
                        System.out.println("The Cart is already cleared");
                }else{
                        items.clear();
                        System.out.println("The cart cleared");
                }
        }
}
