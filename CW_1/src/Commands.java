package src;

import java.util.ArrayList;

public class Commands {
    /**
     * 
     * @param args
     *             this method exists to present the user with commands to continue
     *             with the program
     */
    void main(String[] args) {

        System.out.println("what would you like to see now?");

        ArrayList<String> commands = new ArrayList<String>();
        commands.add(" 1) Print all songs?");
        commands.add(" 2) Add new song?");
        commands.add(" 3) remove new song?");
        commands.add(" 4) print songs with more than 1,000,000 plays?");
        commands.add(" 5) Exit?");
        System.out.print("\f");

        for (int i = 0; i < commands.size(); i++) {

            System.out.println(commands.get(i));
        }

    }
}
