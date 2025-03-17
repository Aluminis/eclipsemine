package net.aluminis.eclipsemine.service.factory;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.aluminis.eclipsemine.annotation.ModId;
import net.aluminis.eclipsemine.item.model.AbstractItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import static net.aluminis.eclipsemine.EclipseMineInitializer.LOGGER;

public class ItemFactory {

    @Inject
    public ItemFactory(@ModId String modId) {
        LOGGER.info(modId);
        /*for (AbstractItem item : items.get()) {
            this.registerItem(modId, item);
        }*/
    }

    private void registerItem(String modId, AbstractItem item) {
        final RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(modId, item.name));

        Registry.register(Registries.ITEM, itemKey, item);
    }
}
