public class Sudoku {
	//data structure
	//x dim = row , y dim = col , z dim = possible solutions "100111"
	// above 1,2,3,6 are possible solutions represented by  the bit
	// higher order bits are set as 1 by default
	private int[][][] cell = new int[9][9][9]; 
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(39));
	}
	
	public void printPuzzle(){
		for(int i = 0; i < 9;i ++){
			for(int j = 0; i < 9;i ++){
				System.out.print(cell[i][j][0] + " ");
			}
			System.out.println();
		}
	}
	
	public void initialize(int[][] input){
		for(int i = 0; i < 9;i ++){
			for(int j = 0; i < 9;i ++){
				for(int k = 0; i < 9;i ++){
					cell[i][j][k] = 1;//all possible solutions
					if(input[i][j] == 0){
						
						cell[i][j][k] = 1;//all possible solutions
					}
				}
			}
		}
		
	}
}
