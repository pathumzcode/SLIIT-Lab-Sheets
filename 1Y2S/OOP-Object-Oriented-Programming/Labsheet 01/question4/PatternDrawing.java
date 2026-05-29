package labsheet01.question4;

public class PatternDrawing {
    public static void main(String[] args) {
        System.out.println("Pattern Drawing Program");
        System.out.println("======================\n");
        
        System.out.println("Pattern 1: Rectangle (using while loop)");
        drawRectangleWhile(5, 8);
        
        System.out.println("\nPattern 2: Triangle (using for loop)");
        drawTriangleFor(5);
    }
    
    // Rectangle pattern using while loop
    static void drawRectangleWhile(int height, int width) {
        int row = 0;
        while (row < height) {
            int col = 0;
            while (col < width) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
    
    // Triangle pattern using for loop
    static void drawTriangleFor(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
