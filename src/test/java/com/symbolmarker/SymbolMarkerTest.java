package com.symbolmarker;

import com.symbolmarker.SymbolMarkerPlugin;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class SymbolMarkerTest {
	public static void main(String[] args) throws Exception {
		ExternalPluginManager.loadBuiltin(SymbolMarkerPlugin.class);
		RuneLite.main(args);
	}
}