package jade.core;

public class Input {
    public static boolean[] current = new boolean[256];
    public static boolean[] previous = new boolean[256];

    public static void update() {
        previous = new boolean[256];
        for(int i = 0; i < 256; i++) {
            previous[i] = current[i];
        }
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
