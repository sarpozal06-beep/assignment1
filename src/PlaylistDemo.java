/** Demonstrates the Track constructors and methods. */
public class PlaylistDemo {
    public static void main(String[] args) {
        Track defaultTrack = new Track();
        Track titleOnlyTrack = new Track("Ocean Drive");
        Track titleArtistTrack = new Track("Neon Lights", "Stellar Echo");
        Track fullTrack = new Track("Midnight Run", "The Comets", 225, true);
        Track invalidDurationTrack = new Track("Time Warp", "The Loops", -12, false);

        System.out.println("Default: " + defaultTrack);
        System.out.println("Title only: " + titleOnlyTrack);
        System.out.println("Title and artist: " + titleArtistTrack);
        System.out.println("Full constructor: " + fullTrack);
        System.out.println("Invalid duration: " + invalidDurationTrack);

        System.out.println("\nGetter values for fullTrack:");
        System.out.println("Title: " + fullTrack.getTitle());
        System.out.println("Artist: " + fullTrack.getArtist());
        System.out.println("Duration seconds: " + fullTrack.getDurationSeconds());
        System.out.println("Explicit: " + fullTrack.isExplicit());
        System.out.println("Formatted duration: " + fullTrack.getDurationFormatted());
    }
}

