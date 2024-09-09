public class DVD extends Product { 
    private int length;
    private String rating;
    private String studio;

    // Default constructor
    public DVD() {
        super(); 
        this.length = 0;
        this.rating = "";
        this.studio = "";
    }

    // Parameterized constructor
    public DVD(int length, String rating, String studio) {
        super(); 
        this.length = length;
        this.rating = rating;
        this.studio = studio;
    }

    // Getter for length
    public int getLength() {
        return this.length;
    }

    // Setter for length
    public void setLength(int length) {
        this.length = length;
    }

    // Getter for rating
    public String getRating() {
        return this.rating;
    }

    // Setter for rating
    public void setRating(String rating) {
        this.rating = rating;
    }

    // Getter for studio
    public String getStudio() {
        return this.studio;
    }

    // Setter for studio
    public void setStudio(String studio) {
        this.studio = studio;
    }
}