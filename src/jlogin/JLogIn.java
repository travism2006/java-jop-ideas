package jlogin;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.*;
/**
 * Used for pseudo-extension of JOptionPane to allow for default use cases
 * that are typically rendered and found in the JOptionPane class' static
 * methods.
 * <p>
 * -does not use character hiding on the password input text field<p>
 * -assumes string input for both login type of input, including the password<p>
 * 

 * @version 1.0
 * @author tmitchu2 and
 * @autor whouston
 * */
public class JLogIn extends JOptionPane
{
	//static accessible codes for using the JLogIn class
	//public static final int ERROR = 0;
	
	//to avoid 'magic numbers'
	private static final int COLWIDTH = 15;
	private static final int WIDTH = 100;
	private static final int HEIGHT = 25;
	
	public static final int SHOW_MASK = 0;
	public static final int HIDE_MASK = -1;
	
	/**
	 * default, auto-generated
	 */
	private static final long serialVersionUID = 1L;

	/**Default contructor only used for initializing small frame window size*/
	public JLogIn()
	{
		
		
		//this.setBounds(12, 12, 20, 20);
		this.setBounds(200, 200, 200,200);  
		//this.setVisible(true);
		
		
	}
	
	JButton yesBtn = new JButton("Yes");
	JButton noBtn = new JButton("No");
	
	/**
	 * 
	 * @return session acceptance or denial based on their credentials
	 * */
	public int showLogIn(int maskDeterminant)
	{
		//JPanel cont = new JPanel();
		//cont.setLayout(new BoxLayout(cont, BoxLayout.X_AXIS));
		
		JLabel idLbl = new JLabel("Login ID:");
		JTextField idField = new JTextField(COLWIDTH);
		this.add(idLbl);
		this.add(idField);
		
		JLabel passLbl = new JLabel("Password");
		
		this.add(passLbl);
		
		if(maskDeterminant == SHOW_MASK)
		{
			JTextField passField = new JPasswordField(COLWIDTH);
			this.add(passField);
		}
		else if(maskDeterminant == HIDE_MASK)
		{
			JTextField passField = new JTextField(COLWIDTH);
			this.add(passField);
		}
		
		//now add buttons
	
		return this.showConfirmDialog(null, null, "", JOptionPane.YES_NO_OPTION);
	}
	
	

	
}