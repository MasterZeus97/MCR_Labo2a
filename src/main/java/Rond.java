import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class Rond extends Forme{

    public Rond(int height, int width) {
        super(height, width);
    }

    @Override
    public void draw() {
        Graphics2D g2 = Display.getInstance().getGraphics();
        /*g2.setColor(g2.getBackground());
        g2.fillOval(posX, posY, size, size);*/

        posY += speedY;
        posX += speedX;

        g2.setColor(Color.BLUE);
        g2.fillOval(posX, posY, size,size);

        checkColision();
        g2.dispose();
    }
}
