package Blatt3;

import Blatt3.MiniJava;

public class Aufgabe3_7_2 extends MiniJava {

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
	    
	    int max = zahlen[0];
	    for (int i = 1; i < n; i++) {
	    	 if (max < zahlen[i])
	    		 max = zahlen[i];
	    }
	    int second_max = (zahlen[0] < zahlen[1]) ? zahlen[0] : zahlen[1];
	    for (int i = 0; i < n; i++) {
	    	if (second_max < zahlen[i] && zahlen[i] != max)
	    		second_max = zahlen[i];
	    }
	    write("Das zweigrößte Element ist " + second_max);
	}

}
