import javax.swing.*;
import javax.swing.table.TableModel;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.ArrayList;
public class CPU extends Products{
	MySql db = new MySql();
	JButton back;
	JButton addCart;
	JButton viewCart;
	Image bg;
	Font font;
	JList cpuBox;
	JLabel info;
    String cpuList[];
	
	JLabel picture;

	
	public CPU(){
		setLocationRelativeTo(null);
		setSize(800,600);
		setVisible(true);
		setLayout(null);
		setResizable(true);
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\Fahim\\workspace\\ShopManagement\\src\\icon\\panel_ui.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	cpuList = db.cpuList();

		font = new Font("Rockwell",Font.BOLD,30);
		back = new JButton("BACK");
		back.setBounds(50,40,80,40);
		add(back);
		addCart = new JButton("ADD TO CART");
		addCart.setBounds(630,40,130,40);
		add(addCart);
		viewCart = new JButton("VIEW CART");
		viewCart.setBounds(500,40,100,40);
		add(viewCart);
		//info.setFont(font);
		info = new JLabel("SELECT AMONG OUR WIDE RANGE OF PROCESSORS");
		info.setBounds(50,150,310,40);
		info.setForeground(Color.WHITE);
		add(info);
		
		cpuBox = new JList(cpuList);
		cpuBox.setBounds(50,200,400,200);
		cpuBox.setForeground(Color.DARK_GRAY);
		add(cpuBox);
		  
		picture = new JLabel();
		picture.setBounds(350,150,350,350);
		add(picture);
		back.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						dispose();
						Products p = new Products();
					}
				}
		);
		
		
		
		
	}
	
	
	
}

