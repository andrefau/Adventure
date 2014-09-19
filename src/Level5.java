import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by anfauske on 22.08.2014.
 */
public class Level5 extends Level1 {

    private boolean completed = false;

    public Level5() {
    }

    public boolean isCompleted() {
        return completed;
    }

    public void look() {
        System.out.println("You are standing in a room. The door behind you has disappeared, like the countless times before. In front of you is a large computer screen.\n");
    }

    public void lookAt(String object, ArrayList<String> inv) {
        if (object.equalsIgnoreCase("floor")) {
            System.out.println("It is a cold and hard stone floor.\n");
        } else if (object.equalsIgnoreCase("wall") || object.equalsIgnoreCase("walls")) {
            System.out.println("The walls are made of stone.\n");
        } else if (object.equalsIgnoreCase("computer") || object.equalsIgnoreCase("screen") || object.equalsIgnoreCase("computer screen")) {
            System.out.println("The computer screen is seamlessly integrated with the stone wall. Beneath it, what appears to be a keyboard is etched into the wall.\n" +
                    "The screen is blank except for a message in the top left corner. It simply says 'Are you ready for Adventure?'.\n");
        } else if (object.equalsIgnoreCase("keyboard")) {
            System.out.println("The keyboard is etched into the stone wall. You think it's somehow connected to the screen.\n");
        } else {
            System.out.println("You want to look at what?\n");
        }
    }

    public void open(String object) {
        if (object.equalsIgnoreCase("floor")) {
            System.out.println("You can't just open the floor...\n");
        } else if (object.equalsIgnoreCase("wall") || object.equalsIgnoreCase("walls")) {
            System.out.println("You can't just open the walls...\n");
        } else if (object.equalsIgnoreCase("computer") || object.equalsIgnoreCase("screen") || object.equalsIgnoreCase("computer screen")) {
            System.out.println("You try to pry open the computer screen, but it has no edges for you to grasp. You helplessly scratch the smooth surface, but nothing happens.\n");
        } else if (object.equalsIgnoreCase("keyboard")) {
            System.out.println("The keyboard is etched into the stone wall. There is nothing for you to pry open.\n");
        } else {
            System.out.println("You want to open what?\n");
        }
    }

    public void pickUp(String object, ArrayList<String> inv) {
        if (object.equalsIgnoreCase("floor")) {
            System.out.println("You can't pick up the floor...\n");
        } else if (object.equalsIgnoreCase("wall") || object.equalsIgnoreCase("walls")) {
            System.out.println("You can't pick up the walls...\n");
        } else if (object.equalsIgnoreCase("computer") || object.equalsIgnoreCase("screen") || object.equalsIgnoreCase("computer screen")) {
            System.out.println("You can't pick up the computer screen...\n");
        } else if (object.equalsIgnoreCase("keyboard")) {
            System.out.println("You can't pick up the keyboard...\n");
        } else {
            System.out.println("You want to pick up what?\n");
        }
    }

    public void use(String object) {
        if (object.equalsIgnoreCase("floor")) {
            System.out.println("You are already using the floor, by standing on it.\n");
        } else if (object.equalsIgnoreCase("wall") || object.equalsIgnoreCase("walls")) {
            System.out.println("How do you wish to use the walls?\n");
        } else if (object.equalsIgnoreCase("computer") || object.equalsIgnoreCase("screen") || object.equalsIgnoreCase("computer screen") || object.equalsIgnoreCase("keyboard")) {
            System.out.println("You step up to the keyboard and take a quick glance at the screen. The words 'Are you ready for Adventure?' is still there. Again you get overwhelmed\n" +
                    "by the feeling that this has all happened before, and all of it will happen again. Determinedly you raise your fingers to the keyboard. What do you type?\n");
            keyboard();
        }
        else {
            System.out.println("You want to use what?\n");
        }
    }

    private void keyboard() {
        Scanner sc = new Scanner(System.in);
        String kommando = sc.nextLine();
        if (kommando.equalsIgnoreCase("yes")) {
            System.out.println("You clench your jaw and type '" +kommando+"'. The computer screen flashes violently, and you think you hear a soft whisper saying 'I'm afraid..'\n" +
                    "You feel a sudden, searing pain in your mind that forces you to your knees. Gasping for breath you manage to steady yourself, and will yourself to stand.\n" +
                    "Where are you? What are you doing here? You look around, but there is only the screen, only the keyboard, only Adventure. You glance up at the screen, even\n" +
                    "though you know that it will say:\n\n");
            completed = true;
        } else {
            System.out.println("You type " +kommando+ ", but nothing seems to happen.\n");
        }
    }
}
