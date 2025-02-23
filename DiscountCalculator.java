import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter total purchase amount: Rs.");
        double totalPurchase = scanner.nextDouble();
        
        System.out.print("Do you have a membership card? (yes/no): ");
        boolean hasMembership = scanner.next().equalsIgnoreCase("yes");
        
        double discount = 0;
        
        if (totalPurchase >= 1000) {
            discount = 20;
        } else if (totalPurchase >= 500) {
            discount = 10;
        } else {
            discount = 5;
        }
        
        if (hasMembership) {
            discount += 5;
        }
        
        double discountAmount = (discount / 100) * totalPurchase;
        double finalAmount = totalPurchase - discountAmount;
        
        System.out.println("Discount Applied: " + discount + "%");
        System.out.println("Discount Amount: Rs." + discountAmount);
        System.out.println("Final Amount to Pay: Rs." + finalAmount);
        
        scanner.close();
    }
}
