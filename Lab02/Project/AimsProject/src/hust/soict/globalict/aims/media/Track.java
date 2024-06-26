package hust.soict.globalict.aims.media;

public class Track implements Playable {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
    
    public void play() {
        System.out.println("Playing track: " + getTitle());
        System.out.println("Track length: " + getLength());
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Track other = (Track) obj;
        return title.equals(other.title) && length == other.length;
    }
}
