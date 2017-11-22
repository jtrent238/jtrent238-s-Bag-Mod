package com.jtrent238.jtrent238bags;

import java.util.logging.Level;

import cpw.mods.fml.common.Loader;

public class ModRegistry {

	public static boolean isjtrent238youtubersLoaded;

	public static void registerMods() {

		isjtrent238youtubersLoaded = Loader.isModLoaded("jtrent238youtubers");

		if (isjtrent238youtubersLoaded) {
			
			System.out.println("jtrent238's YouTuber Mod Loaded");
			try {
	            LogHelper.log(Level.INFO, "Loaded jtrent238's YouTuber Mod");
	        }
	        catch (Exception e) {
	            LogHelper.log(Level.SEVERE, "Could not load jtrent238's YouTuber Mod");
	            e.printStackTrace(System.err);
	        }
	    
			
			}
	}

}
