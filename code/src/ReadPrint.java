import javax.swing.JOptionPane; //Per finestra input

public class ReadPrint {
	
	public int[][] readInput(){
		int tab[][] = new int[9][9];
		for(int i=0; i<=8; ++i){
			int x=i+1;
			String input = JOptionPane.showInputDialog("Inserisci numeri per riga "+x+" per ogni casella con spazio in mezzo:");
			int c = 0;
			int n = Integer.parseInt(input.substring(0,1));
			tab[i][c]=n;
			c = 1;
			n = Integer.parseInt(input.substring(2,3));
			tab[i][c]=n;
			c = 2;
			n = Integer.parseInt(input.substring(4,5));
			tab[i][c]=n;
			c = 3;
			n = Integer.parseInt(input.substring(6,7));
			tab[i][c]=n;
			c = 4;
			n = Integer.parseInt(input.substring(8,9));
			tab[i][c]=n;
			c = 5;
			n = Integer.parseInt(input.substring(10,11));
			tab[i][c]=n;
			c = 6;
			n = Integer.parseInt(input.substring(12,13));
			tab[i][c]=n;
			c = 7;
			n = Integer.parseInt(input.substring(14,15));
			tab[i][c]=n;
			c = 8;
			n = Integer.parseInt(input.substring(16,17));
			tab[i][c]=n;
		}	
		return tab;
	}
		
	public void printTab(int[][] tab){
		System.out.println("_____");
		for(int r=0; r<=8;++r){
			System.out.print(" | ");
			for(int c=0; c<=8;++c){
				if(c-3==0 || c-6==0){
					System.out.print(" | ");
				}
				System.out.print(tab[r][c]);
			}
			System.out.print(" | ");
			System.out.println("");
		}
		System.out.println("_____");
	}
	
}
