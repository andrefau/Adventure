import java.util.ArrayList;

/**
 * Created by anfauske on 29.07.14.
 */
public class Level4 extends Level1{

    private boolean completed = false;
    private boolean door = false;
    private int teller = 0;

    public Level4() {
    }

    public boolean isCompleted() {
        return completed;
    }

    public void look() {
        System.out.println("The room is much like the ones before. The floor and walls are made of stone, and on the far side of the room there is another steel door.\n" +
                "A dim light comes from beneath the door, enough to slightly illuminate the small room. You hear a soft humming noise from beyond the door. There is \n" +
                "nothing else in the room.\n");
    }

    public void lookAt(String object, ArrayList<String> inv) {
        if (object.equalsIgnoreCase("floor")) {
            System.out.println("It is a cold and hard stone floor.\n");
        } else if (object.equalsIgnoreCase("wall") || object.equalsIgnoreCase("walls")) {
            System.out.println("The walls are made of stone.\n");
        } else if (object.equalsIgnoreCase("door")) {
            System.out.println("You see a large, slightly rusted, steel door. It has no handle, nor any lock.\n");
        } else if (object.equalsIgnoreCase("rust")) {
            System.out.println("The door is speckled with rust.\n");
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
        } else if (object.equalsIgnoreCase("door") && !door && teller == 0) {
            teller++;
            System.out.println("You push against the steel door, but it won't move.\n");
        } else if (object.equalsIgnoreCase("door") && !door && teller == 1) {
            teller++;
            System.out.println("You ram your shoulder against the door. The door shudders and groans, but remain closed.\n");
        } else if (object.equalsIgnoreCase("door") && !door && teller == 2) {
            System.out.println("You muster up all your strength and kick the door. Rusted hinges shriek as the door gives in and light from the hallway illuminates\n" +
                    "the room. The door is now open.\n");
            door = true;
        } else if (object.equalsIgnoreCase("door") && door) {
            if (openDoor()) {
                completed = true;
            }
        } else {
            System.out.println("You want to open what?\n");
        }
    }

    public void pickUp(String object, ArrayList<String> inv) {
        if (object.equalsIgnoreCase("floor")) {
            System.out.println("You can't pick up the floor...\n");
        } else if (object.equalsIgnoreCase("wall") || object.equalsIgnoreCase("walls")) {
            System.out.println("You can't pick up the walls...\n");
        } else if (object.equalsIgnoreCase("door")) {
            System.out.println("You can't pick up the door...\n");
        } else {
            System.out.println("You want to pick up what?\n");
        }
    }

    public void use(String object) {
        if (object.equalsIgnoreCase("floor")) {
            System.out.println("You are already using the floor, by standing on it.\n");
        } else if (object.equalsIgnoreCase("wall") || object.equalsIgnoreCase("walls")) {
            System.out.println("How do you wish to use the walls?\n");
        } else if (object.equalsIgnoreCase("door") && !door && teller == 0) {
            teller++;
            System.out.println("You push against the steel door, but it won't move.\n");
        } else if (object.equalsIgnoreCase("door") && !door && teller == 1) {
            teller++;
            System.out.println("You ram your shoulder against the door. The door shudders and groans, but remain closed.\n");
        } else if (object.equalsIgnoreCase("door") && !door && teller == 2) {
            System.out.println("You muster up all your strength and kick the door. Rusted hinges shriek as the door gives in and light from the hallway illuminates\n" +
                    "the room. The door is now open.\n");
            door = true;
        } else if (object.equalsIgnoreCase("door") && door) {
            if (openDoor()) {
                completed = true;
            }
        } else {
            System.out.println("You want to use what?\n");
        }
    }
}