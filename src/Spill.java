import java.util.Scanner;

/**
 * Created by anfauske on 22.07.14.
 */
public class Spill {

    private Level1 l1 = new Level1();
    private Level2 l2 = new Level2();
    private Scanner sc = new Scanner(System.in);

    public Spill() {

    }

    public void startL1() {
        System.out.println("Welcome to ADVENTURE!\n---------------------\nFor a list of helpful commands, type 'help' at any time.\n\n\n" +
                "You are standing in a room. You have no recollection of how you got here, or where you are.\n");


        while (!l1.isCompleted()) {
            String kommando = sc.nextLine();
            String[] tab = kommando.split(" ");

            if (kommando.equalsIgnoreCase("help")) {                            // Help kommandoen
                l1.help();
            } else if (kommando.equalsIgnoreCase("look")) {                     // Look kommandoen
                l1.look();
            } else if (tab.length >= 3 && tab[1].equalsIgnoreCase("at")) {      // Look at kommandoen
                l1.lookAt(tab[2]);
            } else if (tab.length >= 2 && tab[0].equalsIgnoreCase("open")) {    // Open kommandoen
                l1.open(tab[1]);
            } else if (tab.length >= 3 && tab[0].equalsIgnoreCase("pick")) {    // Pick up kommandoen
                l1.pickUp(tab[2]);
            } else if (kommando.equalsIgnoreCase("inventory")) {                // Inventory kommandoen
                l1.printInv();
            } else if (tab.length == 2 && tab[0].equalsIgnoreCase("use")) {     // Use kommandoen
                l1.use(tab[1]);
            } else if (tab.length >= 4 && tab[2].equalsIgnoreCase("with")) {    // Use with kommandoen
                l1.useWith(tab[1], tab[3]);
            } else {
                System.out.println("That made no sense, try again.\n");
            }
        }
    }

    public void startL2() {
        System.out.print("...and find yourself in front of another door. You push it open tentatively and enter the room. The door slams \n" +
                "shut behind you and, turning around, you realise that the walls have converged where the door used to be. You cannot go back.\n\n");

        while (!l2.isCompleted()) {
            String kommando = sc.nextLine();
            String[] tab = kommando.split(" ");

            if (kommando.equalsIgnoreCase("help")) {                            // Help kommandoen
                l2.help();
            } else if (kommando.equalsIgnoreCase("look")) {                     // Look kommandoen
                l2.look();
            } else if (tab.length >= 3 && tab[1].equalsIgnoreCase("at")) {      // Look at kommandoen
                l2.lookAt(tab[2]);
            } else if (tab.length >= 2 && tab[0].equalsIgnoreCase("open")) {    // Open kommandoen
                l2.open(tab[1]);
            } else if (tab.length >= 3 && tab[0].equalsIgnoreCase("pick")) {    // Pick up kommandoen
                l2.pickUp(tab[2]);
            } else if (kommando.equalsIgnoreCase("inventory")) {                // Inventory kommandoen
                l2.printInv();
            } else if (tab.length == 2 && tab[0].equalsIgnoreCase("use")) {     // Use kommandoen
                l2.use(tab[1]);
            } else if (tab.length >= 4 && tab[2].equalsIgnoreCase("with")) {    // Use with kommandoen
                l2.useWith(tab[1], tab[3]);
            } else {
                System.out.println("That made no sense, try again.\n");
            }
        }
    }
}
