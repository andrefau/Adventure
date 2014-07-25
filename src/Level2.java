/**
 * Created by anfauske on 24.07.14.
 */
public class Level2 extends Level1 {

    private boolean completed = false;
    private boolean door = false;

    public Level2() {
    }

    public boolean isCompleted() {
        return completed;
    }

    public void look() {
        System.out.println("You find yourself in another square room. The floor and walls are made of stone, and on the far side of the room there is \n" +
                "another steel door. The room is seemingly empty except for what appears to be a telephone on the wall beside the door.\n" +
                "A dim light comes from beneath the door, enough to slightly illuminate the small room.\n");
    }

    public void lookAt(String object) {
        if (object.equalsIgnoreCase("floor")) {
            System.out.println("It is a cold and hard stone floor.\n");
        } else if (object.equalsIgnoreCase("wall") || object.equalsIgnoreCase("walls")) {
            System.out.println("The walls are made of stone.\n");
        } else if (object.equalsIgnoreCase("door")) {
            System.out.println("You see a large steel door. On closer inspection you can see that the words 'Speak, friend, and enter.' are etched \n" +
                    "into the cold steel.\n");
        } else if (object.equalsIgnoreCase("light")) {
            System.out.println("The soft light is coming from beneath the door.\n");
        } else if (object.equalsIgnoreCase("telephone") || object.equalsIgnoreCase("phone")) {
            System.out.println("The phone is hanging by a hook on the wall. Its cord disappears between the stones, and it has no dial.\n");
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
            // Sett inn kode for åpen dør her.
        } else if (object.equalsIgnoreCase("telephone") || object.equalsIgnoreCase("phone")) {
            System.out.println("You try to break open the telephone, but to no avail. You are left feeling useless and depressed.\n");
        } else {
            System.out.println("You want to open what?\n");
        }
    }
}
