package net.aluminis.eclipsemine.model.listener;

import net.aluminis.eclipsemine.EclipseMineInitializer;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;

public class PlayerBlockBreakListener extends AbstractListener<PlayerBlockBreakEvents.Before> {
    public PlayerBlockBreakListener() {
        super(PlayerBlockBreakEvents.BEFORE);
    }

    @Override
    public PlayerBlockBreakEvents.Before on() {
        return (world, player, blockPos, blockState, blockEntity) -> {
            EclipseMineInitializer.LOGGER.info("{} Tried to break a {}", player.getName().toString(), blockState.getBlock().getName().toString());

            return true;
        };
    }
}
