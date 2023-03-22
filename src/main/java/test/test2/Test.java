package test.test2;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Affi affi = new Affi();


        frame.getContentPane().add(affi);
        frame.pack();
        frame.setVisible(true);

        Graphics2D g2 = (Graphics2D) affi.getGraphics();
        g2.setColor(Color.BLACK);
        g2.fillRect(50, 50, 10, 10);
        //affi.repaint();
    }
}

class Affi extends JPanel{
    protected int size;
    protected int posX, posY;
    protected int speedX, speedY;

    public Affi(){
        setBorder(BorderFactory.createLineBorder(Color.black));
        setSize(new Dimension(200, 200));
        setPreferredSize(new Dimension(200, 200));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Graphics2D g2 = (Graphics2D) g;

        //g2.fillOval(10, 10, 10, 10);
    }
}