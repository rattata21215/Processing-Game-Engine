package jade.scenes;

import jade.components.SpriteRenderer;
import jade.components.Transform;
import jade.core.*;

import java.awt.event.KeyEvent;

public class MainMenuScene extends Scene {
    public MainMenuScene() {
        super("MainMenuScene");
    }

    GameObject test = new GameObject();

    @Override
    public void start() {
        test.addComponent(new Transform(test, new Vector2f(0, 0), new Vector2f(1280, 720)));
        test.addComponent(new SpriteRenderer(test,
                Window.getSketch().requestImage("assets/sprites/background/glacial_mountains/glacial_mountains.png"),
                true,
                false
        ));

        for(Component c : test.getAllComponents()) {
            c.init();
        }
    }

    @Override
    public void update(final float dt) {
        super.update(dt);
        test.update(dt);
        test.updateComponents(dt);
        if(Input.IsKeyHeld(KeyEvent.VK_W))
            System.out.println("Input Test #1");
        if(Input.IsKeyDown(KeyEvent.VK_S))
            System.out.println("Input Test #2");
        if(Input.IsKeyUp(KeyEvent.VK_D))
            System.out.println("Input Test #3");
    }
}
