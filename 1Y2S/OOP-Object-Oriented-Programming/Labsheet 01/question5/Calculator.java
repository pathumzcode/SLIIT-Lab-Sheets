package labsheet01.question5;

public class Calculator {
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public double multiply(double a, double b) {
        return a * b;
    }
    
    public double square(double a) {
        return a * a;
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Calculator Program");
        System.out.println("==================\n");
        
        // Solve two mathematical expressions
        
        // Expression 1: (5 + 3) * 2 + 4^2
        double expr1_part1 = calc.add(5, 3);           // 5 + 3 = 8
        double expr1_part2 = calc.multiply(expr1_part1, 2);  // 8 * 2 = 16
        double expr1_part3 = calc.square(4);            // 4^2 = 16
        double expr1_result = calc.add(expr1_part2, expr1_part3);  // 16 + 16 = 32
        
        System.out.println("Expression 1: (5 + 3) * 2 + 4^2");
        System.out.println("Step 1: 5 + 3 = " + expr1_part1);
        System.out.println("Step 2: " + expr1_part1 + " * 2 = " + expr1_part2);
        System.out.println("Step 3: 4^2 = " + expr1_part3);
        System.out.println("Result: " + expr1_part2 + " + " + expr1_part3 + " = " + expr1_result + "\n");
        
        // Expression 2: 3^2 + (10 - 2) * 2
        double expr2_part1 = calc.square(3);            // 3^2 = 9
        double expr2_part2 = calc.add(10, -2);          // 10 - 2 = 8
        double expr2_part3 = calc.multiply(expr2_part2, 2);   // 8 * 2 = 16
        double expr2_result = calc.add(expr2_part1, expr2_part3);  // 9 + 16 = 25
        
        System.out.println("Expression 2: 3^2 + (10 - 2) * 2");
        System.out.println("Step 1: 3^2 = " + expr2_part1);
        System.out.println("Step 2: 10 - 2 = " + expr2_part2);
        System.out.println("Step 3: " + expr2_part2 + " * 2 = " + expr2_part3);
        System.out.println("Result: " + expr2_part1 + " + " + expr2_part3 + " = " + expr2_result);
    }
}
