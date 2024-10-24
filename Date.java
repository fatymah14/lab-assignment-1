public class Date {
    
    private String day;
    private String month;
    private String year;
    public Date(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String getDay() {
        return day;
    }
    public String getMonth() {
        return month;
    }
    public String getYear() {
        return year;
    }
    public boolean isExpired(Date currentDate) {
        // Compare years as strings
        if (this.year.compareTo(currentDate.getYear()) < 0) return true;
    
        // Compare months as strings if years are equal
        if (this.year.equals(currentDate.getYear()) && this.month.compareTo(currentDate.getMonth()) < 0) return true;
    
        // Compare days as strings if years and months are equal
        if (this.year.equals(currentDate.getYear()) && this.month.equals(currentDate.getMonth()) && this.day.compareTo(currentDate.getDay()) < 0) return true;
    
        return false;
    }
    


    public void display(){
        System.out.println("Expirey Date   "+day+"-"+month+"-"+year);
    }


    
    
}
