//Name: Naphat Phoruang
//ID: 6787021
//Section: 1

public class ButterBall extends Sphere implements Meltable,Comparable<Object3D>{

    public ButterBall(String _name, double _radius){
        super(_name, Material.Butter, _radius);
    }

    public int compareTo(Object3D o) {
        int sa_compare = Double.compare(this.getSurface(), o.getSurface()); //ตรวจสอบว่าเท่ากันมั้ย
        if(sa_compare == 0){ //เท่ากัน => 0 มากกว่า => 1 น้อยกว่า => -1
            return this.getName().compareTo(o.getName());
        }
        return sa_compare;
    }

    public Object3D convertToOtherShape(){ //แปลงจากรูปทรงหนึ่งไปอีกรูปทรงหนึ่ง โดยการคำนวณย้อนกลับจาก Volume ของ Object นี้ ให้ได้ตัวแปรในอีกรูปทรงหนึ่ง ตามสูตร
        return new Cube(this.getName(), this.getMaterial(), Math.cbrt(this.getVolume())); //แปลงเป็น Sphere
    }
}
