import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\n Menu:");
            System.out.println("1. Apprenant");
            System.out.println("2. Classes");
            System.out.println("3. Return to Main Menu");
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Redirecting to Apprenant Menu...");
                        Apprenant.menuApprenanet();
                        break;
                    case 2:
                        System.out.println("Redirecting to Classe Menu...");
                        Classe.Menuclass();
                        break;
                    case 3:
                        System.out.println("Returning to Main Menu...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                }
            }
        } while (choice != 3) ;

        scanner.close();

    }
}