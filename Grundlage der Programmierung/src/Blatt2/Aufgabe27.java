package Blatt2;

public class Aufgabe27 extends MiniJava{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = readInt("Geben Sie eine ganze positive Zahl ein:");
		while (n < 0)
			n = readInt("Ungültig! Geben Sie eine ganze POSITIVE Zahl ein:");	
		int summe = 0;
		for(int i = 0; i < n; i++) {
			if (i % 3 == 0 || i % 7 == 0)
				summe += i;
		}
		write(summe);
	}
}
