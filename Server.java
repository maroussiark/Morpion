package net;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;


import view.Table;
public class Server extends ServerSocket{

    public DataOutputStream getDos() {
        return this.dos;
    }

    public void setDos(DataOutputStream dos) {
        this.dos = dos;
    }

    public DataInputStream getDis() {
        return this.dis;
    }

    public void setDis(DataInputStream dis) {
        this.dis = dis;
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

    public Server() throws IOException {
    }

    public Server(DataOutputStream dos, DataInputStream dis) throws IOException{
        this.dos = dos;
        this.dis = dis;
    }
    DataOutputStream dos;
    DataInputStream dis;
    boolean accepted=false;

    public void listenForServerRequest(Socket client,Table tab) {
		try {
			client = this.accept();
			dos = new DataOutputStream(client.getOutputStream());
			dis = new DataInputStream(client.getInputStream());
			tab.setAccepted(true);
			System.out.println("CLIENT HAS REQUESTED TO JOIN, AND WE HAVE ACCEPTED");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    public void initializeServer(Server server,int port,String ip,Table tab) {
		try {
			ServerSocket serverSocket = new ServerSocket(port, 8, InetAddress.getByName(ip));
		} catch (Exception e) {
			e.printStackTrace();
		}
		tab.setYourTurn(true);
		tab.setCircle(false);   
	}
    
}