//Name: Naphat Phoruang
//ID: 6787021
//Section: 1

public class WaxDie extends Cube implements  Meltable,Comparable<Object3D>{

    public WaxDie(String _name, double _edge){ // ใส่ Field ไปแค่ 2 ตัว และกำหนด Material Type ใน Super ให้เป็น Wax
        super(_name, Material.Wax, _edge);
    }

    public int compareTo(Object3D o) {
        int vol_compare = Double.compare(this.getSurface(), o.getSurface()); //ตรวจสอบว่าเท่ากันมั้ย
        if(vol_compare == 0){ //เท่ากัน => 0 มากกว่า => 1 น้อยกว่า => -1
            return this.getName().compareTo(o.getName());
        }
        return vol_compare;
    }

    //แปลงจากรูปทรงหนึ่งไปอีกรูปทรงหนึ่ง โดยการคำนวณย้อนกลับจาก Volume ของ Object นี้ ให้ได้ตัวแปรในอีกรูปทรงหนึ่ง ตามสูตร
    public Object3D convertToOtherShape(){
        return new Sphere(this.getName(), this.getMaterial(), Math.cbrt((this.getVolume()*3)/(4*PI))); //แปลงเป็น Sphere
    }


}
