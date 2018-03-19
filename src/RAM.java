import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RAM extends Products{
	JButton back;
	JButton addCart;
	JButton viewCart;
	Image bg;
	Font font;
	String ramList[]={"Transcend 4GB DDR3 2133MHz ", "Corsair Vengeance 8GB DDR4 2133MHz", "Adata Thunder 4GB DDR3 1600Mhz"};
	JComboBox ramBox;
	
	public RAM(){
		setLocationRelativeTo(null);
		setSize(800,600);
		setVisible(true);
		setLayout(null);
		setResizable(false);
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\Fahim\\workspace\\ShopManagement\\src\\icon\\panel_ui.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		ramBox= new JComboBox(ramList);
		ramBox.setBounds(50,200,200,40);
		ramBox.setForeground(Color.DARK_GRAY);
		add(ramBox);
		
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