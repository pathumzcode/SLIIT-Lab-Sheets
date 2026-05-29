package labsheet01.question3;

public class EvenOddNumber {
    private int number;
    
    public EvenOddNumber(int number) {
        this.number = number;
    }
    
    public boolean findEvenOrOdd() {
        return number % 2 == 0;
    }
    
    public int getNumber() {
        return number;
    }
}
