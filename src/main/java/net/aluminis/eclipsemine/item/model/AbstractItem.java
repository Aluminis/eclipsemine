package net.aluminis.eclipsemine.item.model;

import net.minecraft.item.Item;

public abstract class AbstractItem extends Item {
    public final String name;

    public AbstractItem(String name, Settings settings) {
        super(settings);
        this.name = name;
    }
}
