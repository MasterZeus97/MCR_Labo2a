import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Forme {
    protected int size;
    protected int posX, posY;
    protected int speedX, speedY;

    public Forme(int height, int width) {
        size = ThreadLocalRandom.current().nextInt(5, 20);
        posX = ThreadLocalRandom.current().nextInt(0, height - size);
        posY = ThreadLocalRandom.current().nextInt(0, width - size);
        speedX = ThreadLocalRandom.current().nextInt(-5, 5);
        speedY = ThreadLocalRandom.current().nextInt(-5, 5);
    }

    //abstract void draw(Graphics2D g2);

    abstract void draw();

    protected void checkColision(){

        if((posX < 0) || (posX + size) > Display.getInstance().getWidth())
            speedX *= -1;

        if((posY < 0) || (posY + size) > Display.getInstance().getHeight())
            speedY *= -1;
        /*if((posX < 0)){
            posX = 0;
            speedX *= -1;
        }else if((posX + size) > Display.getInstance().getWidth()){
            posX = Display.getInstance().getWidth();
            speedX *= -1;
        }


        if((posY < 0)){
            posY = 0;
            speedY *= -1;
        }else if((posY + size) > Display.getInstance().getHeight()){
            posY = Display.getInstance().getHeight();
            speedY *= -1;
        }*/
    }
}
