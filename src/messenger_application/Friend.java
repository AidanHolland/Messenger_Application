
package messenger_application;
import java.util.ArrayList;


public class Friend 
{
    private String friendUsername;
    
    private ArrayList<String> chatHistory;
    
    
    public Friend(String friendUsername)
    {
        this.friendUsername = friendUsername;
    }
    
    //Each time a line is sent or received, add
    public void addToChatHistory(String line)
    {
        chatHistory.add(line);
    }
    
    
    public ArrayList<String> getChatHistory()
    {
        return chatHistory;
    }
}
