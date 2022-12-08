package net;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.InetAddress;

import view.Table;
public class Client extends Socket{
    DataOutputStream dos;
    DataInputStream dis;
    boolean accepted=false;
    

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
    public Client(){
    }
    public Client( DataOutputStream dos, DataInputStream dis){
        this.dos=dos;
        this.dis=dis;
    }
    
}