package com.symbolmarker;

import java.awt.Dimension;
import java.awt.Graphics2D;

import com.google.inject.Inject;

import ch.qos.logback.core.net.server.Client;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;

public class SymbolMarkerOverlay extends Overlay {

    private final Client client;
    private final SymbolMarkerPlugin plugin;

    @Inject
    public SymbolMarkerOverlay(Client client, SymbolMarkerPlugin plugin) {
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.ABOVE_SCENE);
        this.client = client;
        this.plugin = plugin;
    }

    @Override
    public Dimension render(Graphics2D graphics) {
        // TODO Auto-generated method stub
        return null;
    }

}
