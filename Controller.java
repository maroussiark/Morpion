package controller;
import java.awt.event.MouseListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import game.Game;

import java.awt.Toolkit;


import view.Table;

import java.awt.event.MouseEvent;
public class Controller implements MouseListener{
    Table tab;
    DataOutputStream dos;
    Socket client;
    Game game;
    public Controller(Table table,Game game){
        this.tab=table;
        table.addMouseListener(this);
        this.game=game;
    }
    
	public void mouseClicked(MouseEvent e) {
			if (tab.getAccepted()) {
				if (tab.getYourTurn() && !tab.geterrorCommunication() && !tab.getWon() && !tab.getEnemyWon()) {
					int x = e.getX() / tab.getLengthOfSpace();
					int y = e.getY() / tab.getLengthOfSpace();
					y *= 3;
					int position = x + y;

					if (tab.getSpaces()[position] == null) {
						if (!tab.getCircle()) tab.getSpaces()[position] = "X";
						else tab.getSpaces()[position] = "O";
                        tab.setYourTurn(false);
						tab.repaint();
						Toolkit.getDefaultToolkit().sync();

						try {
                            game.send(position);
						} catch (IOException e1) {
                            tab.setErrors(tab.getErrors()+1);
							e1.printStackTrace();
						}

						System.out.println("DATA WAS SENT");
						tab.checkForWin();
						tab.checkFordraw();

					}
				}
			}
	}

    
    public void mousePressed(MouseEvent e) {

    }

    
    public void mouseReleased(MouseEvent e) {

    }

    
    public void mouseEntered(MouseEvent e) {

    }

    
    public void mouseExited(MouseEvent e) {

    }

}

