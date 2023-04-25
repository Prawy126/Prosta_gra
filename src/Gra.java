import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Gra extends JPanel implements KeyListener, ActionListener {
    private int x = 300, y = 470, poruszanie = 20;
    private Timer time;
    private int ex = 10, ey = 10;
    private Random liczba = new Random();
    private int wrogX1 = liczba.nextInt(6)*50;
    private int wrogX2 = liczba.nextInt(6)*50;
    private int wrogY1 = liczba.nextInt(6)*50;
    private int wrogY2 = liczba.nextInt(6)*50;
    public Gra() {
        time = new Timer(10, this);
        time.start();

        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        addKeyListener(this);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 700, 600);
        //gracz
        g.setColor(Color.CYAN);
        g.fillRect(x, y, 50, 50);
        //wróg
        g.setColor(Color.RED);
        g.fillRect(wrogX1,ey,60,50);
        g.fillRect(wrogX2,ey,60,50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        ey+=2;
        Rectangle gracz = new Rectangle(x,475,50,50);
        Rectangle wrog1 = new Rectangle(wrogX1, ey, 60,50);
        Rectangle wrog2 = new Rectangle(wrogX2, ey, 60,50);
        if(gracz.intersects(wrog1)||gracz.intersects(wrog2)){
            System.out.println("dotyka");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            if (x > 0) {
                x -= poruszanie;
            }
            repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            if (x < 650) {
                x += poruszanie;
            }
            repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            if (y < 550) {
                y += poruszanie;
            }
            repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_W) {
            if (y > 0) {
                y -= poruszanie;
            }
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
