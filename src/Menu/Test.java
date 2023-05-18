package Menu;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args){
        JFrame frame = new JFrame("MouseListener Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);

        Manu manu = new Manu();
        panel.addMouseListener(manu);
        manu.addMouseListener(manu);
        frame.add(manu);
        frame.setVisible(true);
    }
}
