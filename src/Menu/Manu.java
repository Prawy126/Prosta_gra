package Menu;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Manu extends JPanel implements MouseListener {
    private Timer time;
    private int x = 0, y = 0;

    public Manu() {
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        addMouseListener(this);
        time = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        time.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 800, 740);
        g.setColor(Color.GREEN);
        g.fillRect(x + 100, y + 100, 100, 100);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Kliknięcie myszy na współrzędnych: " + x + ", " + y);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}