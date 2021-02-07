public class run {

	public static void main(String[] args){
		
		ReadPrint Read=new ReadPrint();
		Prediction Solve=new Prediction();
		
		
		int tab[][]= new int[9][9];
		tab = Read.readInput();
		
		Read.printTab(tab);
		
		Solve.prediction(0, 0, tab);
		
	}
	
}
