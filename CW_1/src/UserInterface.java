package src;

/**
 * This class prints the user an a list of commands and subsequent, appropriate
 * responses based on the integer input through if/else statements
 * 
 * @throws InterruptedException
 */

public class UserInterface {

    public void run() throws InterruptedException {

        System.out.println("welcome to Generic Console Music Streaming Service");
        System.out.println("What is the current users Name?");
        String name = InputReader.getString("Enter your name: ");
        System.out.println("Hello " + name);
        System.out.print("\f");

        int inst = 0;
        do {

            System.out.print("\f");
            Commands commands = new Commands();
            commands.main(null);

            Integer comm = InputReader.getInt("Enter a number: ");
            inst = (comm);

            do {
                Newsong newsong = new Newsong();
                if (inst == 1) {

                    System.out.println("works 1");
                    Songs songs = new Songs();
                    songs.listofsongs(null);
                    newsong.Song(name, name, comm);
                    Thread.sleep(1000);
                    {
                    }
                    System.out.print("\f");

                    inst = 0;
                }

                else if (inst == 2) {

                    System.out.println("works 2");
                    newsong.input();
                    System.out.println("New song has been added! Select print all in the menu to confirm!");
                    newsong.Song(name, name, inst);
                    Thread.sleep(1000);
                    {
                    }
                    System.out.print("\f");

                    inst = 0;
                }

                else if (inst == 3) {

                    System.out.println("works 3");

                    Thread.sleep(1000);
                    {
                    }
                    System.out.print("\f");

                    inst = 0;
                }

                else if (inst == 4) {

                    System.out.println("works 4");

                    Thread.sleep(1000);
                    {
                    }
                    System.out.print("\f");

                    inst = 0;
                }

                else if (inst == 5) {
                    System.exit(1);
                }

                else {

                    System.out.println("Please input a valid command ");
                    System.out.print("\f");

                    Thread.sleep(1000);
                    {
                    }
                    System.out.print("\f");

                    inst = 0;
                }

            } while (inst == -1);
        } while (inst == 0);
    }

}
