public class Medicine {
    
    private String medicineId;
    private String batchNumber;
    private String manufacturer;
    private String medicineName;
    private int quantity;
    private double price;
    private Date expiryDate;
   
    public Medicine(String medicineId, String batchNumber, String manufacturer, String medicineName, int quantity,
            double price, Date expiryDate) {
        this.medicineId = medicineId;
        this.batchNumber = batchNumber;
        this.manufacturer = manufacturer;
        this.medicineName = medicineName;
        this.quantity = quantity;
        this.price = price;
        this.expiryDate = expiryDate;
    }
    public String getMedicineId() {
        return medicineId;
    }
    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId;
    }
    public String getBatchNumber() {
        return batchNumber;
    }
    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getMedicineName() {
        return medicineName;
    }
    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Date getExpireyDate() {
        return expiryDate;
    }
    public void setExpireyDate(Date expireyDate) {
        this.expiryDate = expireyDate;
    }
   public void display() {
        System.out.println("ID: " + medicineId + ", Name: " + medicineName + ", Price: " + price + ", Quantity: " + quantity);
        System.out.println("Manufacturer: " + manufacturer + ", Batch Number: " + batchNumber);
        expiryDate.display();
    }

    
}
