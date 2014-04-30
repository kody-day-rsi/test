package pack;
import com.opensymphony.xwork2.ActionSupport;  

public class DummyAction extends ActionSupport{  
  
    public String execute()  
    {  
        System.out.println("   In Action");  
        return SUCCESS;  
    }  
} 