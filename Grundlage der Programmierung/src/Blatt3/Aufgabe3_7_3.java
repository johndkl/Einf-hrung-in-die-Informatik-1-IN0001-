package Blatt3;

public class Aufgabe3_7_3 extends MiniJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = readInt("Wie viele Zahlen moechten Sie eingeben?");
	    while (n < 2) {
	    	n = readInt("Ungültige Eingabe! Die Zahl muss größer gleich 2!");
	    }

	    int[] zahlen = new int[n];
	    	    
	    for(int i = 0; i < n; i++) {
	    	int zahl = readInt("Bitte geben Sie die " + (i + 1) + ". Zahl ein.");
	    	zahlen[i] = zahl;
	    }
	    //
	    for (int i = 0; i < n / 2; i++) {
	    	zahlen[2 * i] = zahlen[2 * i] + zahlen[2 * i + 1]; 
	    }
	    writeLineConsole("Das Ergebnis-Feld:");
	    for (int i = 0; i < n; i++) {
	    	writeLineConsole(zahlen[i]);
	    }
	}

}