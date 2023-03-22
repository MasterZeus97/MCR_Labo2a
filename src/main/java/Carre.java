import java.awt.*;

public class Carre extends Forme {

    private boolean test = false;
    public Carre(int height, int width) {
        super(height, width);
    }

    @Override
    public void draw() {
        Graphics2D g2 = Display.getInstance().getGraphics();
        /*g2.setColor(g2.getBackground());
        g2.fillRect(posX, posY, size, size);*/

        posY += speedY;
        posX += speedX;

        g2.setColor(Color.YELLOW);
        g2.fillRect(posX, posY, size, size);

        checkColision();

        //Display.getInstance().repaint();
    }
}
