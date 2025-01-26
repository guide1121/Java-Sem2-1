public class CovidReporter {
    public static void main(String[] args) {
        CovidProfile profile_1 = new CovidProfile();
        //Task 5.1.2
        CovidProfile profile_2 = new CovidProfile("2021-01-29", "Thailand", 17023, 11396, 6000);

        //Task 5.1.1
        profile_1.setDate("2020-8-8");
        profile_1.setLocation("Thailand");
        profile_1.setAcc(0);
        profile_1.setCuredCase(1000);
        profile_1.setDeathCase(5000);

        //Task 5.2
        profile_1.printCovidInfo();
        System.out.println();
        profile_2.printCovidInfo();
        System.out.println();

        
        System.out.println("Is Served: "+ CovidProfile.isServe()); //Challenge 2
        
        System.out.println("Total Cases: " + CovidProfile.counter); //Challenge 1
    }
}
