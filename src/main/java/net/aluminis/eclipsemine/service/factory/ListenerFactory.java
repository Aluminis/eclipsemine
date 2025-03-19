package net.aluminis.eclipsemine.service.factory;

import com.google.inject.Inject;
import net.aluminis.eclipsemine.model.listener.AbstractListener;
import net.aluminis.eclipsemine.service.provider.ListenersProvider;

public class ListenerFactory {

    @Inject
    public ListenerFactory(ListenersProvider provider) {
        for (AbstractListener<?> listener : provider.get()) {
            listener.register();
        }
    }
}
