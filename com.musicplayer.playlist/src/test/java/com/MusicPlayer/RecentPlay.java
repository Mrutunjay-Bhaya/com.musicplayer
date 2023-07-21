package com.MusicPlayer;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class RecentPlay extends SongsLibrary {
	public Deque<String> recentplay = new ArrayDeque<>(3);
	public void recentPlaySongs(String song) {
		if (recentplay.size() == 3 && !recentplay.contains(song)) {
			recentplay.removeFirst();
		}
		if (!recentplay.contains(song)) {
			recentplay.addLast(song);
		}
		
	else  {
		recentplay.remove(song);
		recentplay.addLast(song);
	}
	
		System.out.println("Recent Play Songs: " + (recentplay.size()));
		Iterator<String> intsReverse1 = recentplay.descendingIterator();
		while (intsReverse1.hasNext()) {
			System.out.println(intsReverse1.next());}
		
		
	}
	public void playSong() {
		String songName;
		String doPlay;
		Scanner sc = new Scanner(System.in);
		System.out.print("Want To Play Music? [Y/N]: ");
		doPlay = sc.next();
		while (doPlay.equalsIgnoreCase("y")) {
			System.out.println("Below Songs Are Avaliable, Please Enter A Song: ");
			showAllSongs();
			songName = sc.next();
			if (allSongs().containsValue(songName)) {

				recentPlaySongs(songName);
				System.out.print("Want To Play Another Music? [Y/N]: ");
				doPlay = sc.next();

			} else {
				System.out.println("Oops This Song Not Avaliable");
				System.out.print("Want To Play Existing Music? [Y/N]: ");
				doPlay = sc.next();
			}
		}

		System.out.println("Thank You Visit Again!! ");
		sc.close();
	}
}