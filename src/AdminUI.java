import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


public class AdminUI extends JFrame implements MenuListener,ActionListener{
	JMenuBar mb = new JMenuBar();
	JMenu customize = new JMenu("Customize Profile");
	JMenu inventory = new JMenu("Inventory");
	JMenu logout = new JMenu("Log Out");
	JMenu showEmp = new JMenu("Employees");
	JMenu accountInfo = new JMenu("Show Account");
	JMenuItem viewP= new JMenuItem("View All Product");
	JMenuItem viewEmp = new JMenuItem("Show Current Employees");
	JMenuItem addEmp= new JMenuItem("Add New Employee");
	JMenuItem deleteEmp= new JMenuItem("Delete Employee");
	
	JLabel welcome = new JLabel("Welcome Admin");
	JLabel admin = new JLabel(new ImageIcon("C:\\Users\\Fahim\\workspace\\ShopManagement\\src\\icon\\admin.jpg"));
	JLabel name = new JLabel("Name");
	JLabel account = new JLabel("Balance");
	
 public AdminUI(){
	 super("TSIF-Admin");
	 setSize(801,601);
	 setContentPane(new JLabel(new ImageIcon("C:\\Users\\Fahim\\workspace\\ShopManagement\\src\\icon\\panel_ui.jpg")));   
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setLayout(null);
	 setLocationRelativeTo(null);
	 setVisible(true);
	 setResizable(false);	
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 Font f1 = new Font("Rockwell",Font.PLAIN,25);
	 Font f2 = new Font("Rockwell",Font.PLAIN,17);
	 
	 welcome.setFont(f1);
	 welcome.setForeground(Color.WHITE);
	 welcome.setBounds(50,150,210,25);
	 add(welcome);
	 
	 //Adding Menu element in menu bar 
	 mb.setBounds(0,1,800,30);
	 mb.add(customize);
	 mb.add(inventory);
	 mb.add(showEmp);
	 mb.add(accountInfo);
	 mb.add(logout);
	 mb.setBackground(Color.WHITE);
	 add(mb);
	 
	 // Adding Item in show employee menu
	 showEmp.add(viewEmp);
	 showEmp.add(addEmp);
	 showEmp.add(deleteEmp);
	 
	 //adding item in inventory menu 
	 inventory.add(viewP);

	 admin.setBounds(50,180,300,360);
	 add(admin);
	 
	 name.setBounds(450,180,60,20);
	 name.setForeground(Color.WHITE);
	 name.setFont(f2);
	 add(name);
	 
	 account.setBounds(450,210,70,20);
	 account.setForeground(Color.WHITE);
	 account.setFont(f2);
	 add(account);
	 
	// logout.setBounds(300,100,25,30);
	// add(logout);
	// changePass.addActionListener(this);
	 
	 logout.addMenuListener(this);		
	 //changePass.addActionListener(this);
	 viewP.addActionListener(this);
	 viewEmp.addActionListener(this);
	 addEmp.addActionListener(this);
	 deleteEmp.addActionListener(this);
	 
  }
 
 
 
 
 public void menuSelected(MenuEvent event){
	 if(event.getSource()==logout){
		 AdminPanel ob1 = new AdminPanel();
		 dispose();
	 }

 
 	}


@Override
public void menuCanceled(MenuEvent arg0) {
	// TODO Auto-generated method stub
	
}


@Override
public void menuDeselected(MenuEvent arg0) {
	// TODO Auto-generated method stub
	
}




@Override
public void actionPerformed(ActionEvent event) {
		if (event.getSource()==viewP){
			Products p = new Products();
			dispose();
		}
		else if(event.getSource()==viewEmp){
			
		}
		else if(event.getSource()==addEmp){
			NewEmployee e= new NewEmployee();
		}
		else if(event.getSource()==deleteEmp){
			
		}
	
}

public void addProduct(){
	
	
	
	
}


 }
	 
	 
	 
 
 
 


