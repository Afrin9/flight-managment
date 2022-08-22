package Classes;

import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Admin_login{  
    
	private JButton lgnBtn;
    //private JButton signBtn;
    private JButton exBtn;
    private JLabel lusn;
    private JLabel lpass;
    private JTextField uname;
    private JPasswordField upass;
    private ImageIcon i1;
	JFrame frame;
	
	//ASSOCIATION WITH USER CLASS
	Admin_user u1= new Admin_user("Mazid", "1234");
	Admin_user u2= new Admin_user("ABCD", "9876");
	Admin_user users[];
	
    Admin_login(){  

		users = new Admin_user[4];
		users[0] = u1;
		users[1] = u2;
		
        //create frame
		frame = new JFrame ("System");
        //construct components
        lgnBtn = new JButton ("Login");
		lgnBtn.setBackground(Color.WHITE);	
        // signBtn = new JButton ("Sign Up");
		// signBtn.setBackground(Color.WHITE);	
        exBtn = new JButton ("Exit");
		exBtn.setBackground(Color.WHITE);	
        lusn = new JLabel ("Username:");
        lpass = new JLabel ("Password:");
        uname = new JTextField ();
        upass = new JPasswordField ();
        i1 = new ImageIcon("download.png");

        lusn.setForeground(new Color (230, 238, 250));
        lpass.setForeground(new Color (230, 238, 250));
		
        lusn.setFont(new Font("Default",Font.BOLD,17));
        lpass.setFont(new Font("Default",Font.BOLD,17));
        
		//set component bounds (only needed by Absolute Positioning)
        lgnBtn.setBounds (350, 185, 100, 30);
        //signBtn.setBounds (505, 185, 100, 30);
        exBtn.setBounds (405, 235, 140, 30);
        lusn.setBounds (350, 105, 100, 25);
        lpass.setBounds (350, 145, 100, 25);
        uname.setBounds (505, 105, 100, 25);
        upass.setBounds (505, 145, 100, 25);
		
		
		//addActionListener
		// lgnBtn.addActionListener(this);
		// exBtn.addActionListener(this);

        //add components
        frame.add (lgnBtn);
        //frame.add (signBtn);
        frame.add (exBtn);
        frame.add (lusn);
        frame.add (lpass);
        frame.add (uname);
        frame.add (upass);

        
		
		//frame properties
		//adjust size and set layout
        frame.setSize (900, 600);
		frame.setLocationRelativeTo(null);//to center screen gui
        frame.setLayout (null);
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		ImageIcon background_image = new ImageIcon("picture/pexels-adrien-olichon-2387532.jpg");

		Image img = background_image.getImage();
		Image temp_img = img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
		background_image = new ImageIcon(temp_img);
		JLabel background = new JLabel("", background_image, JLabel.CENTER);
		background.setBounds(0, 0, 900, 600);
		frame.add(background);
        frame.setVisible (true); 

		lgnBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae){
				if(ae.getSource()==lgnBtn)
		{  
			String user = uname.getText();
			String pass = upass.getText();
			
			int flag = 0;
			
			if(user.isEmpty()==false && pass.isEmpty()==false)
			{
				for(int i = 0; i<users.length; i++)
				{
					if(users[i]!=null)
					{
						if(user.equals(users[i].getUsername1()) && pass.equals(users[i].getPassword1()))
						{
							flag = 1;
							break;
							// new Admindashboard();
							// frame.setVisible(false);
						}
					}
				}
				if (flag == 1)
				{
					new Admindashboard();
					frame.setVisible(false);
				}
				else
				{
					showMessageDialog(null, "Invalid Username or password!");
				}
			}
			else
			{
				showMessageDialog(null,"Fill up each field.");
			}
			
        }  
		}
	});

		exBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae){
				System.exit(0);
			}});

    }         
    
} 
