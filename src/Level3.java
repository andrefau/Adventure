import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by anfauske on 27.07.14.
 */
public class Level3 extends Level1{

    private boolean completed = false;
    private boolean key = false;
    private boolean light = false;
    private boolean door = false;
    private Scanner sc;

    public Level3() {
    }

    public boolean isCompleted() {
        return completed;
    }

    public void look() {
        if (!light) {
            System.out.println("You squint your eyes and try to make out something, anything, in the darkness. Did something just move, or did \n" +
                    "you just imagine it? You trace your hands alongside the walls and floor looking for anything that might help you. In a corner \n" +
                    "you find what you imagine must be a small box.\n");
        } else {
            System.out.println("You are standing in a small room, much like the ones before. On the far side of the room you can barely make \n" +
                    "out what appears to be a door drawn onto the stone wall. It has no handle, what appears to be a keyhole is etched into the stone.\n");
        }
    }

    public void lookAt(String object, ArrayList<String> inv) {
        if (object.equalsIgnoreCase("floor")) {
            System.out.println("The floor feels hard and cold to the touch.\n");
        } else if (object.equalsIgnoreCase("wall") || object.equalsIgnoreCase("walls")) {
            System.out.println("The walls feels like stone.\n");
        } else if (object.equalsIgnoreCase("box") && !light) {
            System.out.println("You cannot see it, but it feels like a small wooden box with a lid.\n");
        } else if (object.equalsIgnoreCase("box") && light) {
            System.out.println("It is a small wooden box.\n");
        } else if (object.equalsIgnoreCase("key") && light && !key) {
            System.out.println("It is a small golden key, with intricate carvings alongside its edge.\n");
        } else if (checkInv(object, inv)) {
            lookAtInv(object);
        } else {
            System.out.println("You want to look at what?\n");
        }
    }

    public void open(String object) {
        if (object.equalsIgnoreCase("floor")) {
            System.out.println("You can't just open the floor...\n");
        } else if (object.equalsIgnoreCase("wall") || object.equalsIgnoreCase("walls")) {
            System.out.println("You can't just open the walls...\n");
        } else if ((object.equalsIgnoreCase("box") || object.equalsIgnoreCase("lid")) && !light) {
            System.out.println("You open the box, and light floods the room. The unnatural darkness recedes slowly through cracks in the stone floor,\n" +
                    "forced away by light surging from the little box. You are left in a well lit room, and in the bottom of the box there is \n" +
                    "a small golden key.\n");
            light = true;
        } else if ((object.equalsIgnoreCase("box") || object.equalsIgnoreCase("lid")) && light) {
            System.out.println("The box is already open!\n");
        } else if (object.equalsIgnoreCase("door") && light && !door) {
            System.out.println("There is no handle on the drawing of the door. You push against it, but nothing seems to happen.\n");
        } else if (object.equalsIgnoreCase("door") && light && door) {
            if (openDoor()) {
                completed = true;
            }
        } else {
            System.out.println("You want to open what?\n");
        }
    }
}
