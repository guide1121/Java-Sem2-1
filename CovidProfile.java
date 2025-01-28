//Name: Naphat Phoruang
//ID: 6787021
//Section: 1
public class CovidProfile {
    // Task 1 สร้าง class CovidProfile (CovidProfile.java) ที่มีattributes ตามนี้:
    private String date;
    private String location;
    private int accumulatedCases;
    private int curedCases;
    private int deathCases;

    static int death_2; //Challenge 2

    //Challenge 1. 
    public static int counter;
    
    //Challenge 2
    public static boolean isServe(){
        if(death_2 > 10000){
            return true;
        }
        else{
            return false;
        }
    }

 //Task 2: สร้าง 2 Constructor methods
    public CovidProfile(){
        this.date = "none";
        this.location = "none";
        this.accumulatedCases = 0;
        this.curedCases = 0;
        this.deathCases = 0;
        counter+=1;
        
    }
    public CovidProfile(String _date, String loc, int noACC, int noCured, int noDeath){
        this.date = _date;
        this.location = loc;
        this.accumulatedCases = noACC;
        this.curedCases = noCured;
        this.deathCases = noDeath;
        counter+=1;
        death_2 += noDeath;
    }
    
//Task3: เขียน setter และ getter methods เพื่อเข้าถึงและเปลี่ยนค่า แต่ละ attribute
    public void setDate(String date){
        this.date = date;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setAcc(int acc){
        this.accumulatedCases = acc;
    }
    public void setCuredCase(int cured){
        this.curedCases = cured;
    }
    public void setDeathCase(int death){
        this.deathCases = death;
        death_2 += death;
    }

    public String getDate(){
        return this.date;
    }
    public String getLoaction(){
        return this.location;
    }
    public int getAccmulatedCase(){
        return this.accumulatedCases;
    }
    
    public int getCuredCase(){
        return this.curedCases;
    }

    public int getDeathCase(){
        return this.deathCases;
    }
//Task 4 เขียน method printCovidInfo() 

    public void printCovidInfo(){
        System.out.println(this.location + " at " + this.date);
        System.out.println("Accumulative Patient: " + this.accumulatedCases);
        System.out.println("Cured Patient: " + this.curedCases);
        System.out.println("Death Patient: " + this.deathCases);
    }
}
