
package messenger_application;

import java.util.ArrayList;

//
public class User 
{
    
    //Constructor for user, input details in parameter
    
    public User()
    {}
    
    private String username;
    private String password;
    
    //ArrayList of All conversations with other users, 
    private ArrayList<Friend> friendList;
    
    
    public String getUsername()
    {
        return username;
    }
    
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    private void addFriend()
    {
        //Create an object of type friend
        //Input username and current conversation
    }
    
    
}
