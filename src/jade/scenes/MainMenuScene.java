package jade.scenes;

import jade.components.SpriteRenderer;
import jade.core.GameObject;
import jade.core.Scene;
import jade.core.Window;

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
}
