package Blatt3;

public class Aufgabe3_7_1 extends MiniJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int n = readInt("Wie viele Zahlen moechten Sie eingeben?");
		    while (n < 2) {
		    	n = readInt("Ungültige Eingabe! Die Zahl muss größer gleich 2!");
		    }

		    int[] zahlen = new int[n];
		    	    
		    for(int i = 0; i < zahlen.length; i++) {
		    	int zahl = readInt("Bitte geben Sie die " + (i + 1) + ". Zahl ein.");
		    	zahlen[i] = zahl;
		    }
		    //
		    int sum = 0;
		    for (int i = 0; i < n; i++) {
		    	// ungerade Zahl
		    	if (i % 2 == 0) 
		    		sum -= zahlen[i];
		    	//gerade Zahl
		    	if (i % 2 != 0)
		    		sum += zahlen[i];
		    }
		    
		    write(sum);	    
	}

}
