import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserInterface extends JFrame implements ActionListener {
	
	JLabel login = new JLabel("Login Panel");
	JButton admin = new JButton("Admin");
	JButton user = new JButton("Employee");
	
	
			public UserInterface(){
				super("Tech Forest IT Solution Management System");
				setSize(801,601);
				setLocationRelativeTo(null);
				setLayout(new FlowLayout());
			    setContentPane(new JLabel(new ImageIcon("C:\\Users\\Fahim\\workspace\\ShopManagement\\src\\icon\\cover_ui.jpg")));		
			    setVisible(true); 
			    setResizable(false);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

				login.setBounds(320, 200 , 610, 82);
				login.setFont(new Font("Rockwell", Font.BOLD, 24));
				login.setForeground(Color.WHITE);
				add(login);
				
				admin.setBounds(300,267,180,47);
				admin.setFont(new Font("Rockwell", Font.PLAIN, 17));
				admin.setForeground(Color.BLACK);
				admin.setBackground(Color.LIGHT_GRAY);
				add(admin);
		
				user.setBounds(300,326,180,47);
				user.setFont(new Font("Rockwell", Font.PLAIN , 17));
				user.setForeground(Color.BLACK);
				user.setBackground(Color.LIGHT_GRAY);
				add(user);
	
				
				admin.addActionListener(this);
				user.addActionListener(this);
			}
			
			
			public void actionPerformed(ActionEvent event) {
				
			
			if(event.getSource()==admin){
					AdminPanel ob3 = new AdminPanel();
					this.dispose();
					
				}
			else if(event.getSource()==user){
				EmployeePanel e = new EmployeePanel();
				 }
			
				
				
		}		
			
}	
	
	

			
