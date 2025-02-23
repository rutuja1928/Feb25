public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1;

        System.out.print("Fibonacci sequence up to 21: " + num1 + " " + num2);

        while (num2 <= 21) {
            int nextNum = num1 + num2;
            if (nextNum > 21) break; 
            System.out.print(" " + nextNum);
            num1 = num2;
            num2 = nextNum;
        }
    }
}
