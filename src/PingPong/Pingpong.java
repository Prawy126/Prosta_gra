package PingPong;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Pingpong  extends JPanel implements KeyListener, ActionListener {
    //podstawowe parametry
    private int pilkaX = 0 , pilkaY = 5,gracz1X = 200, gracz1Y = 0;
    public Pingpong(){
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        addKeyListener(this);
        //uruchomienie gry
        Timer time = new Timer(10, this);
        time.start();
    }
    public void paint(Graphics g){
        //stworzenie planszy
        g.setColor(Color.BLACK);
        g.fillRect(0,0,2000,2000);
        //piłka
        g.setColor(Color.CYAN);
        g.fillRect(pilkaX,pilkaY,10,10);
        //paletka 1
        g.setColor(Color.red);
        g.fillRect(gracz1X,gracz1Y, 40,5);
        //paletka 2
        g.setColor(Color.BLUE);
        g.fillRect(0,650,40,5);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //odświeżanie planszy
        repaint();
        pilkaY++;
        System.out.println(pilkaY);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //ruch czerwonej paletki
        if(e.getKeyCode() == KeyEvent.VK_A){
            if(gracz1X>0)gracz1X-=5;
            else gracz1X = 0;
        }
        if(e.getKeyCode() == KeyEvent.VK_D){
            if(gracz1X<750)gracz1X+=5;
            else gracz1X = 750;
        }
    }



    @Override
    public void keyReleased(KeyEvent e) {

    }
}
