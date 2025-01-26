//Name: Naphat Phoruang
//ID: 6787021
//Section: 1
public class WallPaperUnit {
    private String name;
    private double length;

    public WallPaperUnit(String name, double length){ //Constructor
        this.name = name;
        this.length = length;
    }
    public String getName(){
        return this.name;
    }
    public double getLength() {
        return length;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setLength(double length){
        this.length = length;
    }

    public static void main(String[] args) {
        WallPaperUnit wp = new WallPaperUnit("Guide", 12);
        System.out.println(wp.getName());
        System.out.println(wp.getLength());

        wp.setLength(25);
        wp.setName("Nice");

        System.out.println(wp.getName());
        System.out.println(wp.getLength());

        System.out.println(wp.getLength());

    }
}
