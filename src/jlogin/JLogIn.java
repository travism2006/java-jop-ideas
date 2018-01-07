package jlogin;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Used for pseudo-extension of JOptionPane to allow for default use cases
 * that are typically rendered and found in the JOptionPane class' static
 * methods.
 * <p>
 * -does not use character hiding on the password input text field<p>
 * -assumes string input for both login type of input, including the password<p>
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * @version 1.0
 * @author tmitchu2
 * */
public class JLogIn extends JDialog
{
	//static accessible codes for using the JLogIn class
	//public static final int ERROR = 0;
	
	//to avoid 'magic numbers'
	private static final int COLWIDTH = 15;
	private static final int WIDTH = 100;
	private static final int HEIGHT = 50;
	
	/***/
	public static final int SHOW_MASK = 0;
	public static final int HIDE_MASK = -1;
	public static final int DEFAULT_MASK = 0;
	
	/**
	 * default, auto-generated
	 */
	private static final long serialVersionUID = 1L;

	/**Defatil contructor only used for initializing small frame window size*/
	public JLogIn()
	{setSize(WIDTH, HEIGHT);}
	
	/*Make the necessary buttons*/
	JButton yesBtn = new JButton("Yes");
	JButton noBtn = new JButton("No");
	JButton cancelBtn = new JButton("Cancel");
	JButton okBtn = new JButton("OK");
	
	public static final int a=-1;
	
	
	/**
	 * 
	 * @return session acceptance or denail based on their credentials
	 * */
	public static int showLogIn(int maskDeterminant)
	{
		JPanel temp = new JPanel();
		temp.setLayout(new BoxLayout(temp, BoxLayout.X_AXIS));
		
		JLabel idLbl = new JLabel("Login ID:");
		JTextField idField = new JTextField(COLWIDTH);
		temp.add(idLbl);temp.add(idField);
		
		JLabel passLbl = new JLabel("Password");
		temp.add(passLbl);
		
		if(maskDeterminant == SHOW_MASK)
		{JTextField passField = new JPasswordField(COLWIDTH);temp.add(passField);}
		else if(maskDeterminant == HIDE_MASK)
		{JTextField passField = new JTextField(COLWIDTH);temp.add(passField);}
		
		//now add buttons
		JPanel cont = new JPanel();
		cont.setLayout(new BoxLayout(cont, BoxLayout.Y_AXIS));
		cont.add(temp);
		
		return showLogIn(DEFAULT_MASK, cont);
	}
	
	//, "", JOptionPane.YES_NO_OPTION
	
	/***/
	public static int showLogIn(int maskDeterminant, Container aCont)
	{
		
		
		return showLogIn(DEFAULT_MASK,aCont, "");
	}

	public static int showLogIn(int maskDeterminant, Container aCont, String title)
	{
		
		
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}