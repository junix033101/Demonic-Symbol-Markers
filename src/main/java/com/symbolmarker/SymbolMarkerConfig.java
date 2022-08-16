package com.symbolmarker;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("marker")
public interface SymbolMarkerConfig extends Config {
	@ConfigItem(keyName = "greeting", name = "Welcome Greeting", description = "The message to show to the user when they login")
	default String greeting() {
		return "Im cumming";
	}

	@ConfigItem(keyName = "showMarkerTimerDecimal", name = "Show Marker Timer Decimal", description = "Shows the tenth of seconds decimal on the marker timers.")
	default boolean showMarkerTimerDecimal() {
		return true;
	}

}
