package jade.core;

import processing.core.PApplet;

import java.util.ArrayList;

public class GameObject {
    public String name;
    public final int ID;
    private ArrayList<Component> components;

    protected static final PApplet sketch = Window.getSketch();

    private static int GAMEOBJECT_ID = 0;

    public GameObject(String name) {
        this.name = name;
        this.components = new ArrayList<>();
        this.ID = GAMEOBJECT_ID;
        GAMEOBJECT_ID++;
    }

    public GameObject() {
        this.name = "Unnamed Object (ID: " + GAMEOBJECT_ID + ")";
        this.components = new ArrayList<>();
        this.ID = GAMEOBJECT_ID;
        GAMEOBJECT_ID++;
    }

    public void start() {}
    public void update(final float dt) {}

    public void addComponent(Component c) {
        this.components.add(c);
    }

    public <T extends Component> T getComponent(Class<T> c1) {
        for(Component c2 : this.components) {
            if(c1.isAssignableFrom(c2.getClass())) {
                return c1.cast(c2);
            }
        }

        return null;
    }

    public void removeComponent(Component c) {
        this.components.remove(c);
    }

    public ArrayList<Component> getAllComponents() {
        return this.components;
    }

    public void updateComponents(final float dt) {
        for(Component c : this.components) {
            c.update(dt);
        }
    }
}
