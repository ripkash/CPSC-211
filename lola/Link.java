import java.util.ArrayList;

public abstract class Link {
	protected Model model;
	protected ArrayList <String> optionlist = new ArrayList <String>();
	public abstract String getdescription();
	public abstract ArrayList <String> getOptions();
	public abstract String processChoice(int choice);
	protected String [] OptionList = new String [3];
}
