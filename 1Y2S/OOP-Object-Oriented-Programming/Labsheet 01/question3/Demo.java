package labsheet01.question3;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Even/Odd Number Checker");
        System.out.println("======================");
        
        // Test with different numbers
        int[] testNumbers = {10, 25, 42, 37, 100, 15};
        
        for (int num : testNumbers) {
            EvenOddNumber checker = new EvenOddNumber(num);
            boolean isEven = checker.findEvenOrOdd();
            String result = isEven ? "Even" : "Odd";
            System.out.println(num + " is " + result);
        }
    }
}
