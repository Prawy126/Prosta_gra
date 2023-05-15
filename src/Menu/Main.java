package Menu;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame menu = new JFrame("Menu");
        menu.setBounds(300,300,800,740);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setResizable(false);
        menu.setVisible(true);
        Manu obraz = new Manu();
        menu.add(obraz);
    }
}
