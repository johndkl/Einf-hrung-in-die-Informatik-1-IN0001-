package Blatt2;

public class Aufgabe29 extends MiniJava{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = readInt("Geben Sie eine ganze positive Zahl ein:");
		while (n <= 0)
			n = readInt("Ungültig! Geben Sie eine ganze POSITIVE Zahl ein:");	
		
		//System.out.println("\\begin{tabular}{lllll}");
		writeLineConsole("\\begin{tabular}{lllll}");
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				//System.out.printf("%.0f", Math.pow(i, j-1));
				int number = (int) Math.pow(i, j - 1);
				writeConsole(number);
				if(j == n) {
					//System.out.printf("\\\\");
					writeConsole("\\\\");
				} else 
					//System.out.printf(" & ");
					writeConsole(" & ");
			}
			//System.out.printf("\n");
			writeConsole("\n");
		}
		//System.out.println("\\end{tabular}");
		writeLineConsole("\\end{tabular}");
		
	}

}
