/**
 * 
 * Modify this class to inherit from Product class
 *
 */

 public class AgeRestrictedProduct extends Product {
	private int minimumAge;

	// TODO 1: constructor
	public AgeRestrictedProduct(String name, double price, int minAge) {
		super(name, price); 
		this.minimumAge = minAge;
		System.out.println("Age-restricted product is created ...");
	}
	
	// TODO 2: setter and getter
	public void setMinimumAge(int age) {
		this.minimumAge = age;
	}
	
	public int getMinimumAge() {
		return this.minimumAge;
	}
	
	// TODO 3: check eligibility 
	public boolean isEligible(int age) {
		if (age >= this.minimumAge){
			return true; 
		}else{
			return false;
		}
		
	}
	
	// TODO 4: toString method
	@Override
	public String toString() {
		return "Name: " + super.getName() + ", price: " + super.getPrice() + ", Minimum Age: " + this.minimumAge;
	}
}