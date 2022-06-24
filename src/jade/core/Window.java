package jade.core;

import jade.components.SpriteRenderer;
import jade.components.Transform;
import jade.scenes.MainMenuScene;
import processing.core.PApplet;
import processing.core.PGraphics;
import processing.core.PImage;
import processing.opengl.PGraphics2D;

public class Window extends PApplet {

    private static Scene currentScene = null;
    public static void switchScenes(String sceneName) {
        if(currentScene == null)
            currentScene = new MainMenuScene();
    }

    private GameObject go = new GameObject();
    private static PApplet sketch;
    public Window() {
        super();
        Window.sketch = this;
    }

    public static PApplet getSketch() {
        return Window.sketch;
    }

    public void settings() {
        size(1280, 720, P2D);
    }

    public void setup() {
        frameRate(120);
        background(0);

        go.addComponent(new Transform(go, new Vector2f(50, 50), new Vector2f(1280, 720)));
        go.addComponent(new SpriteRenderer(go, loadImage("assets/sprites/background/glacial_mountains/glacial_mountains.png"), true, false, true));
    }

    public void draw() {
        background(0);

        go.getComponent(Transform.class).getPosition().x -= 15 * (1f / frameRate);

        go.update(1f / frameRate);
        go.updateComponents(1f / frameRate);

        textSize(25);
        text("FPS: " + frameRate, 15, 25);
    }
}
