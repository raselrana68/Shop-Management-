import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Storage extends Products{
	JButton back;
	JButton addCart;
	JButton viewCart;
	
	Font font;
	String storageList[]={"Western Digital 7200rpm 1TB Hdd ", "SeaGate 2TB 7200rpm 6Gbps HDD", "Transcend 500GB Military Grade Portable HDD", "Corsair 256 GB SSD"};
	JComboBox storageBox;
	public Storage(){
		setLocationRelativeTo(null);
		setSize(800,600);
		setVisible(true);
		setLayout(null);
		setResizable(false);
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\Fahim\\workspace\\ShopManagement\\src\\icon\\panel_ui.jpg")));
		font = new Font("Rockwell",Font.BOLD,20);
		back = new JButton("BACK");
		back.setBounds(50,40,80,40);
		add(back);
		addCart = new JButton("ADD TO CART");
		addCart.setBounds(630,40,130,40);
		//addCart.setFont(font);
		add(addCart);
		viewCart = new JButton("VIEW CART");
		viewCart.setBounds(500,40,100,40);
		//viewCart.setFont(font);
		add(viewCart);
		
		storageBox= new JComboBox(storageList);
		storageBox.setBounds(50,200,200,40);
		storageBox.setForeground(Color.DARK_GRAY);
		add(storageBox);
		
		
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