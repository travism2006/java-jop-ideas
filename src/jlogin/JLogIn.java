package jlogin;

import java.awt.Graphics;

import javax.swing.BoxLayout;
import javax.swing.JComponent;
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
public class JLogIn extends JComponent
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
	
	/**
	 * default, auto-generated
	 */
	private static final long serialVersionUID = 1L;

	/***/
	private JLogIn()
	{
		setSize(WIDTH, HEIGHT);
		//setVisible(true);
	}
	
	/***/
	public void paintComponent(Graphics g)
	{super.paintComponent(g);}
	
	/**
	 * 
	 * @return session acceptance or denail based on their credentials
	 * */
	public static int showLogIn(int maskDeterminant)
	{
		JPanel cont = new JPanel();
		cont.setLayout(new BoxLayout(cont, BoxLayout.X_AXIS));
		
		JLabel idLbl = new JLabel("Login ID:");
		JTextField idField = new JTextField(COLWIDTH);
		cont.add(idLbl);cont.add(idField);
		
		JLabel passLbl = new JLabel("Password");
		cont.add(passLbl);
		
		if(maskDeterminant == SHOW_MASK)
		{JTextField passField = new JPasswordField(COLWIDTH);cont.add(passField);}
		else if(maskDeterminant == HIDE_MASK)
		{JTextField passField = new JTextField(COLWIDTH);cont.add(passField);}
		
		return JOptionPane.showConfirmDialog(null, cont, "", JOptionPane.YES_NO_OPTION);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}