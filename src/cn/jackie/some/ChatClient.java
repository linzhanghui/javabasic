package cn.jackie.some;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class ChatClient extends Frame{
	Socket s=null;
	DataOutputStream dos;
	
	TextField tfTxt = new TextField();
	TextArea taContent = new TextArea();
	
	public static void main(String[] args){
		new ChatClient().launchFrame();
	}
	
	public void launchFrame() {
		setLocation(400,300);
		this.setSize(300,300);
		add(tfTxt, BorderLayout.SOUTH);
		add(taContent,BorderLayout.NORTH);
		pack();
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent arg0){
				disconnect();
				setVisible(false);
			}
		});
		tfTxt.addActionListener(new TFListener());
		setVisible(true);
		connect();
	}
	
	public void connect(){
		try{
			s = new Socket("127.0.0.1",8888);
			dos = new DataOutputStream(s.getOutputStream());
System.out.println("connected");
		} catch (UnknownHostException e){
			e.printStackTrace();
		}
		 catch (IOException e){
			e.printStackTrace();
		}
		System.out.println("Client closed");
	}
	
	public void disconnect() {
		try {
			dos.close();
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private class TFListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String str = tfTxt.getText().trim();
			taContent.setText(str);
			tfTxt.setText("");
			
			try{
				
//				DataOutputStream dos = new DataOutputStream(s.getOutputStream());
				dos.writeUTF(str);
				dos.flush();
//				dos.close();
			}catch(IOException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	
}

