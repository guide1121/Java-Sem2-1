public abstract class Superhero {
    private String name;
    private String age;
    private String job;

    public void setName(String name){
        this.name = name; 
    }

    public void setAge(String age){
        this.age = age;
    }

    public String toString(){
        return "Name: " + this.name +" Age: " + this.age;
    }
    public abstract void skill(String skill);
}
