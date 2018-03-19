import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Products extends JFrame{
	
	
	private JButton back_button = new JButton("BACK"); 
	private JButton back_button2 = new JButton("BACK"); 


	
	
	public Products(){
		super("Tech Forest IT Solution Management System");
		setSize(800,600);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
	    setContentPane(new JLabel(new ImageIcon("C:\\Users\\Fahim\\workspace\\ShopManagement\\src\\icon\\panel_ui.jpg")));		
	    setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		



		 back_button2.setBounds(50,40,80,40);
		 add(back_button2);
		 back_button2.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent event){	
		    	AdminUI ob1 = new AdminUI();
		    	dispose();
		    }});
	}
	

	
	public void addProduct(){
		
		setSize(800,600);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
	    setContentPane(new JLabel(new ImageIcon("C:\\Users\\Fahim\\workspace\\ShopManagement\\src\\icon\\panel_ui.jpg")));		
	    setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    JLabel label1 = new JLabel("Enter Details of New Products");
		JLabel name = new JLabel("Model");
		JLabel price = new JLabel("Price");
		JLabel quantity = new JLabel("quantity");

		JTextField enterName = new JTextField(20);
		JTextField enterEmail = new JTextField(20);
		JTextArea enterAddress = new JTextArea();
		JPasswordField enterPass = new JPasswordField();
		JPasswordField enterPass2 = new JPasswordField();
		JButton back = new JButton("BACK");
		JButton add = new JButton("Add");
		JLabel gender = new JLabel("SelectProduct Type");
		
		String[] comboListSex = {"CPU", "GPU", "Storage Device","I/O Device","Laptop","Printers"};
		         
		};
		JComboBox genderList;
		
		
		
		
		
	}
	
	

