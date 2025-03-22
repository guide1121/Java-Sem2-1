//Name: Naphat Phoruang
//ID: 6787021
//Section: 1

public class Sphere extends Object3D{

    private double radius;


    Sphere(String _name, Material _matType, double _radius){
        super(_name, _matType);
        this.radius = _radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getVolume(){
        return (4*PI*Math.pow(this.radius,3))/3; //cube power
    }
	public double getSurface(){
        return 4*PI*Math.pow(this.radius,2); //squre power
    }
}