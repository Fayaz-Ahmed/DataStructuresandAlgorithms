package Practise;

import java.io.*;
import java.util.*;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        if (a.score != b.score) {
            return b.score - a.score;
        } else {
            return a.name.compareTo(b.name);
        }
    }
}

public class SolutionFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] players = new Player[n];
        for (int i = 0; i < n; i++) {
            players[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(players, new Checker());
        for (int i = 0; i < players.length; i++) {
            System.out.printf("%s %s\n", players[i].name, players[i].score);
        }
    }
}

