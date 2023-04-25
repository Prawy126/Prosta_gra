import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Gra extends JPanel implements KeyListener, ActionListener {
    private int x = 300, y = 470, poruszanie = 20;
    private Timer time;

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
        g.setColor(Color.CYAN);
        g.fillRect(x, y, 50, 50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
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
