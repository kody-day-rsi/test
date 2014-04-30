package pack;

import java.util.ArrayList;
import com.opensymphony.xwork2.ActionSupport;

public class AutoCompleteAction extends ActionSupport {

	public ArrayList<String> listOfStates=new ArrayList<String>();
	public String state;
	public String execute()
	{
		populatelistOfStates();
		return SUCCESS;
	}

	public void populatelistOfStates()
	{// i am taking few states here with same first character.you can have all states
		listOfStates.add("Maharastra");
		listOfStates.add("Madhya Pradesh");
		listOfStates.add("Meghalaya");
		listOfStates.add("Karnataka");
		listOfStates.add("Kerala");
	}
}