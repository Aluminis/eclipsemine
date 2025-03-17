package net.aluminis.eclipsemine.service.provider;

import com.google.inject.Provider;
import net.aluminis.eclipsemine.item.model.AbstractItem;
import net.aluminis.eclipsemine.item.model.Ruby;

public class ItemsProvider implements Provider<AbstractItem[]> {
    public AbstractItem[] get() {
        return new AbstractItem[]{
            new Ruby(),
        };
    }
}
