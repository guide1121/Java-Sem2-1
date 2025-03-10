//Name: Naphat Phoruang
//ID: 6787021
//Section : 1
public class Circle extends Shape{
    private double radius;

    Circle(){
        this("", 0);
    }

    public Circle(String color, double radius){
        super(color);
        this.radius= radius;
    }

    public double getArea(double radius){
        this.radius= radius;
        return Math.PI*(radius*radius);
    }


    @Override
    public double getArea() {
        return Math.PI*(this.radius*this.radius);
     }
    public String toString() {
        return "Circle[radius=" + this.radius +  "," +super.toString() +"]";
     }

}
