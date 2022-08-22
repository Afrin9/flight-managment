package Classes;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;


public class Ticket_Dtails implements ActionListener
{	
	
	JFrame f;
	JLabel l1,l2,l3,l4,l5,l6,l7,l0;
	JComboBox Jbox1,Jbox2,Jbox3,Jbox4,Jbox5,Jbox6,Jbox7, Jbox8;
	JButton b1,b4,b5,b2;
	JLabel l12;
	JTextField g1;
	
	Ticket_Dtails()
	{
		f = new JFrame();
		l12 = new JLabel();
		l12.setBounds(0,0,700,500);
		
		b5 = new JButton("PREVIOUS");  
        b5.setBounds(290,490,110,25);
        b5.setBackground(Color.WHITE);		
        b5.addActionListener(this);
		
		b2 = new JButton("EXIT");  
        b2.setBounds(20, 12, 110, 25); 
        b2.setBackground(Color.WHITE);		
        b2.addActionListener(this);
		
		b4 = new JButton("NEXT");  
        b4.setBounds(430,490,77,25); 
        b4.setBackground(Color.WHITE);		
        b4.addActionListener(this);
		
		String[] str1 = { "Dhaka", "Syllet", "chittagong","Rajshahi" };
		Jbox1 = new JComboBox(str1);
		Jbox1.setBounds(350, 120, 190, 30);
		Jbox1.setBackground(Color.WHITE);
		f.add(Jbox1);
		
		String[] str2 = { "Nepal ", "Thiland", "Japan","Bhutan", "China","India" };
		Jbox2 = new JComboBox(str2);
		Jbox2.setBounds(350, 170, 190, 30);
		Jbox2.setBackground(Color.WHITE);
		f.add(Jbox2);
		
		String[] str3 = { "A1", "A2","A3", "A4","B1", "B2","B3", "B4","C1", "C2","C3", "C4","D1", "D2","D3", "D4","E1", "E2","E3", "E4","F1", "F2","F3", "F4" };
		Jbox3 = new JComboBox(str3);
		Jbox3.setBounds(350, 370, 110, 30);
		Jbox3.setBackground(Color.WHITE);
		f.add(Jbox3);
		
		String[] str4 = { "First class", "Economy class","Business class" };
		Jbox4 = new JComboBox(str4);
		Jbox4.setBounds(350, 270, 190, 30);
		Jbox4.setBackground(Color.WHITE);
		f.add(Jbox4);
		
		String[] str5 = { "1", "2","3","4","5", "6", "7","8"};
		Jbox8 = new JComboBox(str5);
		Jbox8.setBounds(350, 320, 190, 30);
		Jbox8.setBackground(Color.WHITE);
		f.add(Jbox8);
		
		//date
		String[] str7 = {"9 September", "10 September", "11 September", "12 September", "13 September", "14 September", "15 September", "16 September", "17 September", "18 September"};
		Jbox7 = new JComboBox(str7);
		Jbox7.setBounds(350, 220, 70, 30);
		Jbox7.setBackground(Color.WHITE);
		f.add(Jbox7);

		// UtilDateModel model = new UtilDateModel();
		// JDatePanelImpl datePanel = new JDatePanelImpl(model);
		// JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
		// model.setSelected(true);
		// datePicker.setBounds(350,220,70,30);
 
		// f.add(datePicker);
		
		
		
		l1 = new JLabel("From");
		l1.setBounds(220, 120, 190, 30);
		l1.setForeground(Color.WHITE);
		
		l2 = new JLabel("To");
		l2.setBounds(220, 170, 190, 30);
		l2.setForeground(Color.WHITE);
		
		l3 = new JLabel("Date");
		l3.setBounds(220, 220, 190, 30);
		l3.setForeground(Color.WHITE);
		
		l4 = new JLabel("Cebin Class");
		l4.setBounds(220, 270, 190, 30);
		l4.setForeground(Color.WHITE);
		
		l5 = new JLabel("Passangers ");
		l5.setBounds(220, 320, 190, 30);
		l5.setForeground(Color.WHITE);
		
		l7 = new JLabel(" Seat number ");
		l7.setBounds(220, 370, 190, 30);
		l7.setForeground(Color.WHITE);
		
		l0 = new JLabel("");
		l0.setBounds(220, 420, 190, 30);
		l0.setForeground(Color.WHITE);
		
		f.add(b5);
		f.add(b4);
		f.add(b2);
		f.add(l12);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l7);
		f.add(l0);
				
		f.setSize(900,600);
		f.setTitle("Ticket_Dtails");
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon background_image = new ImageIcon("picture/pexels-adrien-olichon-2387819.jpg");

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
			new Home();
			
		}
		
		else if(e.getSource()==b4)//next
		{
			if ((Jbox1.getSelectedIndex()) == 0) {
				JOptionPane.showMessageDialog(null, "Please input all information.", "Warning!",
						JOptionPane.WARNING_MESSAGE);
			} else if ((Jbox2.getSelectedIndex()) == 0) {
				JOptionPane.showMessageDialog(null, "Please input all information.", "Warning!",
						JOptionPane.WARNING_MESSAGE);
			} else if ((Jbox3.getSelectedIndex()) == 0) {
				JOptionPane.showMessageDialog(null, "Please input all information.", "Warning!",
						JOptionPane.WARNING_MESSAGE);
			} else if ((Jbox4.getSelectedIndex()) == 0) {
				JOptionPane.showMessageDialog(null, "Please input all information.", "Warning!",
						JOptionPane.WARNING_MESSAGE);
			} else if ((Jbox8.getSelectedIndex()) == 0) {
				JOptionPane.showMessageDialog(null, "Please input all information.", "Warning!",
						JOptionPane.WARNING_MESSAGE);
			} else if ((Jbox7.getSelectedIndex()) == 0) {
				JOptionPane.showMessageDialog(null, "Please input all information.", "Warning!",
						JOptionPane.WARNING_MESSAGE);
			} 
			
			f.setVisible(false);
			new User_Dtails();
			
		}
		else if(e.getSource()==b2)//exit
		{
			System.exit(0);
		}
		
	}
}