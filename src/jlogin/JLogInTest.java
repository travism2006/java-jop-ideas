package jlogin;

import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.Test;

public class JLogInTest
{
	@Test
	public void testShowLogIn()
	{
		//choose yes should return the JOP-chosen yes bttn
		JLogIn login = new JLogIn();
		assertTrue(JOptionPane.YES_OPTION == login.showLogIn(JLogIn.HIDE_MASK));
	}

}
