package it.prova.numericliterals;

public class NumericLiteralsWithUnderscores {
	
	public static void showUseJava7(){
		int mille =  1000;
		int milione  =  1_000_000;
		
		System.out.println("Mille: "+mille+" Milione: "+milione);
	}
	
	public static void main(String[] args) {
		showUseJava7();
	}

}
