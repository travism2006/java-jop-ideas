package jsession;

/***/
public class User
{
	private String username;
	private String userEmail;
    private String password;
    
    private static int total = 0;
    
    public User()
    {
        total++;
    }
    
    public User(String someUsername, String somePswrd)
    {
    	this();
        this.username = someUsername;
        this.password = somePswrd;
    }
    
    /**
     * Assigns <code>someUsername</code> to the username field for this user
     * while performing basic validation on each character.
     * <p>
     * If an illegal character is found the given argument is not used.
     * @param someUsername the username that will be assigned if valid
     * @return success if no illegal characters are found in the argument
     * */
    public boolean setUsername(String someUsername)
    {
        for (int i = 0; i < username.length(); i++)
        {
            if (!Character.isLetterOrDigit(username.charAt(i)))
            {
                return false;
            }
        }
        this.username = someUsername;
        return true;
    }
    
    /**
     * Assigns <code>somePassword</code> to the password field for this user
     * while performing basic validation on each character.
     * <p>
     * If an illegal character is found the given argument is not used.
     * @param somePassword the password that will be assigned if valid
     * @return success if no illegal characters are found in the argument
     * */
    public boolean setPassword(String somePassword)
    {
    	/*the password has to meet the minimum length requirement*/
        if (somePassword.length() < 8)
        {
            return false;
        }
        /*check for illegal characters*/
        for (int i = 0; i < somePassword.length(); i++)
        {
            if (!Character.isLetterOrDigit(somePassword.charAt(i)))
            {
                return false;
            }
        }
        //if(password == null || password.equals(null))
        
        this.password = somePassword;
        return true;
}
    
    public String getUsername()
    {
        return username;
    }
    
    public String getUserEmail()
    {
    	return userEmail;
    }
    
    public String getPassword()
    {
    	return password;
    }
    
    public int getTotalUsers()
    {
    	return total;
    }
    
    /**
     * Returns a string representation of this user.
     * @return a string representation of this user
     * */
    public String toString()
    {
    	return "";
    }
    
    /**
     * Returns a human-friendly and easily readable representation of this user.
     * @return a human-friendly and easily readable representation of this user
     * */
    public String repr()
    {
    	return "";
    }
}