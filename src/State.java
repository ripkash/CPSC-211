
public abstract class State {
protected Model model;

public abstract String getDescription();

public abstract String [] getOptions();

public abstract String processInput(int userinput);

protected String [] optionList = new String [3];

}
