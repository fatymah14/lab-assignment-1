import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PharmacyShop p1 = new PharmacyShop(
            new Address("Main Street", "Karachi", "75500"),
            new Person("Ahmed Khan", "9876543210")
        );

        int choice;
        do {
            System.out.println("Enter 1 to search medicine by ID");
            System.out.println("Enter 2 to update medicine by ID");
            System.out.println("Enter 3 to search medicine by name");
            System.out.println("Enter 4 to print total revenue");
            System.out.println("Enter 5 to check expiry date");
            System.out.println("Enter 6 to remove medicine");
            System.out.println("Enter 7 to add medicine");
            System.out.println("Enter 8 to display all in-stock medicines");
            System.out.println("Enter 9 to sell medicine");
            System.out.println("Enter 0 to exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline after nextInt()

            switch (choice) {
                case 1:
                    System.out.print("Enter medicine ID to search: ");
                    String searchId = sc.nextLine();
                    p1.searchMedicineById(searchId);
                    break;

                case 2:
                    System.out.print("Enter medicine ID to update: ");
                    String updateId = sc.nextLine();
                    p1.updateMedicine(updateId, sc); // Pass scanner for user input
                    break;

                case 3:
                    System.out.print("Enter medicine name to search: ");
                    String searchName = sc.nextLine();
                    p1.searchMedicineByName(searchName);
                    break;

                case 4:
                    System.out.println("Total Revenue: " + p1.TotalRevenue());
                    break;

                case 5:
                    System.out.print("Enter current date (dd mm yyyy): ");
                    String[] dateInput = sc.nextLine().split(" ");
                    Date currentDate = new Date(dateInput[0], dateInput[1], dateInput[2]);
                    p1.findExpiredMedicine(currentDate);
                    break;

                case 6:
                    System.out.print("Enter medicine name to remove: ");
                    String removeName = sc.nextLine();
                    p1.removeMedicine(removeName);
                    break;

                case 7:
                    System.out.print("Enter medicine ID: ");
                    String medicineId = sc.nextLine();
                    System.out.print("Enter batch number: ");
                    String batchNumber = sc.nextLine();
                    System.out.print("Enter manufacturer: ");
                    String manufacturer = sc.nextLine();
                    System.out.print("Enter medicine name: ");
                    String medicineName = sc.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    sc.nextLine(); // Consume the newline
                    System.out.print("Enter expiry date (dd mm yyyy): ");
                    String[] expiryInput = sc.nextLine().split(" ");
                    Date expiryDate = new Date(expiryInput[0], expiryInput[1], expiryInput[2]);

                    Medicine newMedicine = new Medicine(medicineId, batchNumber, manufacturer, medicineName, quantity, price, expiryDate);
                    p1.addMedicine(newMedicine);
                    break;

                case 8:
                    p1.displayMedicine();
                    break;

                case 9:
                    System.out.print("Enter medicine name to sell: ");
                    String sellName = sc.nextLine();
                    p1.sellMedicine(sellName);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
