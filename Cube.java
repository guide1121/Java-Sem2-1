//Name: Naphat Phoruang
//ID: 6787021
//Section: 1

public class Cube extends Object3D{

    private double edge;


    Cube(String _name, Material _matType, double _edge){
        super(_name, _matType);
        this.edge = _edge;
    }

    public double getEdge(){
        return this.edge;
    }

    public double getVolume(){
        return Math.pow(this.edge,3); //cube root
    }
	public double getSurface(){
        return 6*Math.pow(this.edge,2); //squre root
    }
}

