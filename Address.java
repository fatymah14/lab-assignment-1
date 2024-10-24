public class Address {
    private String city;
    private String street;
    private String postalCode;
    public Address(String city, String street, String postalCode) {
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }
    public String getCity() {
        return city;
    }
    public String getStreet() {
        return street;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void display(){
        System.out.println( "City is "+city);
        System.out.println("Street #"+street);
        System.out.println("Postal code "+postalCode);
    }
    
    
}
