package jade.core;

public class Input {
    public static boolean[] current = new boolean[256];
    public static boolean[] previous = new boolean[256];

    public static void update() {
        previous = new boolean[256];
        System.arraycopy(current, 0, previous, 0, 256);
    }

    public static boolean IsKeyDown(int key) {
        return current[key] && !previous[key];
    }

    public static boolean IsKeyHeld(int key) {
        return current[key];
    }

    public static boolean IsKeyUp(int key) {
        return !current[key] && previous[key];
    }
}
