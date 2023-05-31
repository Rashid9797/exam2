package task.three;
public class Song {
    private String title;
    private String artist;
    private int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String newArtist) {
        this.artist = newArtist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int newDuration) {
        this.duration = newDuration;
    }

    public String getDurationInMinutesAndSeconds() {
        int minutes = duration / 60;
        int seconds = duration % 60;
        return String.format("%d:%02d", minutes, seconds);
    }
}

