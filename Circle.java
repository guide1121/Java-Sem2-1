public class Circle extends Shape{
    private double radius;

    Circle(){

    }

    public Circle(String color, double radius){
        super(color);
        this.radius= radius;
    }

    public double getArea(double radius){
        this.radius= radius;
        return 3.14*(radius*radius);
    }


    @Override
    public double getArea() {
        return 3.14*(this.radius*this.radius);
     }
    public String toString() {
        return "Circle[radius=" + this.radius + ",Shape[color=" + super.getColor() + "]]";
     }

}
