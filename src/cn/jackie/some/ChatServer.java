package cn.jackie.some;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	public static void main(String[] args) {
		boolean started = false;
		ServerSocket ss = null;
		Socket s = null;
		DataInputStream dis = null;
		try {
			ss = new ServerSocket(8888);
		}catch(IOException e) {
			e.printStackTrace();
		}
		try{
			started = true;
			while(started){
				boolean bConnected = false;
				s = ss.accept();
				System.out.println("a client connected！");
				bConnected = true;
				dis = new DataInputStream(s.getInputStream());
				while(bConnected){
					String str = dis.readUTF();
					System.out.println(str);
				}
				dis.close();
			}
		} catch (Exception e) {
			try{
				s.close();
			} catch (IOException e1){
				e1.printStackTrace();
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
