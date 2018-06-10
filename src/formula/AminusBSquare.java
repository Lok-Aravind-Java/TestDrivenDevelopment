package formula;

public class AminusBSquare {


	public int AminusBWholeSquare(int i , int j){
		
		return substraction(addition(squaring(i),squaring(j)),multiplication(2,multiplication(i, j)));
	}

	private int multiplication(int i, int j) {
		return i*j;
	}

	private int squaring(int i) {
		return i*i;
	}
	
	private int addition(int i, int j){
		return i+j;
	}
	
	private int substraction(int i,int j){
		return i-j;
	}
	
}
