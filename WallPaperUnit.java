public class WallPaperUnit {
    private String name;
    private double length;

    public WallPaperUnit(String name, double length){
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
}
