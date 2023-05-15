package Menu;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Manu extends JPanel implements KeyListener, ActionListener,MouseListener {
    private Timer time;
    private int x = 0, y = 0;
    public Manu(){
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        addKeyListener(this);
        time = new Timer(10, this);
        time.start();
    }

    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(x,y,800,740);
        g.setColor(Color.GREEN);
        g.fillRect(x+100,y+100,100,100);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        // Obsługa kliknięcia myszy
        int x = e.getX(); // Pobranie położenia X kliknięcia
        int y = e.getY(); // Pobranie położenia Y kliknięcia
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

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
