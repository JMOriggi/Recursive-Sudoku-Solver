public class CheckConflict {
	
	public boolean rowConflict(int r, int tab[][], int n){
		for(int pos=0; pos<=8; ++pos){
			if(tab[r][pos]==n){
				//System.out.println("CONFLITTO con numero"+n+", in r="+r);
				return true;
			}
		}		
		return false;
	}
	
	public boolean collumnConflict( int c, int tab[][], int n){
		for(int pos=0; pos<=8; ++pos){
			if(tab[pos][c]==n){
				//System.out.println("CONFLITTO con numero"+n+", in c="+c);
				return true;
			}
		}		
		return false;
	}
	
	public boolean areaConflict(int r, int c, int tab[][], int n){
		
		if(r==0 || r==1 || r==2){ 
			if(c== 0 || c==1 || c==2){
				for(r=0;r<=2; ++r){
					for(c=0;c<=2;++c){
						if(tab[r][c]==n){
							//System.out.println("CONFLITTO area1 con numero"+n+", in r="+r+", c="+c);
							return true;
						}
					}
				}
				return false;
			} 
			if(c==3 || c==4 || c==5){
				for(r=0;r<=2; ++r){
					for(c=3;c<=5;++c){
						if(tab[r][c]==n){
							//System.out.println("CONFLITTO area2 con numero"+n+", in r="+r+", c="+c);
							return true;
						}
					}
				}
				return false;
			}
			if(c==6 || c==7 || c==8){
				for(r=0;r<=2; ++r){
					for(c=6;c<=8;++c){
						if(tab[r][c]==n){
							//System.out.println("CONFLITTO area3 con numero"+n+", in r="+r+", c="+c);
							return true;
						}
					}
				}
				return false;
			}
		}
		
		//altra riga di blocchi area
		if(r==3 || r==4 || r==5){ 
			if(c== 0 || c==1 || c==2){
				for(r=3;r<=5; ++r){
					for(c=0;c<=2;++c){
						if(tab[r][c]==n){
							//System.out.println("CONFLITTO area4 con numero"+n+", in r="+r+", c="+c);
							return true;
						}
					}
				}
				return false;
			} 
			if(c==3 || c==4 || c==5){
				for(r=3;r<=5; ++r){
					for(c=3;c<=5;++c){
						if(tab[r][c]==n){
							//System.out.println("CONFLITTO area5 con numero"+n+", in r="+r+", c="+c);
							return true;
						}
					}
				}
				return false;
			}
			if(c==6 || c==7 || c==8){
				for(r=3;r<=5; ++r){
					for(c=6;c<=8;++c){
						if(tab[r][c]==n){
							//System.out.println("CONFLITTO area6 con numero"+n+", in r="+r+", c="+c);
							return true;
						}
					}
				}
				return false;
			}
		}
		
		
		//altra riga di blocchi area
		if(r==6 || r==7 || r==8){ 
			if(c== 0 || c==1 || c==2){
				for(r=6;r<=8; ++r){
					for(c=0;c<=2;++c){
						if(tab[r][c]==n){
							//System.out.println("CONFLITTO area7 con numero"+n+", in r="+r+", c="+c);
							return true;
						}
					}
				}
				return false;
			} 
			if(c==3 || c==4 || c==5){
				for(r=6;r<=8; ++r){
					for(c=3;c<=5;++c){
						if(tab[r][c]==n){
							//System.out.println("CONFLITTO area8 con numero"+n+", in r="+r+", c="+c);
							return true;
						}
					}
				}
				return false;
			}
			if(c==6 || c==7 || c==8){
				for(r=6;r<=8; ++r){
					for(c=6;c<=8;++c){
						if(tab[r][c]==n){
							//System.out.println("CONFLITTO area9 con numero"+n+", in r="+r+", c="+c);
							return true;
						}
					}
				}
				return false;
			}
		}
		
	
		
		
		return false;
	}
}

