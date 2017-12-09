package jlogin;

import javax.accessibility.Accessible;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

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
public class JLogIn extends JComponent implements Accessible
{
	//static accessible codes for using the JLogIn class
	//public static final int ERROR = 0;
	private JPanel cont;
	private JTextField idField,passField;
	private JLabel idLbl,passLbl;
	
	//to avoid 'magic numbers'
	private static final int COLWIDTH = 15;
	private static final int WIDTH = 100;
	private static final int HEIGHT = 70;
	
	/**
	 * non-default, auto-generated
	 */
	private static final long serialVersionUID = -5792390124166217122L;

	private JLogIn()
	{
		idField = new JTextField(COLWIDTH);
		passField = new JTextField(COLWIDTH);
		idLbl = new JLabel("Login ID:");
		passLbl = new JLabel("Password");
		this.cont = new JPanel(new BoxLayout(cont, BoxLayout.X_AXIS));
		cont.add(idLbl);cont.add(idField);
		cont.add(passLbl);cont.add(passField);
		super.setSize(WIDTH, HEIGHT);
		setVisible(true);
		
	}
	
	/**
	 * 
	 * @return session acceptance or denail based on their credentials
	 * */
	//public static boolean logIn()
	//{}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}