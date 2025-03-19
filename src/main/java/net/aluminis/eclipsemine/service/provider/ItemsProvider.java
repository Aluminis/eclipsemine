package net.aluminis.eclipsemine.service.provider;

import com.google.inject.Provider;
import net.aluminis.eclipsemine.model.item.AbstractItem;
import net.aluminis.eclipsemine.model.item.Ruby;

import java.util.Set;

public class ItemsProvider implements Provider<Set<AbstractItem>> {
    private final Set<AbstractItem> items = Set.of(new AbstractItem[]{
            new Ruby()
    });

    public Set<AbstractItem> get() {
        return this.items;
    }
}
