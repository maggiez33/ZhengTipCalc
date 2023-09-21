import java.util.Scanner;
public class TipCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to the tip calculator");
        System.out.println("How many people are in your group: ");
        int people = scan.nextInt();
        scan.nextLine;
        System.out.println("What's the tip percentage? (0-100): ");
        double percent = scan.nextInt();


        while (number != 1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            number = scan.nextInt();
        }

        System.out.print("Done!");
    }


}
