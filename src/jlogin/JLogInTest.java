package jlogin;

import static org.junit.Assert.*;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import org.junit.Test;
import javax.swing.*;

public class JLogInTest
{
	@Test
	public void testShowLogIn()
	{
		//choose yes should return the JOP-chosen yes bttn
		JLogin login = new JLogin();
		login.setWidth(500);
		login.setHeight(100);
		login.setColor(Color.orange);


		login.setPanelBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.blue, Color.CYAN));
		assertTrue(JOptionPane.YES_OPTION == login.display());
	}

}
