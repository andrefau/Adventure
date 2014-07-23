import java.util.Scanner;

/**
 * Created by anfauske on 22.07.14.
 */
public class Spill {

    private Level1 l1 = new Level1();
    private Scanner sc = new Scanner(System.in);

    public Spill() {

    }

    public void startL1() {
        System.out.println("Welcome to ADVENTURE!\n---------------------\nFor a list of helpful commands, type 'help' at any time.\n\n\n" +
                "You are standing in a room. You have no recollection of how you got here, or where you are.\n");
        boolean rom = true;

        while (rom) {
            String kommando = sc.nextLine();
            String[] tab = kommando.split(" ");

            if (kommando.equalsIgnoreCase("help")) {                            // Help kommandoen
                l1.help();
            } else if (kommando.equalsIgnoreCase("look")) {                     // Look kommandoen
                l1.look();
            } else if (tab.length >= 2 && tab[1].equalsIgnoreCase("at")) {      // Look at kommandoen
                l1.lookAt(tab[2]);
            } else {
                System.out.println("That made no sense, try again.\n");
            }
        }
        sc.close();
    }
}
