
public class View {
	private StateType currentStateTypes;
	private StateType description;
	
	public StateType getDescription() {
		return description;
	}
	public StateType getCurrentStateTypes() {
		return currentStateTypes;
	}
	public void setCurrentState(StateType currentStateTypes) {
		this.currentStateTypes = currentStateTypes;
	}
}
