import java.util.Scanner;
public class TipCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Welcome to the tip calculator");
        System.out.println("How many people are in your group: ");
        int people = scan.nextInt();
        System.out.println("What's the tip percentage? (0-100): ");
        int tip = scan.nextInt();
        double percent = tip/100;
        double total = 0;
        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
        double number = scan.nextDouble();

        while (number != -1) {
            total += number;
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            number = scan.nextInt();
        }

        double totalTip = ((percent+ 1) * total;
        double totalBill =
        System.out.println("-------------------------------");
        System.out.println("Total bill before tip: $ " + total);
        System.out.println("Total percentage: " + percent + "%");
        System.out.println("Total tip: $ " + totalTip);
        System.out.println("Total bill with tip: $ " + total);
        System.out.println("-------------------------------");



    }


}
