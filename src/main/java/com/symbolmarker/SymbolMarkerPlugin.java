package com.symbolmarker;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(name = "SymbolMarker")
public class SymbolMarkerPlugin extends Plugin {
	@Inject
	private Client client;

	@Inject
	private SymbolMarkerConfig config;

	@Override
	protected void startUp() throws Exception {
		log.info("Example started!");
	}

	@Override
	protected void shutDown() throws Exception {
		log.info("Example stopped!");
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged gameStateChanged) {
		if (gameStateChanged.getGameState() == GameState.LOGGED_IN) {
			log.info(config.greeting());
			client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Junjun says " + config.greeting(), null);
		}
	}

	@Provides
	SymbolMarkerConfig provideConfig(ConfigManager configManager) {
		log.info("IZZA WORKING!!!!!!!!!");
		return configManager.getConfig(SymbolMarkerConfig.class);
	}
}
