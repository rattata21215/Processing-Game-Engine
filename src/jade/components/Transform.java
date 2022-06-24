package jade.components;

import jade.core.Component;
import jade.core.GameObject;
import jade.core.Vector2f;

public class Transform extends Component {
    private Vector2f position;
    private Vector2f scale;

    public Transform(GameObject gameObject) {
        super(gameObject);
        this.position = new Vector2f();
        this.scale = new Vector2f(10, 10);
    }

    public Transform(GameObject gameObject, Vector2f position, Vector2f scale) {
        super(gameObject);
        this.position = position;
        this.scale = scale;
    }

    public Vector2f getPosition() {
        return this.position;
    }

    public Vector2f getScale() {
        return this.scale;
    }
}
