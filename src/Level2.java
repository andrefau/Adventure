/**
 * Created by anfauske on 24.07.14.
 */
public class Level2 extends Level1 {

    private boolean completed = false;

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
}
