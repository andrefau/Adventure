/**
 * Created by anfauske on 22.07.14.
 */
public class Level1 {

    public Level1() {
    }

    public void help() {
        System.out.println("\n" +
                "'Look'                       - Gives a description of your surroundings.\n" +
                "'Look at <object>'           - Gives a description of an item in the world, or in your inventory.\n" +
                "'Open <object>'              - Opens an object.\n" +
                "'Pick up <object>'           - Picks up an object and places it in your inventory.\n" +
                "'Inventory'                  - Shows a list of your current inventory.\n" +
                "'Use <item> with <object>'   - Uses an item from the world, or your inventory, with an object in the world.\n");
    }

    public void look() {
        System.out.println("You are standing in a small square room, with a stone floor, wooden walls, a steel door and no windows.\n" +
                "A dim light comes from beneath the door, enough to slightly illuminate the small room. In the middle of the room " +
                "there's a table with a note on it.\n");
    }

    public void lookAt(String object) {
        if (object.equalsIgnoreCase("floor")) {
            System.out.println("It is a cold and hard stone floor.\n");
        } else if (object.equalsIgnoreCase("walls") || object.equalsIgnoreCase("wall")) {
            System.out.println("The walls are made of old, splintery wood.\n");
        } else if (object.equalsIgnoreCase("door")) {
            System.out.println("You see a large steel door. A faint light emanates through the crack beneath it.\n");
        } else if (object.equalsIgnoreCase("table")) {
            System.out.println("You see a small wooden table with four legs. There's a note on it.\n");
        } else if (object.equalsIgnoreCase("note")) {
            System.out.println("");
        } else {
            System.out.println("You want to look at what?.\n");
        }
    }
}
