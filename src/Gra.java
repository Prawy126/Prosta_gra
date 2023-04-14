import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Gra extends JPanel implements KeyListener, ActionListener{
    //stała pozycji początkowej
    private int x = 300,y =470, poruszanie = 20;
    private Timer time;

    public Gra(){
        //ustawienie czasu odświeżania gry
        time = new Timer(10,this);
        time.start();

        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        //śledzenie jaki klawisz nacisnął użytkonik
        addKeyListener(this);
    }
    //rysowanie sceny
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0,0,700,600);
        g.setColor(Color.CYAN);
        g.fillRect(x,y,50,50);
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
        //sterowanie
        if(e.getKeyCode() == KeyEvent.VK_A){
            this.x-=poruszanie;
            System.out.println(x);
            if(x <= 0){
                x = 0;
            }else{
                x-=poruszanie;
            }
            //odświeżanie ekranu, rysowanie aktualnej planczy
            repaint();
        }if(e.getKeyCode() == KeyEvent.VK_D){

            System.out.println(x);
            if(x ==600){
                x = 600;
            }else{
                x+=poruszanie;
            }
            //odświeżanie ekranu, rysowanie aktualnej planczy
            repaint();
        }if(e.getKeyCode() == KeyEvent.VK_S){

            System.out.println(x);
            //odświeżanie ekranu, rysowanie aktualnej planczy
            if(y <=0){
                y = 0;
            }else{
                y+=poruszanie;
            }
            repaint();
        }if(e.getKeyCode() == KeyEvent.VK_W){

            if(y > 600){
                y = 600;
            }else{
                y-=poruszanie;
            }
            //odświeżanie ekranu, rysowanie aktualnej planczy
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
