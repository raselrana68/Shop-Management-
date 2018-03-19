import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Printer extends Products{
	JButton back;
	JButton addCart;
	JButton viewCart;
	Image bg;
	Font font;
	String list[] = {"HP Deskjet X476", "HP LaserJet M477", "HP OfficeJet 5110 3in1 printer", "Epson L220 InkJet", "Brother MFC-85190 Laser Printer" , "Brother HL 5440 Laser Printer,"};
	
	JComboBox printerBox;		
			public Printer(){
	

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
		
		printerBox = new JComboBox(list);
		printerBox.setBounds(50,200,200,40);
		printerBox.setForeground(Color.DARK_GRAY);
		add(printerBox);
		
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