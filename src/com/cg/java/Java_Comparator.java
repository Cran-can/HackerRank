package com.cg.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//Write your Checker class here
class Checker implements Comparator<Player> {
	public int compare(Player p1, Player p2) {
		if (p1.score < p2.score) {
			return 1;
		} else if (p1.score == p2.score) {
			return (p1.name.compareTo(p2.name) > 0 ? 1 : -1);
		} else {
			return -1;
		}
	}
}

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

public class Java_Comparator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Player[] player = new Player[n];
		Checker checker = new Checker();

		for (int i = 0; i < n; i++) {
			player[i] = new Player(scan.next(), scan.nextInt());
		}
		scan.close();

		Arrays.sort(player, checker);
		for (int i = 0; i < player.length; i++) {
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}
	}
}
