package Manu;

import PingPong.Pingpong;

import javax.swing.*;

public class Main3 {
    public static void main(String[] args){
        JFrame manu = new JFrame("Ping-Pong!!");
        manu.setBounds(300,300,800,740);
        manu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        manu.setResizable(false);
        manu.setVisible(true);
        Manu obraz = new Manu();
        manu.add(obraz);
    }
}
