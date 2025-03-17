package net.aluminis.eclipsemine.item.model;

import net.minecraft.item.Item;

public abstract class AbstractItem {
    public final String name;
    public final Item.Settings settings;

    public AbstractItem(String name, Item.Settings settings) {
        this.name = name;
        this.settings = settings;
    }
}
