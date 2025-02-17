//Name: Naphat Phoruang
//ID: 6787021
//Section: 1
public class MemberProduct extends Product{
    private boolean isMember;
    MemberProduct(String name, double price){
        super(name,price);
    }
    public boolean isMember(boolean isMember) {
        this.isMember = isMember;
        return this.isMember;
    }
}
