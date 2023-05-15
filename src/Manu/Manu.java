package Manu;

import ProstaGra.Gra;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Time;

public class Manu extends JPanel implements KeyListener, ActionListener, MouseListener {

    private Timer time;
    private int x=100, y=50;

    public Manu(){
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        addKeyListener(this);
        //uruchomienie gry
        time = new Timer(10, this);
        time.start();
    }

    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(0,0,800,800);
        g.setColor(Color.CYAN);
        g.fillRect(x,y,100,100);
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

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = getX();
        int y = getY();
        System.out.println("X: " + x + " Y: " + y);
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
