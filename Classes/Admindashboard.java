package Classes;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Admindashboard implements ActionListener {

    private JFrame f;
    private ImageIcon icon, logo;
    private JLabel label1, imgLabel;
    private Font f1, f2;
    private JButton btn1, btn2, btn3, btn4, nBtn;
    private Cursor cursor;

    Admindashboard() {
        // Frame Layout
        f= new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Travel Agency");
        f.setSize(600, 350);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible(true);

        f.setLayout(null);
        f.setBackground(Color.decode("#F2F2F2"));

        // Icon
        // icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        // this.setIconImage(icon.getImage());

        // Fonts
        f1 = new Font("Tahoma", Font.BOLD, 30);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Title
        label1 = new JLabel();
        label1.setText("Admin Panel");
        label1.setBounds(60, 20, 200, 50);
        label1.setFont(f1);
        f.add(label1);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
        btn1 = new JButton("User Data");
        btn1.setBounds(64, 90, 100, 30);
        //btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#2E75B6"));
        btn1.addActionListener(this);

        f.add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(200, 150, 100, 30);
        //btn2.setFont(f2);
        //btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#2E75B6"));
        btn2.addActionListener(this);

        f.add(btn2);

        btn3 = new JButton("Exit");
        btn3.setBounds(64, 150, 100, 30);
        //btn3.setFont(f2);
        //btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#C00000"));
        btn3.addActionListener(this);

        f.add(btn3);

        btn4 = new JButton("Resert Pass");
        btn4.setBounds(200, 90, 100,30);
        //btn4.setFont(f2);
        //btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#2E75B6"));
        btn4.addActionListener(this);

        f.add(btn4);
        
        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        f.add(nBtn);
    }

        // User Data
        public void actionPerformed(ActionEvent e){
            if(e.getSource()== btn1){
                new UserData();
                f.setVisible(false);
            }

            if(e.getSource()== btn3){
                System.exit(0);
            }
            if(e.getSource()== btn2){
                new Firstpage();
				f.setVisible(false);
            }
            if(e.getSource()== btn4){
                new AdminPassword();
                f.setVisible(false);
            }

        }
    }
