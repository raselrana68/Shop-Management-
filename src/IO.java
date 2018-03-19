import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IO extends Products{
	JButton back;
	JButton addCart;
	JButton viewCart;
	Image bg;
	Font font;
	String ioList[]={"ThermalTake Gaming Keyboard ," , "Rapoo Mouse and Keyboard Combo", "Logitech B110 Mouse" , "Havit H350 Wireless Keyboard "};
	JComboBox ioBox;
	public IO(){
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
		
		ioBox= new JComboBox(ioList);
		ioBox.setBounds(50,200,200,40);
		ioBox.setForeground(Color.DARK_GRAY);
		add(ioBox);
		
		
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