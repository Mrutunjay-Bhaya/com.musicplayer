package com.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.MusicPlayer.RecentPlay;

public class TestCase {
	
	@Test
	public void playsong(){
		RecentPlay cd = new RecentPlay();
		cd.playSong();
		Assert.assertEquals(cd.recentplay.size(), 3);
	}
	
		
	
}