//Name: Naphat Phoruang
//ID: 6787021
//Section: 1
import java.util.ArrayList;

public class ShoppingCart {
	
	private ArrayList<Product> products;
	private int customerAge;
    private boolean isMember; // [CHALLENGE] challenge instance
    private int time;// [CHALLENGE]  challenge instance
	
	
	public ShoppingCart(int customerAge, boolean isMember, int time) {
		this.products = new ArrayList<Product>();
		this.customerAge = customerAge;
        this.isMember = isMember; // [CHALLENGE] challenge constructor
        this.time = time; // [CHALLENGE] challenge constructor
		System.out.println("Shopping Cart is created ... ");
	}
	
	public void setCustomerAge(int age) {
		this.customerAge = age;
	}

	public void setMember(boolean isMember) { //  [CHALLENGE] 1st challenge setter method
		this.isMember = isMember;
	}
    public void setTime(int time) { //  [CHALLENGE] 1st challenge setter method
        this.time = time;
    }

    
	public int getCustomerAge() {
		return this.customerAge;
	}
	
	// TODO 5: add product
	public void addProduct(Product product) {
        if(product instanceof AgeRestrictedProduct){
            AgeRestrictedProduct restrictedProduct = (AgeRestrictedProduct) product; //ถ้าสินค้าเป็น AgeRestricedProduct ให้แปลงจาก Product (Superclass) เป็น Subclass
            if(restrictedProduct.isEligible(customerAge)){
                System.out.println(product.getName() + " added to cart");
                products.add(product);
            }
            else{
                System.out.println("You are not eligible to purchase " + product.getName());
            }
        }else if(product instanceof MemberProduct){ // [CHALLENGE]
            if(this.isMember){
                System.out.println(product.getName() + " added to cart");
                products.add(product);
            }else{
                System.out.println("You need to be a member to purchase " + product.getName());
            }
        }else if(product instanceof TimeProduct){ // [CHALLENGE]
            TimeProduct timeProduct = (TimeProduct) product;
            if(timeProduct.isInTime(time)){
                System.out.println(product.getName() + " added to cart");
                products.add(product);  
            }else{
                System.out.println("You need to buy " + product.getName() + " between " + timeProduct.getStartTime() + ".00 - " + timeProduct.getEndTime() + ".00");
            }
        }
        else{
            System.out.println(product.getName() + " added to cart");
            products.add(product);
        }

	}
	
	// TODO 6: calculate total price
	public double calculateTotalPrice() {
        double totalBalance = 0;
		for(Product a : products){
            totalBalance += a.getPrice();
        }
		return totalBalance;
	}

	public void clear() {
		products.clear();
		System.out.println("Shopping Cart is cleared ... ");
	}
	
	
	// DO NOT MODIFY MAIN
	public static void main(String[] args) {
		System.out.println("Creating Products");
		Product candy = new Product("Candy", 25.00);
		AgeRestrictedProduct wine = new AgeRestrictedProduct("Wine", 999, 21);
        MemberProduct car = new MemberProduct("Car", 888); // [CHALLENGE] Challenge Object added
		TimeProduct b285 = new TimeProduct("B285", 260, 17, 24); // [CHALLENGE] Challenge Object added
        System.out.println("------------------------------------------\n");
		
		ShoppingCart cart = new ShoppingCart(20, true, 20); //is Member field challenge added
		cart.addProduct(candy);
		cart.addProduct(wine);
		cart.addProduct(car); //[CHALLENGE]
		cart.addProduct(b285); //[CHALLENGE]
    

		
		System.out.println("\nChecking out (Age:" + cart.getCustomerAge()+ ")");
		System.out.println("Total price: " + cart.calculateTotalPrice());
		System.out.println("------------------------------------------\n");
		
		
		cart.clear();				// clear shopping cart (remove all products in the cart)
		cart.setCustomerAge(35);	// change the customer age to 35 years old
		cart.setMember(false); //[CHALLENGE] set new member status
        cart.setTime(14); //[CHALLENGE] set new buy time

        cart.addProduct(candy);
		cart.addProduct(wine);
		cart.addProduct(car); //[CHALLENGE] 
		cart.addProduct(b285); //[CHALLENGE]

		
		System.out.println("\nChecking out (Age:" + cart.getCustomerAge() + ")");
		System.out.println("Total price: " + cart.calculateTotalPrice());
		System.out.println("------------------------------------------\n");
		
	}

}