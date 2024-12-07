import java.util.ArrayList;

public class DormLobby extends Link{
	public DormLobby(Model m) {
		super.model = m;
		super.optionlist.add("Oh no I lost my ID, Let's go and find it!");
	}
	@Override
	public String getdescription() {
		String description = "Hurry I got class in an hour";
		return description;
	}

	@Override
	public ArrayList<String> getOptions() {
		OptionList[0] = "Checkout the area";
		OptionList[1] = "Go to the BoydCenter";
		OptionList[2] = "Go to the ChessCenter";
		OptionList[3] = "Go to the Dhall";
		OptionList[4] = "Go to the DormRoom";
		OptionList[5] = "Go to the DormLaundryRoom";
		OptionList[6] = "Go to the SteeleCenter";
		OptionList[7] = "Go to the SteeleCenterGym";
		OptionList[8] = "Go to the SteeleLockerRoom";
		OptionList[9] = "Go to the TrainingRoom";
		OptionList[10] = "Go to the WalterHall";
		OptionList[11] = "Go to the DormBathroom";
		
		return super.optionlist;
	}

	@Override
	public String processChoice(int choice) {
		switch (choice) {
		case 1:
			return"Ah man not here";
		case 2:
			model.setStateType(StateType.BoydCenter);
			return "Going to the BoydCenter";
		case 3:
			model.setStateType(StateType.ChessCenter);
			return "Going to the ChessCenter";
		case 4:
			model.setStateType(StateType.DHall);
			return "Going to the DHall";
		case 5:
			model.setStateType(StateType.DormRoom);
			return "Going to the DormRoom";
		case 6:
			model.setStateType(StateType.DormLaundryRoom);
			return "Going to the DormLaundryRoom";
		case 7:
			model.setStateType(StateType.SteeleCenter);
			return "Going to the SteeleCenter";
		case 8:
			model.setStateType(StateType.SteeleCenterGym);
			return "Going to the SteeleCenterGym";
		case 9:
			model.setStateType(StateType.SteeleLockerRoom);
			return "Going to the SteeleLockerRoom";
		case 10:
			model.setStateType(StateType.TrainingRoom);
			return "Going to the TrainingRoom";
		case 11:
			model.setStateType(StateType.WalterHall);
			return "Going to the Walterhall";
		case 12:
			model.setStateType(StateType.DormLaundryRoom);
			return "Going to the DormLaundryRoom";
		}
		return null;
	}

}
