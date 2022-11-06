package src;

/**
 * this file is responsible for printing out a list of songs and the additional song that should be added
 */
import java.util.ArrayList;

public class Songs {

    public void listofsongs(String[] args) {

        ArrayList<String> Songs = new ArrayList<String>();

        System.out.print("\f");

        Songs.add("SAD!, " + "XXXTENTACION , " + 1883239445);

        Songs.add("Shallow, " + "Lady Gaga and Bradley Cooper, " + 1877934670);

        Songs.add("Love Yourself, " + "Justin Bieber, " + 1865156825);

        Songs.add("All of Me, " + "John Legend, " + 1832939420);

        Songs.add("Circles, " + "Post Malone – Circles, " + 1826054973);

        Songs.add("Thunder, " + "Imagine Dragons, " + 1792380578);

        Songs.add("Jocelyn Flores, " + "XXXTENTACION , " + 1786334018);

        Songs.add("Goosebumps, " + "Travis Scott, " + 1785363087);

        Songs.add("XO TOUR Llif3, " + "Lil Uzi Vert, " + 1744462553);

        Songs.add("HUMBLE, " + "Kendrick Lamar, " + 1689242346);

        for (int i = 0; i < Songs.size(); i++) {

            System.out.println(Songs.get(i));
            System.out.print("\f");
        }

    }

}
