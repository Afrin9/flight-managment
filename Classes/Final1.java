package Classes;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Final1 implements ActionListener
{	
	//static User u;
	
	JFrame f;
	
	JButton b5,b6;
	JLabel l1;
	
	Final1()
	{
	   //u = a;
		
		f = new JFrame();
		l1 = new JLabel();
		l1.setBounds(0,0,700,500);
		
		b5 = new JButton("Previous");  
        b5.setBounds(350,400,110,25);
b5.setBackground(Color.WHITE);		
        b5.addActionListener(this);
		
		b6 = new JButton("Exit");  
        b6.setBounds(500,400,77,25);
b6.setBackground(Color.WHITE);		
        b6.addActionListener(this);
		
		f.add(b5);
		f.add(b6);
		f.add(l1);
				
		f.setSize(900,600);
		f.setTitle("Final page");
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon background_image = new ImageIcon("picture/pexels-lucas-allmann-612877.jpg");

		Image img = background_image.getImage();
		Image temp_img = img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
		background_image = new ImageIcon(temp_img);
		JLabel background = new JLabel("", background_image, JLabel.CENTER);
		background.setBounds(0, 0, 900, 600);
		f.add(background);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b5)
		{f.setVisible(false);
			new Payment_Dtails();
			
		}
		
		if(e.getSource()==b6)
		{System.exit(0);
			
		}
	}
}