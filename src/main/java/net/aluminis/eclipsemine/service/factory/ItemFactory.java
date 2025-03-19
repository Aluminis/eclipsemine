package net.aluminis.eclipsemine.service.factory;

import com.google.inject.Inject;
import net.aluminis.eclipsemine.annotation.ModId;
import net.aluminis.eclipsemine.model.item.AbstractItem;
import net.aluminis.eclipsemine.service.provider.ItemsProvider;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;


public class ItemFactory {

    @Inject
    public ItemFactory(@ModId String modId, ItemsProvider provider) {
        for (AbstractItem item : provider.get()) {
            this.registerItem(modId, item);
        }
    }

    private void registerItem(String modId, AbstractItem item) {
        final RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(modId, item.name));
        final Item.Settings newSettings = item.settings.registryKey(itemKey);
        final Item minecraftItem = new Item(newSettings);

        Registry.register(Registries.ITEM, itemKey, minecraftItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(minecraftItem));
    }
}
