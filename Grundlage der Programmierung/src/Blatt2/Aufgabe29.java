package Blatt2;

public class Aufgabe29 extends MiniJava{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = readInt("Geben Sie eine ganze positive Zahl ein:");
		while (n <= 0)
			n = readInt("Ungültig! Geben Sie eine ganze POSITIVE Zahl ein:");	
		
		System.out.println("\\begin{tabular}{lllll}");
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				System.out.printf("%.0f", Math.pow(i, j-1));
				if(j == 5) {
					System.out.printf("\\\\");
				} else 
					System.out.printf(" & ");
			}
			System.out.printf("\n");
		}
		System.out.println("\\end{tabular}");
		
	}

}