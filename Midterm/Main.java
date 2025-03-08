package Midterm;



public class Main {
        public static void main(String[] args) {

                Store store = new Store();

                // สร้างสินค้า
                Product p1 = new Product("P001", "Water", 10.0, 100);
                Product p2 = new Product("P002", "Bread", 25.0, 50);
                store.addProduct(p1);
                store.addProduct(p2);

                // สร้างลูกค้า
                Customer customer = new Customer("Xanexer", "098-xxx-xxxx");

                // ลูกค้าเพิ่มสินค้าลงตะกร้า
                Cart cart = new Cart();
                cart.addProduct(p1, 2); // น้ำดื่ม 2 ขวด
                cart.addProduct(p2, 1); // ขนมปัง 1 ชิ้น

                // สร้างคำสั่งซื้อ
                Order order = new Order(customer, cart);
                store.processOrder(order);

                // ##################################################
                // TODO:สร้าง Test Case สำหรับการทดสอบ เพิ่มอีก 3 product 1 ลูกค้า 1 คำสั่งซื้อ

                // ##################################################
                Product p3 = new Product("P001", "Watermelon", 50.0, 20);
                Product p4 = new Product("P002", "Breadboard", 20.0, 10);
                Customer customer2 = new Customer("Guide", "091-xxx-xxxx");
                Cart cart2 = new Cart();
                cart2.addProduct(p3, 21); // น้ำดื่ม 2 ขวด
                cart2.addProduct(p4, 1); // ขนมปัง 1 ชิ้น

                Order order2 = new Order(customer2, cart2);
                store.processOrder(order2);

                // แสดงยอดขายรวม
                System.out.println("Total Revenue: " + store.getTotalRevenue());

        }
}
