import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by anfauske on 22.07.14.
 */
public class Level1 {

    private boolean note = true;
    private boolean door = false;
    private boolean completed = false;
    private Scanner sc;

    public Level1() {
    }

    public boolean isCompleted() {
        return completed;
    }

    public void help() {
        System.out.println("\n" +
                "'Look'                       - Gives a description of your surroundings.\n" +
                "'Look at <object>'           - Gives a description of an item in the world, or in your inventory.\n" +
                "'Open <object>'              - Opens an object.\n" +
                "'Pick up <object>'           - Picks up an object and places it in your inventory.\n" +
                "'Inventory'                  - Shows a list of your current inventory.\n" +
                "'Use <item>'                 - Uses an item in the world.\n" +
                "'Use <item> with <object>'   - Uses an item from the world, or your inventory, with an object in the world.\n");
    }

    public void look() {
        if (note) {
            System.out.println("You are standing in a small square room, with a stone floor, wooden walls, a steel door and no windows.\n" +
                    "A dim light comes from beneath the door, enough to slightly illuminate the small room. In the middle of the room " +
                    "there is a table with a note on it.\n");
        } else {
            System.out.println("You are standing in a small square room, with a stone floor, wooden walls, a steel door and no windows.\n" +
                    "A dim light comes from beneath the door, enough to slightly illuminate the small room. In the middle of the room " +
                    "there is a table.\n");
        }
    }

    public void lookAt(String object, ArrayList<String> inv) {
        if (object.equalsIgnoreCase("floor")) {
            System.out.println("It is a cold and hard stone floor.\n");
        } else if (object.equalsIgnoreCase("walls") || object.equalsIgnoreCase("wall")) {
            System.out.println("The walls are made of old, splintery wood.\n");
        } else if (object.equalsIgnoreCase("door")) {
            System.out.println("You see a large steel door. A faint light emanates through the crack beneath it.\n" +
                    "On the wall beside the door, there's a keypad with the numbers 0-9.\n");
        } else if (object.equalsIgnoreCase("keypad")) {
            System.out.println("It is a keypad with the numbers 0-9.\n");
        } else if (object.equalsIgnoreCase("table") && note) {
            System.out.println("You see a small wooden table with four legs. There's a note on it.\n");
        } else if (object.equalsIgnoreCase("table") && !note) {
            System.out.println("You see a small wooden table with four legs.\n");
        } else if (object.equalsIgnoreCase("note")) {
            System.out.println("Printed in large bold letters, it simply says 'What is the meaning of life?'.\n");
        } else if (object.equalsIgnoreCase("light")) {
            System.out.println("The soft light is coming from beneath the door.\n");
        } else {
            System.out.println("You want to look at what?\n");
        }
    }

    public void open(String object) {
        if (object.equalsIgnoreCase("floor")) {
            System.out.println("You can't just open the floor...\n");
        } else if (object.equalsIgnoreCase("wall") || object.equalsIgnoreCase("walls")) {
            System.out.println("You can't just open the walls...\n");
        } else if (object.equalsIgnoreCase("door") && !door) {
            System.out.println("The door is locked.\n");
        } else if (object.equalsIgnoreCase("door") && door) {
            if (openDoor()) {
                completed = true;
            }
        } else if (object.equalsIgnoreCase("table")) {
            System.out.println("You can't just open the table...\n");
        } else if (object.equalsIgnoreCase("keypad")) {
            System.out.println("You try to pry open the keypad, but it is stuck.\n");
        } else {
            System.out.println("You want to open what?\n");
        }
    }

    public void pickUp(String object, ArrayList<String> inv) {
        if (object.equalsIgnoreCase("floor")) {
            System.out.println("You can't pick up the floor...\n");
        } else if (object.equalsIgnoreCase("wall") || object.equalsIgnoreCase("walls")) {
            System.out.println("You can't pick up the walls...\n");
        } else if (object.equalsIgnoreCase("table")) {
            System.out.println("You try to pick up the table, but it won't budge.\n");
        } else if (object.equalsIgnoreCase("door")) {
            System.out.println("You can't pick up the door...\n");
        } else if (object.equalsIgnoreCase("keypad")) {
            System.out.println("You try to pry loose the keypad, but it's stuck.\n");
        } else if (object.equalsIgnoreCase("note") && note) {
            System.out.println("You pick up the note and add it to your inventory.\n");
            inv.add("Note");
            note = false;
        } else if (object.equalsIgnoreCase("note") && !note) {
            System.out.println("You have already picked up the note!\n");
        } else {
            System.out.println("You want to pick up what?\n");
        }
    }

    public void printInv(ArrayList<String> inv) {
        if (inv.size() == 0) {
            System.out.println("Your inventory is empty.\n");
        } else {
            for (String i : inv) {
                System.out.println("- " +i);
            }
        }
    }

    public void use(String object) {
        sc = new Scanner(System.in);
        if (object.equalsIgnoreCase("floor")) {
            System.out.println("You are already using the floor, by standing on it.\n");
        } else if (object.equalsIgnoreCase("wall") || object.equalsIgnoreCase("walls")) {
            System.out.println("How do you wish to use the walls?\n");
        } else if (object.equalsIgnoreCase("table")) {
            System.out.println("A table has many uses. But none that could help you here.\n");
        } else if (object.equalsIgnoreCase("door") && !door) {
            System.out.println("The door is locked.\n");
        } else if (object.equalsIgnoreCase("door") && door) {
            if (openDoor()) {
                completed = true;
            }
        } else if (object.equalsIgnoreCase("keypad")) {
            System.out.println("You are standing in front of the keypad. Enter a combination:\n");
            String kommando = sc.nextLine();
            keypad(kommando);
        } else {
            System.out.println("You want to use what?\n");
        }
    }

    public void useWith(String item, String object) {
        System.out.println("That combination does not work.\n");
    }

    // Hjelpemetode til use(). Sjekker om brukeren tastet inn rett svar på keypaden.
    private boolean keypad(String svar) {
        if (svar.equalsIgnoreCase("42")) {
            System.out.println("You hear a soft 'click' from the door.\n");
            door = true;
            return true;
        } else {
            System.out.println("You enter " + svar + ", but nothing seems to happen. Feeling hopeless, you back away from the keypad.\n");
            return false;
        }
    }

    // Hjelpemetode til open() og use(). Sjekker om brukeren har klart nivået, og går videre
    public boolean openDoor() {
        sc = new Scanner(System.in);
        System.out.println("The door glides open, and you see a spiraling stairway going downwards. Flickering torches on the stone \n" +
                "wall illuminates the way. Do you wish to continue?\n");
        boolean sjekk = false;

        while (!sjekk) {
            String kommando = sc.nextLine();
            if (kommando.equalsIgnoreCase("yes")) {
                System.out.print("You descend the narrow stairway...\n");
                sjekk = true;
                return true;
            } else if (kommando.equalsIgnoreCase("no")) {
                System.out.println("You find you are not yet ready to descend, and turn your back to the stairway, closing the door behind you.\n");
                sjekk = true;
            } else {
                System.out.println("Please type either 'yes' or 'no'.\n");
            }
        }
        return false;
    }

    // Hjelpemetode for å sjekke om spilleren har et objekt i inventoryet
    public boolean checkInv(String object, ArrayList<String> inv) {
        for (String i: inv) {
            if (i.equalsIgnoreCase(object)) {
                return true;
            }
        }
        return false;
    }

    // Hjelpemetode til lookAt() hvis brukeren ønsker å se på noe i inventoryet
    public void lookAtInv(String object) {
        if (object.equalsIgnoreCase("note")) {
            System.out.println("Printed in large bold letters, it simply says 'What is the meaning of life?'.\n");
        } else if (object.equalsIgnoreCase("key")) {
            System.out.println("It is a small golden key, with intricate carvings alongside its edge.\n");
        }
    }

}
