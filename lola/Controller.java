import java.util.HashMap;
import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		Controller c = new Controller();
		c.key();
	}
	public void key() {
		Model m = new Model();
		Scanner scan = new Scanner(System.in); 
		HashMap<Link, StateType> StateTypes = new HashMap <Link, StateType>();
		
		StateTypes.put(new BoydCenter(), StateType.BoydCenter);
		StateTypes.put(new ChessCenter(), StateType.ChessCenter);
		StateTypes.put(new DHall(), StateType.DHall);
		StateTypes.put(new DormBathroom(), StateType.DormBathroom);
		StateTypes.put(new DormLaundryRoom(), StateType.DormLaundryRoom);
		StateTypes.put(new DormLobby(), StateType.DormLobby);
		StateTypes.put(new DormRoom(), StateType.DormRoom);
		StateTypes.put(new SteeleCenter(), StateType.SteeleCenter);
		StateTypes.put(new SteeleCenterGym(), StateType.SteeleCenterGym);
		StateTypes.put(new SteeleLockerRoom(), StateType.SteeleLockerRoom);
		StateTypes.put(new TrainingRoom(), StateType.TrainingRoom);
		StateTypes.put(new WalterHall(), StateType.WalterHall);
		
	}
}
