package jlogin;
import java.io.*;
import java.util.*;
/**
 * This class if for instantiating a session with a specified database.
 * Going to use this to validate a user. 
 * @author whouston
 *
 */
public class loginSession
{
	HashMap<String, String> mappy = new HashMap<String, String>();
	public loginSession(String filename)
	{
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
			br.readLine();
			
		}
		catch(FileNotFoundException a)
		{
			a.printStackTrace();
		}
		catch (IOException b)
		{
			b.printStackTrace();
		}

	}
}
