import java.util.Scanner;

class Naturalnum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

           System.out.println(" Enter a number: ");
           int num = sc.nextInt();

           int result = (num * ( num + 1 )) / 2;

           System.out.println(" Result:" + result); 

      }
}