package game;

import java.util.Scanner;

import controller.Controller;
import net.Client;
import net.Server;
import java.awt.*;
import java.net.ServerSocket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.InetAddress;

import view.Fenetre;
import view.Table;

public class Game implements Runnable{
    Thread thread;
    Table tab;
    ServerSocket server;
    Socket client;
    DataOutputStream dos;
    DataInputStream dis;

    public Game(){
        String ip = "localhost";
	    int port = 22222;

	    Scanner scanner = new Scanner(System.in);

        System.out.println("Please input the IP: ");

		ip = scanner.nextLine();

		System.out.println("Please input the port: ");

		port = scanner.nextInt();
		while (port < 1 || port > 65535) {
			System.out.println("The port you entered was invalid, please input another port: ");
			port = scanner.nextInt();
		}
        try {
            dos=new DataOutputStream(client.getOutputStream());
            dis=new DataInputStream(client.getInputStream());
        } catch (Exception e) {
            // TODO: handle exception
        }

        tab=new Table();
        if(!connect(ip, port,tab))initializeServer(ip,port,tab);
    
        tab.loadImages();
        Fenetre fen=new Fenetre(tab);
		tab.setPreferredSize(new Dimension(fen.getWidth(), fen.getHeight()));
        
        Controller controller=new Controller(tab, this);

        thread = new Thread(this, "TicTacToe");
		thread.start();
        
    }
    public static void main(String[] args) {
        new Game();      
    }
    @Override
    public void run() {
        while (true) {
            try {
                tab.receive(dis);
                tab.repaint();
                
            } catch (Exception e) {
                // TODO: handle exception
            }

			if (!tab.getCircle() && !tab.getAccepted()) {
				listenForServerRequest(tab);
			}

		}       
    }
    public boolean connect(String ip,int port,Table tab) {
		try {
            client=new Socket(ip, port);
			dos = new DataOutputStream(client.getOutputStream());
			dis = new DataInputStream(client.getInputStream());
			tab.setAccepted(true);
		} catch (IOException e) {
			System.out.println("Unable to connect to the address: " + ip + ":" + port + " | Starting a server");
			return false;
		}
		System.out.println("Successfully connected to the server.");
		return true;
	}
    public void initializeServer(String ip,int port,Table tab) {
		try {
			server = new ServerSocket(port, 8, InetAddress.getByName(ip));
		} catch (Exception e) {
			e.printStackTrace();
		}
		tab.setYourTurn(true);
		tab.setCircle(false);   
	}
    public void listenForServerRequest(Table tab) {
		try {
			client = server.accept();
			dos = new DataOutputStream(client.getOutputStream());
			dis = new DataInputStream(client.getInputStream());
			tab.setAccepted(true);
			System.out.println("CLIENT HAS REQUESTED TO JOIN, AND WE HAVE ACCEPTED");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    public void send(int p)throws IOException{
        dos.writeInt(p);
		dos.flush();
    }
}