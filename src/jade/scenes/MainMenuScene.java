package jade.scenes;

import jade.components.SpriteRenderer;
import jade.core.GameObject;
import jade.core.Input;
import jade.core.Scene;
import jade.core.Window;

import java.awt.event.KeyEvent;

public class MainMenuScene extends Scene {
    public MainMenuScene() {
        super("MainMenuScene");
    }

    GameObject test = new GameObject();

    @Override
    public void start() {
        test.addComponent(new SpriteRenderer(test,
                Window.getSketch().requestImage("assets/sprites/background/glacial_mountains/glacial_mountains.png"),
                true,
                false
        ));
    }

    @Override
    public void update(final float dt) {
        super.update(dt);
        if(Input.IsKeyHeld(KeyEvent.VK_W))
            System.out.println("Input Test #1");
        if(Input.IsKeyDown(KeyEvent.VK_S))
            System.out.println("Input Test #2");
        if(Input.IsKeyUp(KeyEvent.VK_D))
            System.out.println("Input Test #3");
    }
}
