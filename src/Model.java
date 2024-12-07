
public class Model {
	private StateType currentStateType = StateType.DormRoom;
	
	public void setStateType (StateType s) {
		currentStateType =s;
	}
	public StateType getCurrentStateType() {
		return currentStateType;
	}
}
