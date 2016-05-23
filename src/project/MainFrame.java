package project;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JPanel contentPane2;
	private JPanel contentPane3;

	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		frame.setVisible(true);

	}

	public MainFrame()
	{
		super("Mafia Game");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setSize(1000,600);
		setBounds(200, 50, 1000, 600);;
		setVisible(true);
		setLayout(null);

		//** 1�� �г� . ����ڵ��� ĳ���Ϳ� ID ��Ÿ���� Ŭ�������� ��ǥ�Ǵ� ��� ���� **//
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		contentPane.setBounds(10, 10, 400, 535);
		contentPane.setBackground(new Color(130, 35, 35));
		add(contentPane);

		//** 2�� �г� . ���� �������� �ڽ� 3�� ���� �ϳ��� ���� **//
		contentPane2 = new JPanel();
		contentPane2.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane2.setBounds(415, 10, 180, 535);
		contentPane2.setBackground(new Color(230, 135, 135));
		contentPane2.setLayout(null);
		add(contentPane2);

		JTextPane current_status = new JTextPane();
		current_status.setText(
				"��������" + "\n\n" +
						"�ڹ� ���α׷��ֹ� ������" + "\n" +
						"�� �԰� �սô�" + "\n" +
						"������ ����ؼ� �Ḣ�� �����ڰ� �Ǳ⸦ �������� �ٶ��ϴ�..." + "\n" +
						"ȭ����!!!!!" + "\n\n" +
						"��׸�~~"  
				);
		current_status.setEditable(false);
		//current_status.setBounds(420, 15, 165, 200);
		JScrollPane current_status_scroll = new JScrollPane(current_status);
		current_status_scroll.setBounds(6, 5, 165, 180);
		contentPane2.add(current_status_scroll);

		JTextPane my_info = new JTextPane();
		my_info.setText(
				"���� : ���Ǿ� \n\n"
				+"ĳ���� : ��ī��\n\n"
						+"id : player1"
				);
		
		my_info.setEditable(false);
		JScrollPane my_info_scroll = new JScrollPane(my_info);
		my_info_scroll.setBounds(6, 190, 165, 130);
		contentPane2.add(my_info_scroll);
		
		String[] player = {"abs","ccsdf","player3","4","5"};
		JList userlist = new JList<>(player);
		System.out.println(player.length);		

		JScrollPane scroll = new JScrollPane(userlist);
		scroll.setBounds(6,325,165,140);
		contentPane2.add(scroll);
		
		JLabel img = null;
		ImageIcon img2 ;
		try {
			img = new JLabel(new ImageIcon(ImageIO.read(new File("123.png"))));
			img2 = new ImageIcon(ImageIO.read(new File("123.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//img.setSize(10, 10);
		
		img.setBounds(10, 10,  100, 100);
		contentPane.add(img);
		
		img.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("123");
			}
		});;
		/*
		contentPane3 = new JPanel();
		contentPane3.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane3.setBounds(600, 10, 375, 535);
		//contentPane3.setBackground(new Color(100, 100, 100));
		add(contentPane3);
		*/
		
		JTextPane System_message = new JTextPane();	//settext�ȿ� string ���� �ָ鼭 �ϸ� �ɵ�?
		System_message.setText(
				"System Message :               		                        \n\n"+
				"���� ���۵Ǿ����ϴ� \n\n"
				+"���Ǿư� player1�� �׿����ϴ�                                \n\n"
						+"���� �Ǿ����ϴ�"
				);
		//System_message.setBounds(6, 5, 600, 330);
		System_message.setEditable(false);
		JScrollPane System_message_scroll = new JScrollPane(System_message);
		
		System_message_scroll.setBounds(603, 10, 370, 190);
		
		add(System_message_scroll);
		
		JTextArea chatting = new JTextArea();
		JScrollPane chatting_scroll = new JScrollPane(chatting);
		//chatting.setBounds(6, 340, 360, 300);
		chatting_scroll.setBounds(603, 205, 370, 300);
		add(chatting_scroll);
		
	}

}
