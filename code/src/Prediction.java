public class Prediction {
	
	public boolean prediction(int r,int c, int[][] tab){
		
		System.out.println("NEW PREDICTION");
		CheckConflict conflictPresence=new CheckConflict();
		ReadPrint Read=new ReadPrint();
		
		for(r=0; r<=8;++r){
			for(c=0; c<=8;++c){
				if(tab[r][c] == 0){
					for(int n=1; n<=9;++n){
						//System.out.println(".....");
						//System.out.println("Try number "+n+" at place r="+r+",c="+c);
						if(!conflictPresence.rowConflict(r, tab, n) && !conflictPresence.collumnConflict(c, tab, n) && !conflictPresence.areaConflict(r, c, tab, n)){
							System.out.println("NO CONFLICT at r ="+r+", c="+c+". PUT number:"+n);
							tab[r][c]=n;
							Read.printTab(tab);
							if(!prediction(r,c,tab)){
								System.out.println("---------BAD PREDICTION--------");
								tab[r][c]=0;
							}
							else {return true;}
						}
					}
					return false;
				}
			}
		}
		System.out.println("..SOLUTION..");
		Read.printTab(tab);
		return true;
	}	
	
}
