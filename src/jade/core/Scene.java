package jade.core;

import java.util.ArrayList;

public abstract class Scene {
    public final String name;
    public ArrayList<GameObject> gameObjects;

    public Scene(String name) {
        this.name = name;
        this.gameObjects = new ArrayList<>();
    }

    public abstract void start();
    public void update(final float dt) {
        for(GameObject go : gameObjects) {
            go.update(dt);
            go.updateComponents(dt);
        }
    }
}
