package Blatt2;

import Blatt1.MiniJava;

public class Meiern_My_Try extends MiniJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first, second;
		int player;
		int lasttime, thistime;
		
		lasttime = 0;
		thistime = 1;
		player = 1;
		
		while(lasttime < thistime) {
			lasttime = thistime;
			
			first = dice();
			second = dice();
			int score;
			
			if (first > second) {
				score = first * 10 + second;
			} else
				score = second * 10 + first;
			
			
			if (score == 21)
				thistime = score * 100;
			if (first == second) 
				thistime = score * 10;
			
			if(player == 1) {
				write("Your die is " + score);
			} else
				write("Computer has " + score);
			
			player = 1- player;
		}
		
		if (player == 1) {
			write("You win!");
		} else
			write("You lose!");
	}

}
