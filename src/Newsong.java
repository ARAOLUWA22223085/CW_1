package src;

/**
 * this class can store information about a song and saves the information as
 * variables to be printed
 * 
 * @author Araoluwa Olatunji
 */
public class Newsong {
    String title;
    String artist;
    int playcount;

    public void input() {
        this.title = InputReader.getString("Enter song name here: > ");
        this.artist = InputReader.getString("Enter artist name here: > ");
        this.playcount = InputReader.getInt("Enter song playcount here: > ");
        System.out.print("\f");
        System.out.println(title + ", " + artist + ", " + playcount);
        System.out.print("\f");
    }

    public void Song(String title, String artist, int playcount) {
        this.title = title;
        this.artist = artist;
        this.playcount = playcount;
        System.out.println(title + ", " + artist + ", " + playcount);
        System.out.print("\f");
    }

    public void print() {
        System.out.println(title + ", " + artist + ", " + playcount);
        System.out.print("\f");
    }
}
