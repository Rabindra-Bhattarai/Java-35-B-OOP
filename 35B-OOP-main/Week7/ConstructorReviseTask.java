package Week7;

public class ConstructorReviseTask {
    public static void main(String[] args) {
        Song a = new Song("ABC", "10");
        Song b = new Song("CFK", "11");
        a.setId(1);
        a.setArtists("XYZ");
        a.album = "XX";
        a.description = "Lorem Ipsum";
        
        b.setId(2);
        b.setArtists("Yudip Das leyo");
        b.album = "XX";
        b.description = "Lorem Ipsum";
        
        System.out.println("Song 1");
        System.out.println("Title: " + a.getTitle());
        System.out.println("Duration: " + a.getDuration());
        System.out.println("Artists: " + a.getArtists());
        System.out.println("Album: " + a.album);
        System.out.println("Description: " + a.description);
        
        System.out.println("\nSong 2");
        System.out.println("Title: " + b.getTitle());
        System.out.println("Duration: " + b.getDuration());
        System.out.println("Artists: " + b.getArtists());
        System.out.println("Album: " + b.album);
        System.out.println("Description: " + b.description);
    }
}

class Song {
    private int id;
    private String title, duration, artists;
    public String album, description;
    
    Song(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setDuration(String duration) {
        this.duration = duration;
    }
    
    public void setArtists(String artists) {
        this.artists = artists;
    }
    
    public int getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getDuration() {
        return duration;
    }
    
    public String getArtists() {
        return artists;
    }
}
