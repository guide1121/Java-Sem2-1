public class Triangle extends Shape{
    private double base;
    private double height;

    Triangle(){

    }

    public Triangle(String color, double base, double height){
        super(color);
        this.base = base;
        this.height = height;
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
        return "Triangle[base=" + this.base + ",height=" + this.height + ",Shape[color=" + super.getColor() + "]]";
     }

}
