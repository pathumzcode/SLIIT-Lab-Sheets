package labsheet01.question1;

public class Q1 {
    public static void main(String[] args) {
        // Declare variables
        int miles = 26;
        int yards = 385;
        double kilometers;
        
        // Calculate marathon distance conversion
        // Formula: (miles + yards/1760) * 1.609
        kilometers = (miles + yards / 1760.0) * 1.609;
        
        // Display results
        System.out.println("Marathon Distance Conversion");
        System.out.println("============================");
        System.out.println("Distance in miles: " + miles);
        System.out.println("Distance in yards: " + yards);
        System.out.println("Total miles with yards: " + (miles + yards / 1760.0));
        System.out.println("Distance in kilometers: " + kilometers);
    }
}
