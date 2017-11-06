package Blatt3;

public class Aufgabe3_8 extends MiniJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = readInt("Was für eine positive Zahl moechten Sie eingeben?");
	    while (n <= 0) {
	    	n = readInt("Ungültige Eingabe! Die Zahl muss postiv sein!");
	    }
	    int copy = n;
	    int length = 0;
	    while (copy > 0) {
	    	copy = copy / 10;
	    	length++;
	    }
	    copy = n;
	    int[] number = new int[length];
	    for (int i = 0; i < length; i++) {
	    	number[length - i - 1] = copy % 10;
	    	copy = copy / 10;
	    }
	    for (int i = 0; i < length / 2; i++) {
	    	if (number[i] != number[length - 1 - i]) {
	    		write(n + " ist kein Palidrom!");
	    		return;
	    	}
	    }
	    write(n + " ist ein Palidrom!");
	}
}
