//Name: Naphat Phoruang
//ID: 6787021
//Section : 1
public class Triangle extends Shape{
    private double base;
    private double height;

    
    public Triangle(String color, double base, double height){
        super(color);
        this.base = base;
        this.height = height;
    }
    public Triangle(){
        this("", 0, 0);
    }

    public double getArea(double base, double height){
        this.base = base;
        this.height = height;
        return base*height*0.5;
    }

    @Override
    public double getArea() {
        return this.base*this.height*0.5;
     }
    public String toString() {
        return "Triangle[base=" + this.base + ",height=" + this.height +  "," +super.toString() +"]";
     }

}
