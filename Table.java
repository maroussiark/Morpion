package view;
import java.awt.image.BufferedImage;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import javax.imageio.ImageIO;

import java.io.DataInputStream;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.Controller;

import java.awt.*;
public class Table extends JPanel{

	public int getWIDTH() {
		return this.WIDTH;
	}

	public void setWIDTH(int WIDTH) {
		this.WIDTH = WIDTH;
	}

	public int getHEIGHT() {
		return this.HEIGHT;
	}

	public void setHEIGHT(int HEIGHT) {
		this.HEIGHT = HEIGHT;
	}

	public BufferedImage getboard1() {
		return this.board1;
	}

	public void setboard1(BufferedImage board1) {
		this.board1 = board1;
	}

	public BufferedImage getwhiteX() {
		return this.whiteX;
	}

	public void setwhiteX(BufferedImage whiteX) {
		this.whiteX = whiteX;
	}

	public BufferedImage getcyanX() {
		return this.cyanX;
	}

	public void setcyanX(BufferedImage cyanX) {
		this.cyanX = cyanX;
	}

	public BufferedImage getwhiteCircle() {
		return this.whiteCircle;
	}

	public void setwhiteCircle(BufferedImage whiteCircle) {
		this.whiteCircle = whiteCircle;
	}

	public BufferedImage getcyanCircle() {
		return this.cyanCircle;
	}

	public void setcyanCircle(BufferedImage cyanCircle) {
		this.cyanCircle = cyanCircle;
	}

	public String[] getSpaces() {
		return this.spaces;
	}

	public void setSpaces(String[] spaces) {
		this.spaces = spaces;
	}

	public boolean isYourTurn() {
		return this.yourTurn;
	}

	public boolean getYourTurn() {
		return this.yourTurn;
	}

	public void setYourTurn(boolean yourTurn) {
		this.yourTurn = yourTurn;
	}

	public boolean isCircle() {
		return this.circle;
	}

	public boolean getCircle() {
		return this.circle;
	}

	public void setCircle(boolean circle) {
		this.circle = circle;
	}

	public boolean isAccepted() {
		return this.accepted;
	}

	public boolean getAccepted() {
		return this.accepted;
	}

	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}

	public boolean iserrorCommunication() {
		return this.errorCommunication;
	}

	public boolean geterrorCommunication() {
		return this.errorCommunication;
	}

	public void seterrorCommunication(boolean errorCommunication) {
		this.errorCommunication = errorCommunication;
	}

	public boolean isWon() {
		return this.won;
	}

	public boolean getWon() {
		return this.won;
	}

	public void setWon(boolean won) {
		this.won = won;
	}

	public boolean isEnemyWon() {
		return this.enemyWon;
	}

	public boolean getEnemyWon() {
		return this.enemyWon;
	}

	public void setEnemyWon(boolean enemyWon) {
		this.enemyWon = enemyWon;
	}

	public boolean isdraw() {
		return this.draw;
	}

	public boolean getdraw() {
		return this.draw;
	}

	public void setdraw(boolean draw) {
		this.draw = draw;
	}

	public int getLengthOfSpace() {
		return this.lengthOfSpace;
	}

	public void setLengthOfSpace(int lengthOfSpace) {
		this.lengthOfSpace = lengthOfSpace;
	}

	public int getErrors() {
		return this.errors;
	}

	public void setErrors(int errors) {
		this.errors = errors;
	}

	public int getFirstSpot() {
		return this.firstSpot;
	}

	public void setFirstSpot(int firstSpot) {
		this.firstSpot = firstSpot;
	}

	public int getSecondSpot() {
		return this.secondSpot;
	}

	public void setSecondSpot(int secondSpot) {
		this.secondSpot = secondSpot;
	}

	public Font getFont() {
		return this.font;
	}

	public void setFont(Font font) {
		this.font = font;
	}

	public Font getSmallerFont() {
		return this.smallerFont;
	}

	public void setSmallerFont(Font smallerFont) {
		this.smallerFont = smallerFont;
	}

	public Font getLargerFont() {
		return this.largerFont;
	}

	public void setLargerFont(Font largerFont) {
		this.largerFont = largerFont;
	}

	public String getWaitingText() {
		return this.waitingText;
	}

	public void setWaitingText(String waitingText) {
		this.waitingText = waitingText;
	}

	public String geterrorCommunicationText() {
		return this.errorCommunicationText;
	}

	public void seterrorCommunicationText(String errorCommunicationText) {
		this.errorCommunicationText = errorCommunicationText;
	}

	public String getwonText() {
		return this.wonText;
	}

	public void setwonText(String wonText) {
		this.wonText = wonText;
	}

	public String getlooseText() {
		return this.looseText;
	}

	public void setlooseText(String looseText) {
		this.looseText = looseText;
	}

	public String getdrawText() {
		return this.drawText;
	}

	public void setdrawText(String drawText) {
		this.drawText = drawText;
	}

	public int[][] getWins() {
		return this.wins;
	}

	public void setWins(int[][] wins) {
		this.wins = wins;
	}
    int WIDTH=506;
    int HEIGHT=527;

    BufferedImage board1;
	BufferedImage whiteX;
	BufferedImage cyanX;
	BufferedImage whiteCircle;
	BufferedImage cyanCircle;
    String[] spaces = new String[9];
    
    boolean yourTurn = false;
	boolean circle = true;
	boolean accepted = false;
	boolean errorCommunication = false;
	boolean won = false;
	boolean enemyWon = false;
	boolean draw = false;

	int lengthOfSpace = 160;
	int errors = 0;
	int firstSpot = -1;
	int secondSpot = -1;

    
	Font font = new Font("Calibri", Font.BOLD, 32);
	Font smallerFont = new Font("Calibri", Font.BOLD, 25);
	Font largerFont = new Font("Calibri", Font.BOLD, 50);

    String waitingText = "Waiting for another player";
	String errorCommunicationText = "Unable to communicate with opponent.";
	String wonText = "You won!";
	String looseText = "You loose!";
	String drawText = "draw.";

    int[][] wins = new int[][] { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 }, { 0, 4, 8 }, { 2, 4, 6 } };

    private void render(Graphics g) {
		g.drawImage(board1, 0, 0, null);
		if (errorCommunication) {
			g.setColor(Color.RED);
			g.setFont(smallerFont);
			Graphics2D g2 = (Graphics2D) g;
			g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			int stringWidth = g2.getFontMetrics().stringWidth(errorCommunicationText);
			g.drawString(errorCommunicationText, WIDTH / 2 - stringWidth / 2, HEIGHT);
			return;
		}

		if (accepted) {
			for (int i = 0; i < spaces.length; i++) {
				if (spaces[i] != null) {
					if (spaces[i].equals("X")) {
						if (circle) {
							g.drawImage(whiteX, (i % 3) * lengthOfSpace + 10 * (i % 3), (int) (i / 3) * lengthOfSpace + 10 * (int) (i / 3), null);
						} else {
							g.drawImage(cyanX, (i % 3) * lengthOfSpace + 10 * (i % 3), (int) (i / 3) * lengthOfSpace + 10 * (int) (i / 3), null);
						}
					} else if (spaces[i].equals("O")) {
						if (circle) {
							g.drawImage(cyanCircle, (i % 3) * lengthOfSpace + 10 * (i % 3), (int) (i / 3) * lengthOfSpace + 10 * (int) (i / 3), null);
						} else {
							g.drawImage(whiteCircle, (i % 3) * lengthOfSpace + 10 * (i % 3), (int) (i / 3) * lengthOfSpace + 10 * (int) (i / 3), null);
						}
					}
				}
			}
			if (won || enemyWon) {
				Graphics2D g2 = (Graphics2D) g;
				g2.setStroke(new BasicStroke(10));
				g.setColor(Color.BLACK);
				g.drawLine(firstSpot % 3 * lengthOfSpace + 10 * firstSpot % 3 + lengthOfSpace / 2, (int) (firstSpot / 3) * lengthOfSpace + 10 * (int) (firstSpot / 3) + lengthOfSpace / 2, secondSpot % 3 * lengthOfSpace + 10 * secondSpot % 3 + lengthOfSpace / 2, (int) (secondSpot / 3) * lengthOfSpace + 10 * (int) (secondSpot / 3) + lengthOfSpace / 2);

				g.setColor(Color.RED);
				g.setFont(smallerFont);
				if (won) {
					int stringWidth = g2.getFontMetrics().stringWidth(wonText);
					g.setColor(Color.cyan);
					g.drawString(wonText, WIDTH / 2 - stringWidth / 2, HEIGHT);
				} else if (enemyWon) {
					int stringWidth = g2.getFontMetrics().stringWidth(looseText);
					g.setColor(Color.white);
					g.drawString(looseText, WIDTH / 2 - stringWidth / 2, HEIGHT);	
				}
			}
			else if (draw) {
				Graphics2D g2 = (Graphics2D) g;
				g.setColor(Color.BLACK);
				g.setFont(smallerFont);
				int stringWidth = g2.getFontMetrics().stringWidth(drawText);
				g.drawString(drawText, WIDTH / 2 - stringWidth / 2, HEIGHT);
			}
		} else {
			g.setColor(Color.BLACK);
			g.setFont(font);
			Graphics2D g2 = (Graphics2D) g;
			g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			int stringWidth = g2.getFontMetrics().stringWidth(waitingText);
			g.drawString(waitingText, WIDTH / 2 - stringWidth / 2, HEIGHT );
		}

	}
    public void loadImages() {
		try {
			board1 = ImageIO.read(getClass().getResourceAsStream("/img/board1.png"));
			whiteX = ImageIO.read(getClass().getResourceAsStream("/img/whiteX.png"));
			whiteCircle = ImageIO.read(getClass().getResourceAsStream("/img/whiteCircle.png"));
			cyanX = ImageIO.read(getClass().getResourceAsStream("/img/cyanX.png"));
			cyanCircle = ImageIO.read(getClass().getResourceAsStream("/img/cyanCircle.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public Table() {
		setFocusable(true);
		requestFocus();
		setBackground(Color.lightGray);
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		render(g);
	}
	public void checkForEnemyWin() {
		for (int i = 0; i < wins.length; i++) {
			if (circle) {
				if (spaces[wins[i][0]] == "X" && spaces[wins[i][1]] == "X" && spaces[wins[i][2]] == "X") {
					firstSpot = wins[i][0];
					secondSpot = wins[i][2];
					enemyWon = true;
				}
			} else {
				if (spaces[wins[i][0]] == "O" && spaces[wins[i][1]] == "O" && spaces[wins[i][2]] == "O") {
					firstSpot = wins[i][0];
					secondSpot = wins[i][2];
					enemyWon = true;
				}
			}
		}
	}
	public void checkFordraw() {
		for (int i = 0; i < spaces.length; i++) {
			if (spaces[i] == null) {
				return;
			}
		}
		if(!won || !enemyWon){
			draw = true;
		}else{
			draw=false;
		}
	}
	
	public void checkForWin() {
		for (int i = 0; i < wins.length; i++) {
			if (circle) {
				if (spaces[wins[i][0]] == "O" && spaces[wins[i][1]] == "O" && spaces[wins[i][2]] == "O") {
					firstSpot = wins[i][0];
					secondSpot = wins[i][2];
					won = true;
				}
			} else {
				if (spaces[wins[i][0]] == "X" && spaces[wins[i][1]] == "X" && spaces[wins[i][2]] == "X") {
					firstSpot = wins[i][0];
					secondSpot = wins[i][2];
					won = true;
				}
			}
		}
	}
	public void receive(DataInputStream dis) {
		if (errors >= 10) errorCommunication = true;

		if (!yourTurn && !errorCommunication) {
			try {
				int space = dis.readInt();
				if (circle) spaces[space] = "X";
				else spaces[space] = "O";
				checkForEnemyWin();
				checkFordraw();
				yourTurn = true;
			} catch (IOException e) {
				e.printStackTrace();
				errors++;
			}
		}
	}
}