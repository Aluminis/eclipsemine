package net.aluminis.eclipsemine.model.listener;

import net.fabricmc.fabric.api.event.Event;

public abstract class AbstractListener<E> {
    public Event<E> event;

    public AbstractListener(Event<E> event) {
        this.event = event;
    }

    public abstract E on();


    public void register() {
        event.register(on());
    }
}
