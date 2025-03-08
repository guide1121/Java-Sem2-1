
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {
        private List<Product> products = new ArrayList<>();
        private double totalRevenue = 0;

        public void addProduct(Product product) {
                products.add(product);
        }

        public void processOrder(Order order) {
                // ##################################################
                // todo: ประมวลผลคำสั่งซื้อ
                // 1. หายอดรวมของคำสั่งซื้อ
                // 2. ลดจำนวนสินค้าในคลัง
                // 3. บันทึกยอดขาย
                // ##################################################
                double totalprice = 0;
                System.out.println(order.getCustomer().getName() + " Tel."+ order.getCustomer().getPhone());
                for(Map.Entry<Product, Integer> entry  : order.getItems().entrySet()){
                        entry.getKey().reduceStock(entry.getValue());
                        if(entry.getKey().getStock() - entry.getValue() <= 0){
                                continue;
                        }else{
                                System.out.println(entry.getKey().getName() + " has been Added. "+ entry.getValue() + " Unit");
                                totalprice += entry.getValue()*entry.getKey().getPrice();
                        }

                }
                System.out.println("Total Price : " + totalprice);
                totalRevenue += totalprice;
        }

        public double getTotalRevenue() {
                return totalRevenue;
        }
}
