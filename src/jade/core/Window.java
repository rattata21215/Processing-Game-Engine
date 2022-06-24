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
    public static void changeToScene(String sceneName) {
        if(currentScene == null)
            currentScene = new MainMenuScene();
    }

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

        changeToScene("MainMenuScenes");
    }

    public void draw() {
        background(0);

        currentScene.update(1f / frameRate);

        textSize(25);
        text("FPS: " + frameRate, 15, 25);

        Input.update();
    }

    public void keyPressed() {
        Input.current[keyCode] = true;
    }

    public void keyReleased() {
        Input.current[keyCode] = false;
    }
}
