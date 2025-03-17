package net.aluminis.eclipsemine.service.provider;

import com.google.inject.Provider;
import net.aluminis.eclipsemine.item.model.AbstractItem;
import net.aluminis.eclipsemine.item.model.Ruby;

import java.util.Set;

public class ItemsProvider implements Provider<Set<AbstractItem>> {
    private Set<AbstractItem> items = Set.of(new AbstractItem[]{
            new Ruby()
    });

    public Set<AbstractItem> get() {
        return this.items;
    }
}
