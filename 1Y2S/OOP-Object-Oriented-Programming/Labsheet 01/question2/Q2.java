package labsheet01.question2;

public class Q2 {
    public static void main(String[] args) {
        // Declare arrays
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {5, 15, 25, 35, 45};
        int[] C = new int[A.length];
        
        // Add corresponding elements from arrays A and B
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }
        
        // Display results
        System.out.println("Array Addition Program");
        System.out.println("====================");
        System.out.print("Array A: ");
        printArray(A);
        System.out.print("Array B: ");
        printArray(B);
        System.out.print("Array C (A+B): ");
        printArray(C);
    }
    
    static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
