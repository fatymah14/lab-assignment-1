import java.util.*;
public class PharmacyShop {
    private Address address;
    private Medicine[] medicines;
    private Person owner;
    private int medicineCount;
    private double totalRevenue;

    {
        medicines = new Medicine[5];
        medicines[0] = new Medicine("M001", "#1", "Health&care", "Nice", 1, 90.0, new Date("3", "9", "1999"));
        medicines[1] = new Medicine("M002", "#2", "Foryou", "Panadol", 2, 80.0, new Date("21", "5", "2001"));
        medicines[2] = new Medicine("M003", "#3", "24/7", "Intazine", 3, 70.0, new Date("14", "6", "2004"));
        medicines[3] = new Medicine("M004", "#4", "PunjabPharmacy", "Dispirin", 4, 60.0, new Date("2", "7", "2008"));
        medicines[4] = new Medicine("M005", "#5", "CareByCare", "Aspirin", 5, 50.0, new Date("6", "3", "2005"));
        medicineCount = 5;
    }

    public PharmacyShop(Address address, Person owner) {
        this.address = address;
        this.owner = owner;
    }

    public void searchMedicineById(String id) {
        for (int i = 0; i < medicineCount; i++) {
            if (medicines[i].getMedicineId().equals(id)) {
                System.out.println("Medicine found:");
                medicines[i].display();
                return;
            }
        }
        System.out.println("Medicine not found.");
    }

    public void updateMedicine(String id, Scanner sc) {
        for (int i = 0; i < medicineCount; i++) {
            if (medicines[i].getMedicineId().equals(id)) {
                System.out.println("Enter new batch number: ");
                String newBatchNumber = sc.nextLine();
                System.out.println("Enter new manufacturer: ");
                String newManufacturer = sc.nextLine();
                System.out.println("Enter new medicine name: ");
                String newMedicineName = sc.nextLine();
                System.out.println("Enter new quantity: ");
                int newQuantity = sc.nextInt();
                System.out.println("Enter new price: ");
                double newPrice = sc.nextDouble();
                sc.nextLine(); // Consume the newline
                System.out.println("Enter new expiry date (dd mm yyyy): ");
                String day=sc.nextLine();
                String month=sc.nextLine();
                String year=sc.nextLine();
                medicines[i] = new Medicine(id, newBatchNumber, newManufacturer, newMedicineName, newQuantity, newPrice, new Date(day,month,year));
                System.out.println("Medicine updated successfully.");
                return;
            }
        }
        System.out.println("Cannot update medicine.");
    }

    public void searchMedicineByName(String name) {
        for (int i = 0; i < medicineCount; i++) {
            if (medicines[i].getMedicineName().equals(name)) {
                System.out.println("Medicine found:");
                medicines[i].display();
                return;
            }
        }
        System.out.println("Medicine not found.");
    }

    public void findExpiredMedicine(Date currentDate) {
        
        for (int i = 0; i < medicineCount; i++) {
            if (medicines[i] != null && medicines[i].getExpireyDate().equals(currentDate)) {
                System.out.println("Expired medicine found:");
                medicines[i].display();
                return;

            }
        }
 {
            System.out.println("No expired medicines.");
        }
    }

    public void removeMedicine(String name) {
        for (int i = 0; i < medicineCount; i++) {
            if (medicines[i].getMedicineName().equals(name)) {
                medicines[i] = medicines[medicineCount - 1]; // Move the last medicine to the current position
                medicines[medicineCount - 1] = null; // Nullify the last medicine
                --medicineCount;
                System.out.println("Medicine removed successfully.");
                return;
            }
        }
        System.out.println("Cannot remove medicine.");
    }

    public void sellMedicine(String name) {
        for (int i = 0; i < medicineCount; i++) {
            if (medicines[i].getMedicineName().equals(name)) {
                totalRevenue += medicines[i].getPrice(); // Update total revenue
                System.out.println("Medicine sold for " + medicines[i].getPrice() + " rupees.");
                removeMedicine(name); // Call removeMedicine to update stock
                return;
            }
        }
        System.out.println("Cannot sell medicine.");
    }

    public double TotalRevenue() {
        return totalRevenue;
    }

    public void addMedicine(Medicine m1) {
        if (medicineCount < medicines.length) {
            medicines[medicineCount++] = m1;
            System.out.println("Medicine added successfully.");
        } else {
            System.out.println("Cannot add medicine. Stock full.");
        }
    }

    public void displayMedicine() {
        for (int i = 0; i < medicineCount; i++) {
            if (medicines[i] != null) {
                medicines[i].display();
            }
        }
    }
}
