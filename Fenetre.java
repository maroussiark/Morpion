package view;

import javax.swing.JFrame;

public class Fenetre extends JFrame{
    int WIDTH=506;
    int HEIGHT=570;
    public Fenetre(Table painter){
		this.setTitle("Tic-Tac-Toe");
		this.setContentPane(painter);
		this.setSize(WIDTH, HEIGHT);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
    }
}