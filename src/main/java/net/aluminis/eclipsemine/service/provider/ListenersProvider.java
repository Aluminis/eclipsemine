package net.aluminis.eclipsemine.service.provider;

import com.google.inject.Provider;
import net.aluminis.eclipsemine.model.listener.AbstractListener;
import net.aluminis.eclipsemine.model.listener.PlayerBlockBreakListener;

import java.util.Set;

public class ListenersProvider implements Provider<Set<AbstractListener<?>>> {
    private final Set<AbstractListener<?>> listeners = Set.of(new AbstractListener<?>[]{
            new PlayerBlockBreakListener(),
    });

    @Override
    public Set<AbstractListener<?>> get() {
        return listeners;
    }
}
