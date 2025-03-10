//Name: Naphat Phoruang
//ID: 6787021
//Section : 1
public class Rectangle extends Shape{
    private double length;
    private double width;

    Rectangle(){
        this("", 0, 0);
    }

    public Rectangle(String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getArea(double length, double width){
        this.length = length;
        this.width = width;
        return length*width;
    }


    @Override
    public double getArea() {
        return length*width;
     }
    public String toString() {
        return "Rectangle[length=" + this.length + ",width=" + this.width + "," +super.toString() +"]";
     }

}
