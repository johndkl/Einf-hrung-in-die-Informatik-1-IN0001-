package Blatt2;

public class Aufgabe28 extends MiniJava{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = readInt("Geben Sie eine ganze positive Zahl ein:");
		while (n <= 0)
			n = readInt("Ungültig! Geben Sie eine ganze POSITIVE Zahl ein:");	
		
		
		boolean prim = true;
		for(int i = 2; i < n; i++) {
			if(n % i == 0){
				prim = false;
				break;
			}				
		}
		
		if(prim){
			write(n + " ist prim");
		} else 
			write(n + " ist nicht prim");
	}

}
