package formula;

public class AplusBSquare {

	public int AplusBWholeSquare(int i,int j){
		
		return addition(addition(squaring(i),squaring(j)),
				multiplication(2,multiplication(i, j)));
		
	}

	
	private int addition(int i , int j){
		return i+j;
		
	}
	private int multiplication(int i, int j) {
		return i*j;
	}

	private int squaring(int i) {
		return i*i;
	}
	
}
