package Midterm;

import java.util.Map;
import MiniShop.*;

public class Order {
        private Customer customer;
        private Map<Product, Integer> items;

        public Map<Product, Integer> getItems() {
                return items;
        }

        private double totalAmount;

        public Order(Customer customer, Cart cart) {
                this.customer = customer;
                this.items = cart.items;
                this.totalAmount = cart.calculateTotal();
        }

        public double getTotalAmount() {
                return totalAmount;
        }

        public Customer getCustomer() {
                return customer;
        }
}
