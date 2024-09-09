public class CD extends Product { 
    private String artist;
    private int numSongs;
    private String label;

   
    public CD() {
        super(); 
        this.artist = "";
        this.numSongs = 0;
        this.label = "";
    }

    // Getter for artist
    public String getArtist() {
        return this.artist;
    }

    // Setter for artist
    public void setArtist(String artist) {
        this.artist = artist;
    }

    // Getter for numSongs
    public int getNumSongs() {
        return this.numSongs;
    }

    // Setter for numSongs
    public void setNumSongs(int numSongs) {
        this.numSongs = numSongs;
    }

    // Getter for label
    public String getLabel() {
        return this.label;
    }

    // Setter for label
    public void setLabel(String label) {
        this.label = label;
    }
}