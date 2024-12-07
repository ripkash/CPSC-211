import java.util.ArrayList;

public class DHall extends Link{
	public DHall(Model m) {
		super.model = m;
		super.optionlist.add("");
	}
	@Override
	public String getdescription() {
		String description = "";
		return description;
	}

	@Override
	public ArrayList<String> getOptions() {
		OptionList[0] = "Check area";
		OptionList[1] = "Go back to DormLobby";
		return super.optionlist;
	}

	@Override
	public String processChoice(int choice) {
		switch (choice) {
		case 1:
			return"Not here";
		case 2:
			model.setStateType(StateType.DormLobby);
			return "Go back to Dorm Lobby";
		}
		return null;
	}

}
