
package messenger_application;


public class Login 
{
    
    //Ask for credentials
    
    
    //Compare credentials against list of users
    public void checkAgainstUsers()
    {
        //Sent as a request to server 
        //For each user in server
        //Does user+password = server.user+server.password
    }
    
    //Create new user
    
    public void newUser(String username, String password)
    {
        Save_Load sl = new Save_Load();
        sl.saveNewUser(username, password);
    }
    
    
    
}
