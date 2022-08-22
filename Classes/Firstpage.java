package Classes;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;


public class Firstpage implements ActionListener
{
	static User u = new User("Saif","1234");
	
	JLabel label1, label2,label3, label5;
	ImageIcon i1;
	JButton  btn2, btn3, btn4, btn5, btn6,btn7;
	JPanel p;
	JFrame f;

	public Firstpage() {
		
		Font f1 = new Font("Serif", Font.BOLD,20);
		
		f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Firstpage");
		f.setSize(900, 600);
		f.setLocationRelativeTo(null);
		f.setResizable(false);

		p = new JPanel();
		
		/*login.setLayout(null);
		login.setSize(400,350);
		login.setBackground(new Color(0,0,0,60));//transparent  
		login.setBounds(250,175,400,350);*/

		// icon = new ImageIcon(getClass().getResource("Saif.jpg"));
		i1 = new ImageIcon("w.jpg");
		f.setIconImage(i1.getImage());
		// f.setIconImage(icon.getImage());


		btn4 = new JButton("SIGN UP");
		btn4.setFocusable(false);
		btn4.setBounds(50, 360, 110, 25);
		btn4.setBackground(Color.WHITE);
		btn4.addActionListener(this);

		btn5 = new JButton("LOG IN");
		btn5.setFocusable(false);
		btn5.setBounds(180, 360, 110, 25);
		btn5.setBackground(Color.WHITE);
		btn5.addActionListener(this);

		btn6 = new JButton("Admin Login");
		btn6.setFocusable(false);
		btn6.setBackground(Color.WHITE);
		btn6.setBounds(700, 12, 110, 25);
		btn6.addActionListener(this);
		
		btn7 = new JButton("exit");
		btn7.setFocusable(false);
		btn7.setBackground(Color.WHITE);
		btn7.setBounds(20, 12, 110, 25);
		btn7.addActionListener(this);



		// Answer

		label2 = new JLabel();
		label2.setText("WANT TO BOOK A FLIGHT?");
		label2.setBounds(50, 170, 300, 30);
		label2.setForeground(Color.WHITE);
		label2.setFont(f1);
		p.add(label2);
		
		label3 = new JLabel();
		label3.setText("Login to book a flight");
		label3.setBounds(90, 270, 300, 30);
		label3.setForeground(Color.WHITE);
		label3.setFont(f1);
		p.add(label3);


		label5 = new JLabel();
		label5.setText("");
		label5.setBounds(430, 325, 500, 50);

		p.setLayout(null);
		p.setBackground(new Color(0,0,0,60));
		p.setBounds(500, 80, 350, 400);

		f.add(p);
		p.add(btn4);
		p.add(btn5);
		f.add(btn6);
		f.add(btn7);
		//p.add(label2);
		p.add(label3);
		p.add(label5);


		ImageIcon background_image = new ImageIcon("picture/pexels-lucas-allmann-612877.jpg");

		Image img = background_image.getImage();
		Image temp_img = img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
		background_image = new ImageIcon(temp_img);
		JLabel background = new JLabel("", background_image, JLabel.CENTER);
		background.setBounds(0, 0, 900, 600);
		f.add(background);

		f.setVisible(true);
		// p.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		/*else if (e.getSource() == btn1) {
			new FlightDetails(u);
			f.setVisible(false);
		}*/

		 if(e.getSource()==btn5){
			new Login();
			f.setVisible(false);
		}
		else if(e.getSource() == btn4){
			new Register();
			f.setVisible(false);
		}
		
		else if(e.getSource()== btn6){
			new Admin_login();
			f.setVisible(false);
		}
		
		else if(e.getSource()== btn7){
			System.exit(0);
		}

	}

}