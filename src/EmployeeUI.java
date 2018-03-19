import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class EmployeeUI extends JFrame implements MenuListener{
	JMenuBar mb = new JMenuBar();
	JMenu inventory = new JMenu("Show Inventory");
	JMenu logout = new JMenu("Log Out");
	JMenu accountInfo = new JMenu("Show Account");
	JLabel welcome = new JLabel("Welcome");
	JLabel user = new JLabel(new ImageIcon("C:\\Users\\Fahim\\workspace\\ShopManagement\\src\\icon\\admin.jpg"));
	JLabel name = new JLabel("Name");
	JTable table ;
	String column[]={"Model","Regular Price"};
	MySql db = new MySql();
	
	public	EmployeeUI(){
		super("TSIF-Employee");
		setSize(801,601);
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\Fahim\\workspace\\ShopManagement\\src\\icon\\panel_ui.jpg")));   
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		//setResizable(false);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font f1 = new Font("Rockwell",Font.PLAIN,25);
		Font f2 = new Font("Rockwell",Font.PLAIN,17);
		 
		welcome.setFont(f1);
		welcome.setForeground(Color.WHITE);
		welcome.setBounds(50,150,210,25);
		add(welcome);
		
		mb.setBounds(0,1,800,30);
		mb.add(inventory);
		mb.add(accountInfo);
		mb.add(logout);
		mb.setBackground(Color.WHITE);
		add(mb);
		 
		
		 
		name.setBounds(450,180,60,20);
		name.setForeground(Color.WHITE);
		name.setFont(f2);
		//add(name);
		
		
		FillTable(table);
		
		
		logout.addMenuListener(this);

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

    	
		
	}

	
	public void menuCanceled(MenuEvent e) {
		
		
	}


	public void menuDeselected(MenuEvent e) {
	
		
	}

	
	public void menuSelected(MenuEvent e) {
		if(e.getSource()==logout){
			EmployeePanel ob1 = new EmployeePanel();
			dispose();
		}
		
	}
	
	

	
	public void FillTable(JTable table){
	    try{
	    	Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/tfis-database","root","");  
	        Statement stat = con.createStatement();
	        ResultSet rs = stat.executeQuery("Select * from cpu_list");
	    
	        while(table.getRowCount() > 0) 
	        {
	            ((DefaultTableModel) table.getModel()).removeRow(0);
	        }
	        int columns = rs.getMetaData().getColumnCount();
	        while(rs.next())
	        {  
	            Object[] row = new Object[columns];
	            for (int i = 1; i <= columns; i++)
	            {  
	                row[i - 1] = rs.getObject(i);
	            }
	            ((DefaultTableModel) table.getModel()).insertRow(rs.getRow()-1,row);
	        } 

	        rs.close();
	        stat.close();
	        con.close();
	    }
	    catch( SQLException | ClassNotFoundException e)
	    {
	    	e.printStackTrace();
	    }
	    table.setBounds(50,100,300,200);
	    add(table);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
