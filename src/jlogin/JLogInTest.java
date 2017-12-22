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
		assertTrue(JOptionPane.YES_OPTION == JLogIn.showLogIn(JLogIn.HIDE_MASK));
	}

}
