package Classes;

import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import java.awt.*;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;


public class Login implements ActionListener
{
	static User users[] = new User [500];
	
	static User u;
	
	JFrame f;
	
	JLabel l1, l2, l3;
	
	JTextField tf;
	
	JPasswordField pf;
	
	JButton b1, b2, b3, b4,b5;
	
	public Login()
	{
		
		f= new JFrame(); 
        
		l1 = new JLabel("Username:");
		l1.setForeground(Color.WHITE);
		l1.setBounds(295,170,100,30);

		l2 = new JLabel("Password:");
		l2.setForeground(Color.WHITE);
		l2.setBounds(297,196,100,30); 		
		
		l3 = new JLabel();
		l3.setBounds(213,20,400,400);	
		
        tf = new JTextField();  
        tf.setBounds(376,176,160,23);  
		
		pf = new JPasswordField();  
        pf.setBounds(376,202,160,23); 
          
        b1 = new JButton("Login");  
        b1.setBounds(340,250,77,25); 
        b1.setBackground(Color.WHITE);		
        b1.addActionListener(this);
        
        b2 = new JButton("Exit");  
        b2.setBackground(Color.WHITE);
		b2.setBounds(20, 12, 110, 25);
        
        b3 = new JButton("Forgot Password?");
		b3.setBackground(Color.WHITE);
        b3.setBounds(430,250,137,25);
        b3.addActionListener(this);
       
        /*b4 = new JButton("Sign up");
        b4.setBounds(290,280,77,25);
        b4.addActionListener(this);*/
		   
        b5 = new JButton("Previous");
		b5.setBackground(Color.WHITE);
        b5.setBounds(390,280,137,25);
        b5.addActionListener(this);
		
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
        f.add(tf);
        f.add(pf);
		f.add(b1); 
		f.add(b2);
		f.add(b3);
		//f.add(b4);
		f.add(b5);
		
        f.setSize(900,600);  
        f.setLayout(null);  
        f.setTitle("Login");
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
		ImageIcon background_image = new ImageIcon("picture/pexels-ahmed-muntasir-912050.jpg");

		Image img = background_image.getImage();
		Image temp_img = img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
		background_image = new ImageIcon(temp_img);
		JLabel background = new JLabel("", background_image, JLabel.CENTER);
		background.setBounds(0, 0, 900, 600);
		f.add(background);

        f.setVisible(true); 
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae){
				
				String textField1 = tf.getText().toLowerCase(); // User Name 
                String textField2 = pf.getText(); // Password

                if (textField1.isEmpty() || textField2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    try {
                        String userNameS = "User Name : " + textField1;
                        String passwordS = "Password : " + textField2;
                        BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\user_data.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i <= totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(".\\Data\\user_data.txt")).get(i);
                            if (line.equals(userNameS)) {
                                String line2 = Files.readAllLines(Paths.get(".\\Data\\user_data.txt")).get((i + 1));
                                if (line2.equals(passwordS)) {
                                    JOptionPane.showMessageDialog(null, "Login Successful.", "Travel Agency!",
                                            JOptionPane.WARNING_MESSAGE);

                                    //setVisible(false);
                                    new Home();
                                    f.setVisible(false);
                                    break;
                                }
                            }
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Invalid User Name or Password!", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }
			}
		}
	});
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getSource()==b2)
		{
			System.exit(0);
		}
		
		if(e.getSource()==b3)
		{
			f.setVisible(false);
			new ForgotPass();
		}
		
		/*if(e.getSource()==b4)
		{
			f.setVisible(false);
			new Register(u);
		}*/
		
		
		
		if(e.getSource()==b5)
		{
			new Firstpage();
			f.setVisible(false);
		}

	}

	public static String forgetPass(String a) {
		return null;
	}
}
