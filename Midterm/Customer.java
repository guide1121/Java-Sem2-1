package Midterm;

import java.util.ArrayList;
import java.util.List;
import MiniShop.*;

public class Customer {
        private String name;
        private String phone;
        private ArrayList<Order> orderHistory;

        public Customer(String name, String phone) {
                this.name = name;
                this.phone = phone;
        }

        public void addOrder(Order order) {
                this.orderHistory.add(order);
        }

        public List<Order> getOrderHistory() {
                return orderHistory;
        }

        public String getName() {
                return name;
        }

        public String getPhone() {
                return phone;
        }
}
