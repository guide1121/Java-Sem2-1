package Midterm;

public class House {
	private String name;
	private double area;
	
	House(String name, double area){
		this.name = name;
		this.area = area;
		
	}
	
	public String getName() {
		return this.name;
	}
	public double getArea() {
		return this.area;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	public void setArea(String n) {
		this.area = n;
	}
}
