//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/**
 * Represents a single music track in a streaming playlist.
 *
 * Your Name:        ___________________________
 * Your Student ID:  ___________________________
 * Your Date:        ___________________________
 */
public class Track {
    private String title;
    private String artist;
    private int durationSeconds;
    private boolean isExplicit;

    /** Creates a track with all fields specified. */
    public Track(String title, String artist, int durationSeconds, boolean isExplicit) {
        this.title = title;
        this.artist = artist;
        if (durationSeconds < 0) {
            System.out.println("Warning: Invalid duration. Setting to 0.");
            this.durationSeconds = 0;
        } else {
            this.durationSeconds = durationSeconds;
        }
        this.isExplicit = isExplicit;
    }

    /** Creates a track with a title and artist. */
    public Track(String title, String artist) {
        this(title, artist, 0, false);
    }

    /** Creates a track with a title and the default artist. */
    public Track(String title) {
        this(title, "Unknown Artist", 0, false);
    }

    /** Creates a track with default values. */
    public Track() {
        this("Unknown Title", "Unknown Artist", 0, false);
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public boolean isExplicit() {
        return isExplicit;
    }

    /** Returns the duration as minutes and zero-padded seconds (m:ss). */
    public String getDurationFormatted() {
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);
    }

    @Override
    public String toString() {
        String summary = "\"" + title + "\" by " + artist + " [" + getDurationFormatted() + "]";
        return isExplicit ? summary + " [EXPLICIT]" : summary;
    }
}
