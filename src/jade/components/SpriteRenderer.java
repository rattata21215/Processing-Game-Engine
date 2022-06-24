package jade.components;

import jade.core.Component;
import jade.core.GameObject;
import jade.core.Vector2f;
import jade.core.Window;
import processing.core.PApplet;
import processing.core.PImage;

public class SpriteRenderer extends Component {
    private PImage sprite;
    private boolean repeatX;
    private boolean repeatY;

    private Transform transform = null;

    public SpriteRenderer(GameObject gameObject, PImage sprite, boolean repeatX, boolean repeatY) {
        super(gameObject);
        this.sprite = sprite;
        this.repeatX = repeatX;
        this.repeatY = repeatY;
    }

    @Override
    public void update(final float dt) {
        Vector2f tempPos;
        if(this.sprite == null)
            return;

        if(this.transform != null) {
            transform.getScale().x = sketch.width;
            transform.getScale().y = sketch.height;

            tempPos = new Vector2f(transform.getPosition().x, transform.getPosition().y);
            sketch.image(sprite,
                    transform.getPosition().x,
                    transform.getPosition().y
            );
            if(repeatX) {
                while(tempPos.x < 1280) {
                    sketch.image(sprite, tempPos.x, tempPos.y, transform.getScale().x, transform.getScale().y);
                    tempPos.x += transform.getScale().x;
                }
                while(tempPos.x > -1280) {
                    sketch.image(sprite, tempPos.x, tempPos.y, transform.getScale().x, transform.getScale().y);
                    tempPos.x -= transform.getScale().x;
                }
            }
            if(repeatY) {
                while(tempPos.y < 720) {
                    sketch.image(sprite, tempPos.x, tempPos.y, transform.getScale().x, transform.getScale().y);
                    tempPos.y += transform.getScale().y;
                }
                while(tempPos.x > -1280) {
                    sketch.image(sprite, tempPos.x, tempPos.y, transform.getScale().x, transform.getScale().y);
                    tempPos.y -= transform.getScale().y;
                }
            }
        } else {
            gameObject.addComponent(new Transform(gameObject));
            this.transform = gameObject.getComponent(Transform.class);
        }
    }
}
