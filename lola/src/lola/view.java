public class view {
	private Model3 model;
	
	public view (Model3 model) {
		this.model=model;
	}
	public void display () {
		for (int v = 0; v < 7; v ++) {
			System.out.println("");
			
			for (int y=0; y < 7; y++) {
				LascaPiece<Character> x = model.get(v,y);
				if(x==null) {
					System.out.print("-");
				}else {
					System.out.print(x);
				}
			}
		}
	}
}