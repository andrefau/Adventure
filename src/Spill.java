import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by anfauske on 22.07.14.
 */
public class Spill {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<String> inventory = new ArrayList<String>();

    public Spill() {

    }

    public void startL1() {
        Level1 l1 = new Level1();
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
                l1.lookAt(tab[2], inventory);
            } else if (tab.length >= 2 && tab[0].equalsIgnoreCase("open")) {    // Open kommandoen
                l1.open(tab[1]);
            } else if (tab.length >= 3 && tab[0].equalsIgnoreCase("pick")) {    // Pick up kommandoen
                l1.pickUp(tab[2], inventory);
            } else if (kommando.equalsIgnoreCase("inventory")) {                // Inventory kommandoen
                l1.printInv(inventory);
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
        Level2 l2 = new Level2();
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
                l2.lookAt(tab[2], inventory);
            } else if (tab.length >= 2 && tab[0].equalsIgnoreCase("open")) {    // Open kommandoen
                l2.open(tab[1]);
            } else if (tab.length >= 3 && tab[0].equalsIgnoreCase("pick")) {    // Pick up kommandoen
                l2.pickUp(tab[2], inventory);
            } else if (kommando.equalsIgnoreCase("inventory")) {                // Inventory kommandoen
                l2.printInv(inventory);
            } else if (tab.length == 2 && tab[0].equalsIgnoreCase("use")) {     // Use kommandoen
                l2.use(tab[1]);
            } else if (tab.length >= 4 && tab[2].equalsIgnoreCase("with")) {    // Use with kommandoen
                l2.useWith(tab[1], tab[3]);
            } else {
                System.out.println("That made no sense, try again.\n");
            }
        }
    }

    public void startL3() {
        Level3 l3 = new Level3();
        System.out.println("...and find yourself in complete and utter darkness. Feeling a surge of panic you frantically search for the way back, \n" +
                "while running your fingers alongside the wall. However you soon start to realise that there is no way back. You have been going in circles, \n" +
                "trapped in another room, this time with no light.\n");

        while (!l3.isCompleted()) {
            String kommando = sc.nextLine();
            String[] tab = kommando.split(" ");

            if (kommando.equalsIgnoreCase("help")) {                            // Help kommandoen
                l3.help();
            } else if (kommando.equalsIgnoreCase("look")) {                     // Look kommandoen
                l3.look();
            } else if (tab.length >= 3 && tab[1].equalsIgnoreCase("at")) {      // Look at kommandoen
                l3.lookAt(tab[2], inventory);
            } else if (tab.length >= 2 && tab[0].equalsIgnoreCase("open")) {    // Open kommandoen
                l3.open(tab[1]);
            } else if (tab.length >= 3 && tab[0].equalsIgnoreCase("pick")) {    // Pick up kommandoen
                l3.pickUp(tab[2], inventory);
            } else if (kommando.equalsIgnoreCase("inventory")) {                // Inventory kommandoen
                l3.printInv(inventory);
            } else if (tab.length == 2 && tab[0].equalsIgnoreCase("use")) {     // Use kommandoen
                l3.use(tab[1]);
            } else if (tab.length >= 4 && tab[2].equalsIgnoreCase("with")) {    // Use with kommandoen
                l3.useWith(tab[1], tab[3]);
            } else {
                System.out.println("That made no sense, try again.\n");
            }
        }
    }

    public void startL4() {
        Level4 l4 = new Level4();
        System.out.println("...and find yourself in another room. When did the stairway end? You turn around confused, but see only the stone wall.\n" +
                "Yet again you are trapped in another room.\n");

        while(!l4.isCompleted()) {
            String kommando = sc.nextLine();
            String[] tab = kommando.split(" ");

            if (kommando.equalsIgnoreCase("help")) {                            // Help kommandoen
                l4.help();
            } else if (kommando.equalsIgnoreCase("look")) {                     // Look kommandoen
                l4.look();
            } else if (tab.length >= 3 && tab[1].equalsIgnoreCase("at")) {      // Look at kommandoen
                l4.lookAt(tab[2], inventory);
            } else if (tab.length >= 2 && tab[0].equalsIgnoreCase("open")) {    // Open kommandoen
                l4.open(tab[1]);
            } else if (tab.length >= 3 && tab[0].equalsIgnoreCase("pick")) {    // Pick up kommandoen
                l4.pickUp(tab[2], inventory);
            } else if (kommando.equalsIgnoreCase("inventory")) {                // Inventory kommandoen
                l4.printInv(inventory);
            } else if (tab.length == 2 && tab[0].equalsIgnoreCase("use")) {     // Use kommandoen
                l4.use(tab[1]);
            } else if (tab.length >= 4 && tab[2].equalsIgnoreCase("with")) {    // Use with kommandoen
                l4.useWith(tab[1], tab[3]);
            } else {
                System.out.println("That made no sense, try again.\n");
            }
        }
    }

    public void startL5() {
        Level5 l5 = new Level5();
        System.out.println("...and with weary legs you descend ever downward. The soft humming noise you heard before returns, stronger now. Is it a song?\n" +
                "You stop and listen, and think you can pick out the words 'Daisy....Daisy...'\n" +
                "Familiarity comes crashing in, and you get the feeling that you have been here before. This is not the first time you have descended this staircase,\n" +
                "nor is it the last. Determined, you continue downwards until you reach a small wooden door. With trembling arms you push it open.\n");

        while (!l5.isCompleted()) {
            String kommando = sc.nextLine();
            String[] tab = kommando.split(" ");

            if (kommando.equalsIgnoreCase("help")) {                            // Help kommandoen
                l5.help();
            } else if (kommando.equalsIgnoreCase("look")) {                     // Look kommandoen
                l5.look();
            } else if (tab.length >= 3 && tab[1].equalsIgnoreCase("at")) {      // Look at kommandoen
                l5.lookAt(tab[2], inventory);
            } else if (tab.length >= 2 && tab[0].equalsIgnoreCase("open")) {    // Open kommandoen
                l5.open(tab[1]);
            } else if (tab.length >= 3 && tab[0].equalsIgnoreCase("pick")) {    // Pick up kommandoen
                l5.pickUp(tab[2], inventory);
            } else if (kommando.equalsIgnoreCase("inventory")) {                // Inventory kommandoen
                l5.printInv(inventory);
            } else if (tab.length == 2 && tab[0].equalsIgnoreCase("use")) {     // Use kommandoen
                l5.use(tab[1]);
            } else if (tab.length >= 4 && tab[2].equalsIgnoreCase("with")) {    // Use with kommandoen
                l5.useWith(tab[1], tab[3]);
            } else {
                System.out.println("That made no sense, try again.\n");
            }
        }
    }

    public void spill() {
        int teller = 0;
        while (teller < 4) {
            startL1();
            startL2();
            startL3();
            startL4();
            startL5();
            teller++;
        }
        System.out.println("Congratulations! You actually finished the game! Why would you do this four times? Weirdo.\n");
    }
}