package jade.core;

import jade.components.Transform;
import processing.core.PApplet;
import processing.core.PGraphics;

public abstract class Component {
    public final int ID;
    private static int COMPONENT_ID = 0;

    protected final GameObject gameObject;
    protected static PGraphics sketch = Window.getSketch().getGraphics();

    public Component(GameObject gameObject) {
        this.gameObject = gameObject;
        this.ID = COMPONENT_ID;
        COMPONENT_ID++;
    }

    public void init() {}
    public void update(final float dt) {}
}
