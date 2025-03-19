package net.aluminis.eclipsemine.model.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;

public class Ruby extends AbstractItem {
    public Ruby() {
        super("ruby", new Item.Settings().maxCount(64).food(new FoodComponent(6,10,true)));
    }
}
